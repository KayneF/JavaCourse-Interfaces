package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "/home/kayne/temp/input.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employee = br.readLine();
			while (employee != null) {
				String[] fields = employee.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employee = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName()
						+ ", " + emp.getSalary());
			}
		}
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
