package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	/**
	 * "Default methods" são métodos padrões que podem ser implementados 
	 * diretamente dentro de uma interface. Os mesmos podem ser reutilizados
	 * dentro das classes que à implementam, sem a necessidade de recriar o 
	 * mesmo método dentro da classe.
	 * Como diferente de classes abstratas, interfaces não podem conter
	 * atributos, elas ficam limitadas somente a implementação de métodos.
	 * Por isso, caso haja um método padrão a ser utilizado, o mesmo não poderá
	 * instanciar ou chamar qualquer atributo de outras classes, mesmo que 
	 * estáticos. Nesse caso, podemos trabalhar somente com métodos de 
	 * assinatura que já estejam implementados dentro da propria interface, ou
	 * métodos herdados de outras interfaces.
	 */

	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
