package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc2 = new SavingsAccount(1002, "Maria", 2000.0, 0.01);

		Account acc3 = new BussinesAccount(1003, "Bob", 1000.0, 500.0);

		SavingsAccount acc4 = new SavingsAccount(1005, "Kokokkok", 80000.0, 0.01);

		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BussinesAccount(1002, "Bob", 500.0, 200.0));
		list.add(new SavingsAccount(1003, "Maria", 500.0, 0.01));
		list.add(new BussinesAccount(1004, "Ana", 500.0, 200.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
			System.out.println("Updated balance: " + acc.getBalance() + " Number: " + acc.getNummber());
		}

		
		
		
		/*
		 * EXEMPLO DE DOWNCASTING if (acc3 instanceof BussinesAccount) {
		 * 
		 * // Verifica se acc3 é uma instância de BusinessAccount
		 * 
		 * BussinesAccount acc5 = (BussinesAccount) acc3; // Faz o downcast de acc3 para
		 * BusinessAccount e atribui a acc5
		 * 
		 * acc5.loan(20); // Chama o método loan() específico da classe BusinessAccount
		 * usando acc5 // para conceder um empréstimo de 200 unidades monetárias
		 * 
		 * double balance = acc5.getBalance(); // Obtém o saldo da conta usando o método
		 * getBalance() de acc3 (ou acc5) // e armazena na variável balance
		 * 
		 * System.out.println("Balance: " + balance); // Imprime o saldo obtido
		 * anteriormente }
		 */

	}

}