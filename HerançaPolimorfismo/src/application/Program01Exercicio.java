package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

public class Program01Exercicio {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product # " + (i +1) + " data");
			System.out.println("Common, used or imported? (c/u/i)");
			char type = sc.next().charAt(0);
			System.out.print("Name product: ");
			String nameProduct = sc.nextLine();
			sc.nextLine();
			System.out.print("Price product: ");
			Double price = sc.nextDouble();
			if (type == 'i') {
				System.out.println("Customs fee: ");
				Double fee = sc.nextDouble();
				Product imported = new ImportedProduct(nameProduct, price, fee);
				list.add(imported);

			} else if (type == 'u') {
				System.out.println("Manufacutered data (DD/MM/YYYY): ");
				String dt = sc.next();
				LocalDate date = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Sempre usar DateTimeFormatter para formatação do usuario
				                                                                                 //Boa praticar incluir o Formatter dentro do .parse 
				Product used = new UsedProducts(nameProduct, price, date);
				list.add(used);

			} else {
				Product prod = new Product(nameProduct, price);
				list.add(prod);

			}
			
			}
		
		System.out.println("Price Tags: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());

		}
		
		sc.close();

	}
}