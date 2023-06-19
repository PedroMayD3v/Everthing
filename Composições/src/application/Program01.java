package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enumerated.entities.OrderStatus;

public class Program01 {

	public static void main(String[] args)   throws ParseException {
		Scanner sc  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data: ");
		System.out.println();
		System.out.println("Client name: ");
		String clientName = sc.nextLine();
		System.out.println("Client email: ");
		String clientEmail = sc.nextLine();
		System.out.println("Enter the birthdate: ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(clientName, clientEmail, birthDate);
		
		System.out.println("Enter the order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); //Chamando e definidndo um tipo enumerado para valor string
		Order order = new Order(new Date(), status, client);
		
		
		System.out.println();
		System.out.println("How many items to this order?: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #" + i + " Item data: ");
			System.out.print("Product Name: ");
			String prodName = sc.nextLine();
			sc.nextLine();
			System.out.println("Product price: ");
			double prodPrice = sc.nextDouble();  //Devo instanciar o objeto da classe de produtos, pq a classse prodcut delega isso
			sc.nextLine();
			Product prod = new Product(prodName, prodPrice);
			System.out.println("Quantity: ");
			int prodQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(prodPrice, prodQuantity, prod); //Delegando a classe de arrays os atributos preço e quantidade pois ela e responsavel pela soma
		  
		    order.addItem(orderItem); //Como a lista de orderitems esta na classe order, manipulamos a lista pela mesma
		    
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
		
		
		
		
	}

}
