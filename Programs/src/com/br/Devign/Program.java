package com.br.Devign;
import java.util.Scanner;
import entidades.Aplication;

public class Program {

	public static void main(String[] args) {
		
		String name = null;
		String nameProduct = null;
		double quantity = 0;
		int sales = 0;
		double price = 0;
		
		Scanner sc = new Scanner(System.in);
		Aplication app = new Aplication(name, nameProduct, quantity, sales, price);
		
		
		System.out.print("Enter Enterprise Name: ");
		name = sc.nextLine();
		app.setEnterpriseName(name);
		System.out.println("Bem vindo(a), " + app.getEnterpriseName());
		System.out.print("Entre com a quantidade em estoque: ");
		app.quantity = sc.nextDouble();
		System.out.print("Entre com o preço: ");
		app.price = sc.nextDouble();
		System.out.println("Update data - Você tem: " + app.quantity + " Procuts" + " Com valor total de estoque: $ " + app.priceResult());
		
		
		while(app.quantity > 0) {
			
			System.out.println("Quantas vendas você fez essa semana: ");
			app.sales = sc.nextInt();
			System.out.println("Update - você tem no estoque: " + app.addProducts(sales) + " Com esse preço $: " +  app.priceResult());
			
			if (app.quantity <= 0) {
				
				System.out.println("Todos vendidos.");
				break;
			}
			
			
		}
		
		

	}

}
