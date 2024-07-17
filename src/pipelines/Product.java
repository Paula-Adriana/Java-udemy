package pipelines;

import java.text.DecimalFormat;

public class Product {

	private static final DecimalFormat df = new DecimalFormat("R$ #.00");
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
    public static String formatPrice(double price) {
        return df.format(price);
    }
	
	@Override
	public String toString() {
		return name + ", " + formatPrice(price);
	}
}
