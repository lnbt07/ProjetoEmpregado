package empregado;

public class EmpregadoHorista extends Empregado {

	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;
		
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	@Override
	public double calcularSalario() {
		return valorDaHoraTrabalhada*totalDeHorasTrabalhadas;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+totalDeHorasTrabalhadas+"\n"+valorDaHoraTrabalhada;
	}

}
