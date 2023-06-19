package entidades;

public class Aplication {

	public String nameProduct;
	private String name;
	public double quantity;
	public double price;
	public int sales;
	

	
	public Aplication(String name, String nameProduct, double quantity, int sales, double price) {
		this.nameProduct = name;
		this.quantity = quantity;
		this.name = name;
		this.sales = sales;
		this.price = price;
		
    }
	
	public Aplication() {	
	}
	
	public String getEnterpriseName() {
		return name;
    }
	
	public void setEnterpriseName(String name) {
		this.name = name;
		
	}
	
	public double priceResult() {
		return this.quantity * price;
		
	}
	
	public double addProducts(int quantity) {
		return this.quantity -= sales;
		
	}
}
