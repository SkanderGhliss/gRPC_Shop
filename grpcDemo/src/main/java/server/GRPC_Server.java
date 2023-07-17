package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import shop.ShopService;

public class GRPC_Server{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("Starting GRPC Server...");
		Server server = ServerBuilder.
				forPort(9090).addService(new ShopService()).build();
		
		server.start();
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();
	}
}