package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	
	/**
	 * Utilizamos a interface "Comparable", para comparar classes e objetos
	 * criados, assim sendo possível comparar atravéz de qualquer um dos 
	 * atributos da classe.
	 * A interface é implementada diretamenta na propria classe em que será
	 * utilizada.
	 */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "/home/kayne/temp/input.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		}
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
