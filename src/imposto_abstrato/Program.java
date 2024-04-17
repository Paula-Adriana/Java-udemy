package imposto_abstrato;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("#,#00.00");
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println("Tax payer # " + i + " data: " );
			System.out.print("Individual or company (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, income, health));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new PessoaJuridica(name, income, employees));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $ " + df.format(pessoa.imposto()));
			sum += pessoa.imposto();
		}
		System.out.println("TOTAL TAXES: " + sum);
		
		sc.close();
	}

}
