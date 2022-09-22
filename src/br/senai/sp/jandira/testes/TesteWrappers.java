package br.senai.sp.jandira.testes;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		
		Integer b = 5;
		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setDescricao("não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade("Gastrienterologia");
		e2.setDescricao("Não deixa ter dor de barriga");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ficar com dor nas costas");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Clinico geral");
		e4.setDescricao("Sabe de tudo um pouco e um pouco de tudo");
	
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescricao("Sabe cuidar das criancinhas!");
	
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
	
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		notas.add(25);
		notas.add(60);
		System.out.println(notas.size());
		
		notas.add(28);
		notas.add(9);
		System.out.println(notas.size());
		
		//Imprimir nome da especialidade na posição 3 no Arraylist
		System.out.println(especialidades.get(3).getNome());
	
		// Trocar nome da especialidade que está na posição 1 para "teste" e exibir
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
	
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		nova.setNome("Não é mais fisio!");
		
		System.out.println(nova.getNome());
		
		Especialidade xy = new Especialidade();
		
		
	}

}
