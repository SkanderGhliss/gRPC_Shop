package shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.skander.grpc.Shop.APIResponse;
import com.skander.grpc.Shop.CreateItemRequest;
import com.skander.grpc.Shop.CreateOrderRequest;
import com.skander.grpc.Shop.Empty;
import com.skander.grpc.Shop.ItemIdRequest;
import com.skander.grpc.Shop.ItemListResponse;
import com.skander.grpc.Shop.ItemResponse;
import com.skander.grpc.Shop.LoginRequest;
import com.skander.grpc.Shop.OrderIdRequest;
import com.skander.grpc.Shop.OrderListResponse;
import com.skander.grpc.Shop.OrderResponse;
import com.skander.grpc.Shop.OrderedItem;
import com.skander.grpc.shopGrpc.shopImplBase;

import de.home.vs.model.Item;
import de.home.vs.model.OrderItem;
import de.home.vs.model.OrderModel;
import de.home.vs.rest_service_app.ItemService;
import de.home.vs.rest_service_app.OrderService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ShopService extends shopImplBase {

	private final ItemService itemService;
	private final OrderService orderService;

	public ShopService() {
		itemService = new ItemService();
		orderService = new OrderService();
	}

	@Override
	public void getAllItems(Empty request, StreamObserver<ItemListResponse> responseObserver) {

		System.out.println("getALLItems() called ...");
		try {
			ItemListResponse.Builder itemListBuilder = ItemListResponse.newBuilder();
			ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
			ItemResponse itemResponse = null;

			List<Item> items = itemService.getAllItems();
			for (Item s : items) {
				itemResponse = itemBuilder.setId(s.getId()).setName(s.getName()).setPrice(s.getPrice()).build();

				itemListBuilder.addItems(itemResponse);
			}
			ItemListResponse itemListResponse = itemListBuilder.build();

			responseObserver.onNext(itemListResponse);
			responseObserver.onCompleted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getItemById(ItemIdRequest request, StreamObserver<ItemResponse> responseObserver) {
		int id = request.getId();

		System.out.println("getItemById() called ...");
		Item item = itemService.getItemById(id);
		ItemResponse.Builder responseBuilder = ItemResponse.newBuilder();
		ItemResponse itemResponse = responseBuilder.setId(item.getId()).setName(item.getName())
				.setDescription(item.getDescription()).setPrice(item.getPrice()).build();
		responseObserver.onNext(itemResponse);
		responseObserver.onCompleted();
	}

	@Override
	public void createItem(CreateItemRequest request, StreamObserver<ItemResponse> responseObserver) {
		try {
			ItemResponse.Builder responseBuilder = ItemResponse.newBuilder();

			int lastID = itemService.getLastId();
			int newID = lastID + 1;

			String name = request.getName();
			String description = request.getDescription();
			double price = request.getPrice();

			Item newItem = new Item(newID, name, description, price);

			// Save the new item to the prefill data storage
			itemService.createItem(newItem); // Implement this method according to your storage mechanism

			ItemResponse itemResponse = responseBuilder.setId(newID).setName(name).setDescription(description)
					.setPrice(price).build();

			responseObserver.onNext(itemResponse);
			responseObserver.onCompleted();

			System.out.println("New item added: " + newItem.toString());
		} catch (Exception e) {
			// Handle any exceptions or errors that occur during the process
			e.printStackTrace();
			// Send an error response to the client if needed
			responseObserver.onError(Status.INTERNAL.withDescription("Error creating item").asRuntimeException());
		}
	}

	@Override
	public void deleteItem(ItemIdRequest request, StreamObserver<Empty> responseObserver) {
		// Something
	}

	@Override
	public void getAllOrders(Empty request, StreamObserver<OrderListResponse> responseObserver) {
		System.out.println("getAllOrders() Called...");

		OrderListResponse.Builder orderListBuilder = OrderListResponse.newBuilder();
		// OrderModel order = orderService.getOrderById(0);
		List<OrderModel> orders = orderService.getAllOrders();

		for (OrderModel o : orders) {
			OrderResponse.Builder orderBuilder = OrderResponse.newBuilder();
			orderBuilder.setId(o.getId()).setTotalPrice(calculateTotalPrice(o.getOrderItems()));

			Set<Integer> itemIds = new HashSet<>(); // Track added item IDs

			for (OrderItem oI : o.getOrderItems()) {
				int itemId = oI.getItem().getId();

				if (!itemIds.contains(itemId)) { // Check if item ID is already added
					ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
					ItemResponse itemResponse = itemBuilder.setId(itemId).setName(oI.getItem().getName())
							.setPrice(oI.getItem().getPrice()).build();

					OrderedItem.Builder orderedItemBuilder = OrderedItem.newBuilder();
					OrderedItem orderedItem = orderedItemBuilder.setItem(itemResponse).setQuantity(oI.getQuantity())
							.build();

					orderBuilder.addOrderedItems(orderedItem);
					itemIds.add(itemId); // Add the item ID to the set
				}
			}

			OrderResponse orderResponse = orderBuilder.build();
			orderListBuilder.addOrders(orderResponse);
			System.out.println(orderListBuilder);
		}

		OrderListResponse orderListResponse = orderListBuilder.build();
		responseObserver.onNext(orderListResponse);
		responseObserver.onCompleted();
	}

	private double calculateTotalPrice(List<OrderItem> orderItems) {
		double totalPrice = 0.0;
		for (OrderItem oI : orderItems) {
			totalPrice += oI.getQuantity() * oI.getItem().getPrice();
		}
		return totalPrice;
	}

	@Override
	public void getOrderById(OrderIdRequest request, StreamObserver<OrderResponse> responseObserver) {
		System.out.println("getOrderById() Called...");

		int id = request.getId();

		OrderModel order = orderService.getOrderById(id);
		if (order != null) {
			OrderResponse.Builder orderBuilder = OrderResponse.newBuilder();
			orderBuilder.setId(order.getId()).setTotalPrice(calculateTotalPriceOrder(order.getOrderItems()));

			List<OrderedItem> orderedItemsList = new ArrayList<>(); // Track added ordered items

			for (OrderItem oI : order.getOrderItems()) {
				int itemId = oI.getItem().getId();

				ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
				ItemResponse itemResponse = itemBuilder.setId(itemId).setName(oI.getItem().getName())
						.setPrice(oI.getItem().getPrice()).setDescription(oI.getItem().getDescription()).build();

				OrderedItem.Builder orderedItemBuilder = OrderedItem.newBuilder();
				OrderedItem orderedItem = orderedItemBuilder.setItem(itemResponse).setQuantity(oI.getQuantity())
						.build();

				orderedItemsList.add(orderedItem);
			}

			orderBuilder.addAllOrderedItems(orderedItemsList);

			OrderResponse orderResponse = orderBuilder.build();
			System.out.println(orderResponse);
			responseObserver.onNext(orderResponse);
			responseObserver.onCompleted();
		} else {
			// Order not found, handle the error or return an appropriate response
		}
	}

	private double calculateTotalPriceOrder(List<OrderItem> orderItems) {
		double totalPrice = 0.0;
		for (OrderItem oI : orderItems) {
			totalPrice += oI.getQuantity() * oI.getItem().getPrice();
		}
		return totalPrice;

	}

	@Override
	public void createOrder(CreateOrderRequest request, StreamObserver<OrderResponse> responseObserver) {
		System.out.println("createOrder() Called...");

		List<OrderItem> orderItems = new ArrayList<>();
		for (OrderedItem orderedItem : request.getOrderItemsList()) {
			int itemId = orderedItem.getItem().getId();
			int quantity = orderedItem.getQuantity();
			Item item = itemService.getItemById(itemId);
			if (item != null) {
				OrderItem orderItem = new OrderItem(item, quantity);
				orderItems.add(orderItem);
			}
		}

		// Create the new order
		int lastOrderID = orderService.getLastOrderId();
		int newOrderId = lastOrderID + 1;
		OrderModel newOrder = new OrderModel(newOrderId, orderItems);
		orderService.addOrder(newOrder);
		// Prepare the response
		OrderResponse.Builder orderResponseBuilder = OrderResponse.newBuilder();
		orderResponseBuilder.setId(newOrder.getId()).setTotalPrice(calculateTotalPrice(newOrder.getOrderItems()));

		List<OrderedItem> orderedItemsList = new ArrayList<>();
		for (OrderItem oI : newOrder.getOrderItems()) {
			ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
			ItemResponse itemResponse = itemBuilder.setId(oI.getItem().getId()).setName(oI.getItem().getName())
					.setPrice(oI.getItem().getPrice()).build();

			OrderedItem.Builder orderedItemBuilder = OrderedItem.newBuilder();
			OrderedItem orderedItem = orderedItemBuilder.setItem(itemResponse).setQuantity(oI.getQuantity()).build();

			orderedItemsList.add(orderedItem);
		}

		orderResponseBuilder.addAllOrderedItems(orderedItemsList);

		OrderResponse orderResponse = orderResponseBuilder.build();
		System.out.println("order " + orderResponse + "  added");

		responseObserver.onNext(orderResponse);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteOrder(OrderIdRequest request, StreamObserver<Empty> responseObserver) {
		// Something
	}

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Login Function");

		String user = request.getUsername();
		String pass = request.getPassword();

		APIResponse.Builder response = APIResponse.newBuilder();

		if (user.equals("Skander") && pass.equals("1234")) {
			System.out.println("PASST!");

			response.setResponsemessage("Correct!!!");
		} else {
			System.out.println("FALSCH!!");

			response.setResponsemessage("Wrong, try again!!!");
		}
		;

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {

	}

}