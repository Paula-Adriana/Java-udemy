package herenca_product;

public class ImportedProduct extends Product {

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
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + super.getPrice() + " (Customs fee: $ " + customsFee + ")";
	}
	
	public final Double totalPrice() {
		return super.getPrice() + customsFee;
	}
}
