package entidades;

public class Account {
	
	public String acountName;
	private double acountNumber;
	private double initialDeposit;
	private double addMoney;
	private double removeMoney;
	
	public Account(double initialDeposit, double acountNumber, String acountName) {
	this.acountName = acountName;
	this.acountNumber = acountNumber;
	this.initialDeposit = initialDeposit;
	}


	
	public String getAcountName() {
		return acountName;
	}
	
	public void setAcountName(String acountName) {
	this.acountName = acountName;
   
	}
	
	public double getAcountNumber() {
	return acountNumber;
	
    }
	
	public void setAcountNumber(double acountNumber) {
		this.acountNumber = acountNumber;
		
	}
	
	public double getInitialDeposit() {
		return initialDeposit;
	}
	
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
		
	}
	
	public double getAddMoney() {
		return addMoney;
		
	}
	
	public void setAddMoney(double addMoney, double initialDeposit) {
		this.addMoney = addMoney + initialDeposit;
		
	}
	
	public double getRemoveMoney() {
		return removeMoney - 5.00;
		
	}
	
	public void setRemoveMoney(double removeMoney, double initialDeposit) {
		this.removeMoney = addMoney - removeMoney;
		
	}
}