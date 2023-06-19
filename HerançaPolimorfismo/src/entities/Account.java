package entities;

public abstract class Account {
	
	//Usando a apalvra-chave abstract eu faço com que a classe mae/generica
	//não possa ser instanciada, podendo assim fazer polimorfismo e reuso
	//Sem alterações na SupperClasse

	private Integer nummber;
	private String holder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer nummber, String holder, Double balance) {
		this.nummber = nummber;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNummber() {
		return nummber;
	}

	public void setNummber(Integer nummber) {
		this.nummber = nummber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
		
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
}
