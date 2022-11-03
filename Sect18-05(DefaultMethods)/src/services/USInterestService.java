package services;

public class USInterestService implements InterestService {

	private double interestRate;

	public USInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
