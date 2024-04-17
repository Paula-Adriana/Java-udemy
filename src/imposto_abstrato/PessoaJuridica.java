package imposto_abstrato;

public class PessoaJuridica extends Pessoa {

	private Integer funcionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double imposto() {
		double imposto;
		if (funcionarios < 10) {
			imposto = super.getRendaAnual() * 0.16;
		} else {
			imposto = super.getRendaAnual() * 0.14;
		}
		return imposto;
	}
}
