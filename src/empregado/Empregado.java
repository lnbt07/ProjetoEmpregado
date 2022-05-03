package empregado;

public abstract class Empregado { // extends Object --> a classe Empregado herda apenas m�todos
	private long matricula;
	private String nome;

	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	// abstrato --> m�todo que n�o tem c�digo na superclasse --> ser� implementado
	// nas subclasses
	public abstract double calcularSalario();

	@Override
	public String toString() {
		return matricula+"\n"+nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
