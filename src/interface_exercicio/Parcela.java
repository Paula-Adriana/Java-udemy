package interface_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

	private LocalDate dataLimite;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Parcela(LocalDate dataLimite, Double amount) {
		this.dataLimite = dataLimite;
		this.amount = amount;
	}
	public LocalDate getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(LocalDate dataLimite) {
		this.dataLimite = dataLimite;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dataLimite.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
