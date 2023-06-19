package com.br.Devign;

import java.util.Locale;
import java.util.Scanner;
import entidades.Account;

public class Bank {

	public static void main(String[] args) {
		
		
		double acountNumber = 0;
		String acountName = null;
		double initialDeposit = 0;
		double addMoney = 0;
		double removeMoney = 0;
		
		final var localeBr = new Locale("pt", "BR");
		Scanner sc = new Scanner(System.in);
		Account account = new Account(acountNumber, initialDeposit, acountName);

		System.out.print("Bem vindo, digite o seu nome: ");
		acountName = sc.nextLine();
		account.setAcountName(acountName);
		System.out.print("Digite o numero de sua conta: ");
		acountNumber = sc.nextDouble();
		account.setAcountNumber(acountNumber);
		System.out.print("Digite o deposito inicial: ");
		initialDeposit = sc.nextDouble();
		account.setInitialDeposit(initialDeposit);
		System.out.println();
		System.out.println();
		System.out.printf("Olá, bem vindo: " + account.getAcountName() + " Seu saldo atual é de: " + account.getInitialDeposit());
		
		System.out.println();		
			 
			System.out.println("Entre com um valor a ser depositado: ");
			addMoney = sc.nextDouble();
			account.setAddMoney(addMoney, initialDeposit);
			
			System.out.println("Updated data: ");
			System.out.print("Account " + account.getAcountNumber() + " Usuario: " + account.getAcountName() + " Saldo atual: " + account.getAddMoney());
			System.out.println();
			System.out.println("Digite um valor de saque: ");
			removeMoney = sc.nextDouble();
			account.setRemoveMoney(removeMoney, initialDeposit);
		
		
			System.out.println("Updated data: ");
			System.out.print("Account " + account.getAcountNumber() + " Usuario: " + account.getAcountName() + " Saldo atual: " + account.getRemoveMoney());
			System.out.println();

		sc.close();

	}

}
