package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
	
	private LocalDate dataDeConsulta;
	private LocalTime horaDaconsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;
	
	
	public void setDataDeConsulta(LocalDate dataDeConsulta) {
		this.dataDeConsulta = dataDeConsulta;
	}
	
	public LocalDate getDataDeConsulta() {
		return dataDeConsulta;
	}
		
	public void setHoraDaconsulta(LocalTime horaDaconsulta) {
		this.horaDaconsulta = horaDaconsulta;
	}
	
	public LocalTime getHoraDaconsulta() {
		return horaDaconsulta;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
		
	public void setMedico(Medico medico) {
		this.medico = medico;
	}	
		
	public Medico getMedico() {
		return medico;
	}
	
	public void setEspecialidades(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public Especialidade getEspecialidades() {
		return especialidade;
	}
	

}
