package interface_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor total do contrato: ");
		double total = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, total);
		
		System.out.print("Número de parcelas: ");
		int numeroDeParcela = sc.nextInt();
		
		ContratoServico service = new ContratoServico(new PaypalService());
		
		service.processamento(contrato, numeroDeParcela);
		
		System.out.println();
		System.out.println("Parcelas:");
		for (Parcela parcela : contrato.getParcela()) {
			System.out.println(parcela);
		}
	}
}
