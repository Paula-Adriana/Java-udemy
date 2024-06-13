package interface_exercicio;

import java.time.LocalDate;

public class ContratoServico {

	private PagamentoOnline pagamentoOnline;
	
	public ContratoServico(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	public void processamento(Contrato contrato, Integer months) {
		
		double valorInicial = contrato.getTotal() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dataLimite = contrato.getData().plusMonths(i);
			
			double juro = pagamentoOnline.juros(valorInicial, i);
			double taxa = pagamentoOnline.tax(valorInicial + juro);
			double quota = valorInicial + juro + taxa;
			
			contrato.getParcela().add(new Parcela(dataLimite, quota));
			
		}
	}
}
