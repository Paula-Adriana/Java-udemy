package interface_exercicio;

public class PaypalService implements PagamentoOnline {

	@Override
	public Double tax(double amount) {
		return amount * 0.02;
	}

	@Override
	public Double juros(double amount, int months) {
		return amount * months * 0.01;
	}

}
