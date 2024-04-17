package imposto_abstrato;

public class PessoaFisica extends Pessoa{

	private Double saude;

	public PessoaFisica(String nome, Double rendaAnual, Double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public Double imposto() {
		double imposto;
		double renda = super.getRendaAnual();
		if (renda < 20000) {
			imposto = renda * 0.15;
		} else {
			imposto = renda * 0.25;
		}
		
		if (saude != null) {
			imposto -= saude * 0.5;
		}
		return imposto;
	}
	
	
}
