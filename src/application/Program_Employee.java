package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_Employee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			lista.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idEmployee = sc.nextInt();

		// int aux = lista.getId().indexOf(idEmployee);
		Employee posicao = lista.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

		if (posicao == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print(""
					+ "Enter the percentage: ");
			double p = sc.nextDouble();
			posicao.increaseSalary(p);
		}

		System.out.println();
		for (Employee e : lista) {
			System.out.println(e);
		}

		sc.close();

	}

}
