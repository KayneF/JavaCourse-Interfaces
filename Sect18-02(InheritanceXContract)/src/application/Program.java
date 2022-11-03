package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Color;
import model.entities.Rectangle;

public class Program {
	
	/**
	 * Existem casos, onde precisamos trabalhar com uma classe abstrata, em que,
	 * é necessário que classes especializadas, assinem métodos da classe
	 * genérica, porém, nem sempre queremos que sejam herdados atributos da 
	 * abstração. Nesse caso, podemos abstrair uma classe que possui atributos,
	 * que implementam métodos de uma interface, com isso, é possível que, 
	 * quando uma classe especializada não precise herdar um atributo, 
	 * simplesmente implementamos a interface diretamente, sem a necessidade 
	 * de herdar da classe genérica.
	 * Nesse exemplo, criamos uma classe abstrata "AbstractShape" com o atributo
	 * "Color", que implementa a interface "Shape", que possui o método 
	 * "area()". 
	 * Sabemos que todas as formas possuem uma área, porém não necessariamente
	 * possui uma cor, portanto, quando essa forma não possui cor, apenas 
	 * implementamos a interface diretamente nas classes especializadas, caso 
	 * contrário, apenas herdamos da classe genérica, a qual já implementa a 
	 * interface por padrão.
	 */

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}

}
