package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	static Integer quantity;
	static Double price;
	public Product product;
	
	public OrderItem(Double price, Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public static Integer getQuantity() {
		return quantity;
	}

	public static void setQuantity(Integer quantity) {
		OrderItem.quantity = quantity;
	}

	public static Double getPrice() {
		return price;
	}

	public static void setPrice(Double price) {
		OrderItem.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


  public  static Double subTotal() {
	  return price * quantity;
  }
  
  public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	//IMPORTANTE: SEMPRE GERAR UM TOSTRING PARA FORMATAR CLASSES E S
}
