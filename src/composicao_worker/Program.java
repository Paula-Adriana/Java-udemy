package composicao_worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		int count = 1;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter departament's name: ");
		String departament = entrada.next();

		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		String workerName = entrada.next();

		System.out.print("Level: ");
		String workerLevel = entrada.next();

		System.out.print("Base salary: ");
		double baseSalary = entrada.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departament));

		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = entrada.nextInt();

		while (count <= numberOfContracts) {
			System.out.println("Enter contract #" + count + " data: ");
			
			Date contractDate = null;
			try {
				System.out.print("Date (DD/MM/YYYY): ");
				contractDate = dateFormat.parse(entrada.next());
			} catch (ParseException e) {
				System.out.println("Formato de data inválido.");
			}

			System.out.print("Value per hour: ");
			double valuePerHour = entrada.nextDouble();

			System.out.print("Duration (hours): ");
			int hours = entrada.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			count++;
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String data = entrada.next();
		String [] partes = data.split("/");
		
		int mes = Integer.parseInt(partes[0]);
		int ano = Integer.parseInt(partes[1]);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for " + mes + "/" + ano + ": "+ worker.income(mes,ano));
		entrada.close();
	}

}
