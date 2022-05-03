package empregado;

public final class EmpregadoComissionado extends Empregado {

	private double totalDeVendas;
	private double comissao;	
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return totalDeVendas*comissao/100;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+totalDeVendas+"\n"+comissao;
	}

}
