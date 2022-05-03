package main;

import java.util.ArrayList;

import empregado.Empregado;
import empregado.EmpregadoComissionado;
import empregado.EmpregadoHorista;

public class Main {

	public static void main(String[] args) {
		
		//array redimensionável
		ArrayList<Empregado> lista = new ArrayList<>();
		lista.add(new EmpregadoComissionado(1, "x", 1000, 10));
		lista.add(new EmpregadoHorista(2, "y", 40, 100));
		
		//for tradicional
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));  //toString()
		}
		
		//for genérico --> foreach --> percorre tudo
		for (Empregado empregado : lista) {
			System.out.println(empregado); //toString()
		}
	}

}
