package entities;

public class OutsourcedEmployee extends Employee {
	
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//NUNCA ESQUECER DE SOBREPOR METODOS DE SUBCLASSES USANDO O OVERRIDE
	//SEMPRE USAR O SUPER PARA USAR METODOS DA SUPERCLASSE
	
	@Override
	public Double payment() {
	  return super.payment() + additionalCharge * 1.1;
		
	}

	
	

}
