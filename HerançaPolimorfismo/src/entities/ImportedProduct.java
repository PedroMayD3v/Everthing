package entities;

public class ImportedProduct extends Product {
                                              //Sempre usar a palvra extends parar herdar a classe mãe
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee; //herdando a classe mae posso utilizar os seus metodos como o GETPRICE
	}

	@Override //NUNCA ESQUECER O OVERRDIE PRA SOBREPOR METODOS DA CLASSE MAE E NEM ESQUECER O TO STRING
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice())
		    + " (Customs fee: $ "
				+ String.format("%.2f", customsFee) + ")";
	}

}
