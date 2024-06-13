package interface_exercicio;

public interface PagamentoOnline {

	public Double tax(double amount);
	public Double juros(double amount, int months);
}
