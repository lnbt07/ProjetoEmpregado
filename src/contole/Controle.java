package contole;

import empregado.Empregado;

public class Controle {
	private Empregado[] lista;
	private int indice;
	
	public Controle(int tamanho) {
		lista = new Empregado[tamanho];
	}
	
	public void inserir(Empregado empregado) {
		if(indice < lista.length) {
			lista[indice] = empregado;
			indice++;
		}
	}
	
	public Empregado pesquisar(long matricula) {
		Empregado aux = null;
		for(int i = 0; i < indice; i++) {
			if(lista[i].getMatricula() == matricula) {
				aux = lista[i];
			}
		}
		return aux;
	}
	
}
