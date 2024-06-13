package interface_exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private int number;
	private LocalDate data;
	private Double total;
	
	private List<Parcela> parcela = new ArrayList<>();

	public Contrato(int number, LocalDate data, Double total) {
		this.number = number;
		this.data = data;
		this.total = total;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Parcela> getParcela() {
		return parcela;
	}
}
