package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProducts extends Product {
	
	private LocalDate manufactureDate;

	public UsedProducts(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) //NUNCA ESQUECER DE FORMATAR E IMPORTAR O DATEFORMATTER EM UMA SUBLCASSE SE FOR USALO NO MAIN
				+ ")";
	}
}