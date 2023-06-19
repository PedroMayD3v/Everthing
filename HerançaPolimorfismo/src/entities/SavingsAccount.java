package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount(Integer number, String holder, Double string, Double interestRate) {
		super(number, holder, string);
		this.interestRate = interestRate;
	}

	public SavingsAccount() {
		super();
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalane() {
		balance += balance * interestRate;

	}

	// Avisar ao compilador que é uma sobreposiçao de metodos da classe matriz com @Override

	@Override
	public  void withdraw(double amount) {
		balance -= amount;

	}

}
