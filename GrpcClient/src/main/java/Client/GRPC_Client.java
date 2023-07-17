package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.skander.grpc.Shop.APIResponse;
import com.skander.grpc.Shop.CreateItemRequest;
import com.skander.grpc.Shop.CreateOrderRequest;
import com.skander.grpc.Shop.Empty;
import com.skander.grpc.Shop.ItemIdRequest;
import com.skander.grpc.Shop.ItemListResponse;
import com.skander.grpc.Shop.ItemResponse;
import com.skander.grpc.Shop.LoginRequest;
import com.skander.grpc.Shop.OrderIdRequest;
import com.skander.grpc.Shop.OrderItem;
import com.skander.grpc.Shop.OrderListResponse;
import com.skander.grpc.Shop.OrderResponse;
import com.skander.grpc.shopGrpc;
import com.skander.grpc.shopGrpc.shopBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPC_Client {
	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		shopBlockingStub clientStub = shopGrpc.newBlockingStub(channel);

		// Client starts here

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			boolean finish = false;
			while (!finish) {
				System.out.println("\r\n-----------------------------");
				System.out.println("Select an option:");
				System.out.println("0. LoginTest.");
				System.out.println("1. Inquire about a specific item.");
				System.out.println("2. Fetch all items.");
				System.out.println("3. Add new Item.");
				System.out.println("4. Make an Order.");
				System.out.println("5. Fetch all orders.");
				System.out.println("6. Inquire about a specific order.");
				System.out.println("7. exit.\r\n");

				Integer selection = scanner.nextInt();

				switch (selection) {
				case 0:
					System.out.println("Please Enter User Details:\n");

					System.out.println("Username: ");
					String user = scanner.next();
					System.out.println("Password: ");
					String pass = scanner.next();

					LoginRequest loginRequest = LoginRequest.newBuilder().setUsername(user).setPassword(pass).build();
					APIResponse response = clientStub.login(loginRequest);

					System.out.println("Sending response: \n" + response.getResponsemessage());
					break;

				case 1:
					System.out.println("\r\nEnter Item ID\r\n");
					int itemID = scanner.nextInt();
					ItemIdRequest getItem = ItemIdRequest.newBuilder().setId(itemID).build();
					ItemResponse getResponse = clientStub.getItemById(getItem);

					System.out.print(getResponse);
					break;

				case 2:
					Empty itemsRequest = Empty.newBuilder().build();
					ItemListResponse itemsResponse = clientStub.getAllItems(itemsRequest);

					// System.out.print(itemsResponse);

					for (int i = 0; i < itemsResponse.getItemsCount(); i++) {
						System.out.println("==================================");
						System.out.println("ID: " + itemsResponse.getItems(i).getId());
						System.out.println("Name: " + itemsResponse.getItems(i).getName());
						System.out.println("Price: " + itemsResponse.getItems(i).getPrice());
					}

					break;

				case 3:

					System.out.println("\r\nPlease enter Item name:\r\n");
					String itemName = scanner.next();

					System.out.println("\r\nPlease enter Item description:\r\n");
					scanner.nextLine();
					String itemDescription = scanner.nextLine();

					System.out.println("\r\nPlease enter Item price \r\n");
					Double itemPrice = scanner.nextDouble();

					CreateItemRequest createItemRequest = CreateItemRequest.newBuilder().setName(itemName)
							.setDescription(itemDescription).setPrice(itemPrice).build();
					ItemResponse getCreateResponse = clientStub.createItem(createItemRequest);
					System.out.print("\r\nYour Item Has Been Created:\r\n\r\n" + getCreateResponse + "\r\n");
					break;

				case 4:

					/**
					 * Fetching all items
					 */

					Empty fetchAllRequest = Empty.newBuilder().build();
					ItemListResponse fetchAllResponse = clientStub.getAllItems(fetchAllRequest);

					for (int i = 0; i < fetchAllResponse.getItemsCount(); i++) {
						System.out.println("==================================");
						System.out.println("Item-ID: " + fetchAllResponse.getItems(i).getId());
						System.out.println("Name: " + fetchAllResponse.getItems(i).getName());
						// System.out.println("Description: " +
						// fetchAllResponse.getItems(i).getDescription());
						System.out.println("Price: " + fetchAllResponse.getItems(i).getPrice());
					}

					/**
					 * Ordering process
					 */
					Scanner input = new Scanner(System.in);
					List<OrderItem> orderedItemsList = new ArrayList<>();

					while (true) {
						System.out.println("\nPlease enter the item ID to order:");
						int item_Id = input.nextInt();

						System.out.println("How many would you like to order from item " + item_Id + "?");
						int quantity = input.nextInt();

						ItemResponse itemOrdered = ItemResponse.newBuilder().setId(item_Id).build();

						OrderItem orderedItem = OrderItem.newBuilder().setItem(itemOrdered).setQuantity(quantity)
								.build();
						orderedItemsList.add(orderedItem);

						System.out.println("Would you like to order another item? (yes/no)");
						String answer = input.next();

						if (answer.equalsIgnoreCase("no")) {
							break;
						}
					}
					CreateOrderRequest createOrderRequest = CreateOrderRequest.newBuilder()
							.addAllOrderItems(orderedItemsList).build();

					OrderResponse getCreateOrderResponse = clientStub.createOrder(createOrderRequest);

					System.out.println("\nProcessing your order, please have patience");
					try {
						Thread.sleep(1200);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print("\r\nYour Order :\r\n\r\n" + getCreateOrderResponse + "\r\n");

					break;

				case 5:
					Empty ordersRequest = Empty.newBuilder().build();
					OrderListResponse ordersResponse = clientStub.getAllOrders(ordersRequest);

					// System.out.print(ordersResponse);

					for (int i = 0; i < ordersResponse.getOrdersCount(); i++) {
						System.out.println("==================================");
						System.out.println("Order-ID: " + ordersResponse.getOrders(i).getId());
						System.out.println("Items: " + ordersResponse.getOrders(i).getOrderItemsList());
						System.out.println("total Price: " + ordersResponse.getOrders(i).getTotalPrice());
					}
					break;
				case 6:
					System.out.println("\r\nEnter Item ID\r\n");
					int orderInquired = scanner.nextInt();

					OrderIdRequest orderIdRequest = OrderIdRequest.newBuilder().setId(orderInquired).build();
					OrderResponse orderResponse = clientStub.getOrderById(orderIdRequest);

					System.out.println("Order-ID: " + orderResponse.getId());

					List<OrderItem> orderedItemList = orderResponse.getOrderItemsList();
					if (!orderedItemList.isEmpty()) {
						System.out.println("==================================");
						System.out.println("Items:");
						System.out.println("----------------");

						for (OrderItem orderedItem : orderedItemList) {
							ItemResponse itemResponse = orderedItem.getItem();
							System.out.println("Item ID: " + itemResponse.getId());
							System.out.println("Name: " + itemResponse.getName());
							System.out.println("Price: " + itemResponse.getPrice());
							System.out.println("Description: " + itemResponse.getDescription());
							System.out.println("Quantity: " + orderedItem.getQuantity());
							System.out.println("----------------");
						}
					}

					System.out.println("Total-Price: " + orderResponse.getTotalPrice());
					System.out.println("==================================");
					break;

				default:
					finish = true;
					break;
				}
			}
		} finally {
			if (scanner != null)
				scanner.close();
		}

		try {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}