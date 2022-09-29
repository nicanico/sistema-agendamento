package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		//Criar um objeto plano de saúde
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperadora("Unimed");
		planoDeSaude.setCategoria("Bronze");
		planoDeSaude.setNumero("3658-7854-222-33");
		planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));
		
		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		planoDeSaude2.setOperadora("Bradesco");
		planoDeSaude2.setCategoria("Bronze");
		planoDeSaude2.setNumero("4562-7854-222-63");
		planoDeSaude2.setValidade(LocalDate.of(2023, 8, 21));
		
		// Criar objeto endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elto Silva");
		endereco.setNumero("905");
		endereco.setBairro("Centro");
		endereco.setCidade("Jandira");
		endereco.setCep("06600-025");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setComplemento("Instituição");
		
		// Criar objeto paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Ana Clara");
		paciente.setDataDeNascimento(LocalDate.of(1999, 1, 6));
		paciente.setCpf("455.565.789-85");
		paciente.setRg("451.485-98");
		paciente.setTelefone("(11)4156-7894");
		paciente.setPlanoDeSaude(planoDeSaude);
		paciente.setEndereco(endereco);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Carlos Pereira");
		paciente2.setDataDeNascimento(LocalDate.of(1999, 1, 6));
		paciente2.setCpf("789.236.452-11");
		paciente2.setRg("463.369-36");
		paciente2.setTelefone("(11)4156-7894");
		paciente2.setPlanoDeSaude(planoDeSaude);
		paciente2.setEndereco(endereco);
		
		// Exibir os dados do Paciente
		
		// Nome do paciente: ???
		// Telefone do paciente: ???
		// Operadora de saúde: ???
		// Categoria do plano de saúde: ???
		// Cidade do paciente: ???
		// Estado do paciente: ???
		
		System.out.println("Nome do paciente: " + paciente.getNome());
		System.out.println("Telefone do paciente: " + paciente.getTelefone());
		System.out.println("Operadora de saúde: " + paciente.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria do plano de saúde: " + paciente.getPlanoDeSaude().getCategoria());
		System.out.println("Cidade do paciente: " + paciente.getEndereco().getCidade());
		System.out.println("Estado do paciente: " + paciente.getEndereco().getEstado());
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Cuida da garganta, ouvido, etc.");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clinico Geral");
		especialidade3.setDescricao("Sabe um pouco de tudo");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Cuida dos ossos e músculos");
		
		Medico medico1 = new Medico();
		medico1.setNome("Ana maria");
		medico1.setEmail("ana@gmail.com");
		medico1.setTelefone("4587-7865");
		medico1.setCrm("45812-9");
		Especialidade[] especialidades1 = {especialidade1, especialidade3};
		medico1.setEspecialidades(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Roberto da Silva");
		medico2.setEmail("roberto@gmail.com");
		medico2.setTelefone("(11)7891-9876");
		medico2.setCrm("45879-1");
		Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3};
		medico2.setEspecialidades(especialidades2);
		
		// Exibir especialidades de cada médico
		// Nome do médico:  ???
		// Especialidade 1: ???
		// Especialidade 2: ???
		// Especialidade 3: ???
		
		System.out.println();
		System.out.println("Nome do médico: " + medico1.getNome());
		int contador = 0;
		while (contador < medico1.getEspecialidades().length) {
			System.out.println("Especialidade " + (contador + 1) + " - " + medico1.getEspecialidades()[contador].getNome());
			contador++;
		}
		
		System.out.println();
		contador = 0;
		System.out.println("Nome do médico: " + medico2.getNome());
		while (contador < medico2.getEspecialidades().length) {
			System.out.println("Especialidade " + (contador + 1) + " - " + medico2.getEspecialidades()[contador].getNome());
			contador++;
		}
		
		
		// Fazer agendamento do paciente Carlos Pereira
		// com um cardiologista para o dia 27/09/2022
		// as 14h15m
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente2);
		agenda1.setEspecialidades(especialidade1);
		agenda1.setMedico(medico1);
		agenda1.setDataDeConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHoraDaconsulta(LocalTime.of(14, 15));
		
		
		// Fazer agendamento do paciente Carlos Pereira
		// com um fisioterapeuta para o dia 12/10/2022
		// as 09h30m
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente);
		agenda2.setEspecialidades(especialidade4);
		agenda2.setMedico(medico2);
		agenda2.setDataDeConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHoraDaconsulta(LocalTime.of(9, 30));
		
		//Exibir os dados de agenda, com o nome do paciente,
		// nome do médico, nome da especialidade, data e hora
		// do agendamento e plano de saúde utilizado.
		
		System.out.println();
		System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidades().getNome());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Data da consulta: " + agenda1.getDataDeConsulta());
		System.out.println("Hora da consulta: " + agenda1.getHoraDaconsulta());
		
		System.out.println();
		System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidades().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Data da consulta: " + agenda2.getDataDeConsulta());
		System.out.println("Hora da consulta: " + agenda2.getHoraDaconsulta());
		
	}

}
