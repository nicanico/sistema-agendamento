package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		// Especialidade
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("O Cardiologista é aquele que cuida da saúde do coração.");
		
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Responsavel que cuida das doenças dos ouvidos, nariz, garganta, etc.");
		
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
		
		System.out.println(especialidade2.getNome());
		System.out.println(especialidade2.getDescricao());
		
		//Plano de Saude
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Amil Saude");
		
		System.out.println(plano.getOperadora());
	}

}
