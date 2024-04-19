package exception_exercicio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Inicial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		Account account = new Account(number, holder, balance, withdrawLimit);

		try {
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.println("New balance: " + account.getBalance());
		} catch (BalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}
}
