package application;

import devices.ComboDevice;
import devices.Printer;
import devices.Scanner;

public class Program {
	
	/**
	 * Existem situações, onde duas subclasses, herdam de uma superclasse, e ao
	 * mesmo tempo, uma outra subclasse precisa herdar dessas subclasses.
	 * Isso é chamado de "Herança multipla". Essa necessidade se torna presente, 
	 * quando uma subclasse, precisa herdar atributos e métodos de duas ou mais
	 * classes. Porém, isso gera um problema: Quando uma classe herda de outra
	 * classe, todos os atributos e métodos devem estar presente na subclasse.
	 * E como a subclasse está herdando de mais de uma classe que herda de uma 
	 * mesma superclasse que possui um ou mais métodos, essa classe é obrigada
	 * a implementar os métodos de ambas as classes. O problema, é que por ser 
	 * exatamente o mesmo método da classe mãe, passa a existir uma ambiguidade, 
	 * o que não é algo desejado. 
	 * Por essa razão, a linguagem Java (como muitas outras), não permitem a 
	 * herança multipla. 
	 * Para contornar esse problema, quando precisamos que uma classe herde
	 * atributos, e ao mesmo tempo implemente métodos sem que haja ambiguidades,
	 * criamos interfaces com assinaturas de métodos necessários, e assim, 
	 * fazemos com classes assinem esses métodos de forma individual, sem o  
	 * risco de ocorrer esse problema.
	 */

	public static void main(String[] args) {

		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}