package heranca_employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> listOfEmployees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int employees = sc.nextInt();

		for (int i = 1; i <= employees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n) ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String Name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additonal charge: ");
				double charge = sc.nextDouble();
				//criação de objeto anônimo
				listOfEmployees.add(new OutsourcedEmployee(Name, hours, valuePerHour, charge));
			} else {
				listOfEmployees.add(new Employee(Name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : listOfEmployees) {
			System.out.println("Name: " + emp.getName() + " - $ " + emp.payment());
		}

		sc.close();
	}
}
