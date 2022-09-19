package br.senai.sp.jandira.model;

public class Medico {
	
	private String nome;
	private Especialidade[] especialidades;
	private String telefone;
	private String email;
	private String crm;
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
		public String getNome() {
		return nome;
	}
		
	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}
	
		public Especialidade[] getEspecialidades() {
			return especialidades;
	}

		public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
		public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public String getCrm() {
		return crm;
	}

	

	
}
