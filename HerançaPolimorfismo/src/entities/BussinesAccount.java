package entities;

public class BussinesAccount extends Account {

	private Double loanLimit;

	public BussinesAccount() {
		super();
	}

	public BussinesAccount(Integer nummber, String holder, Double balance, Double loanLimit) {
		super(nummber, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); //Sempre chamar o super caso queira a mesma regra 
		                      //Da superclasse/classe matriz;
		balance -= 2.0;

	}
}
