package composicao_order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		System.out.print("Email: ");
		String email = entrada.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(entrada.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(entrada.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many itens to this order? ");
		int count = entrada.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter #" + i +" item data: ");
			System.out.print("Product name: ");
			String productName = entrada.next();
			System.out.print("Product price: ");
			Double productPrice = entrada.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = entrada.nextInt();
			
			OrderItem oI = new OrderItem(quantity, productPrice, product);
			order.addItem(oI);
		}
		System.out.println();
		System.out.println(order);
		entrada.close();
	}
}
