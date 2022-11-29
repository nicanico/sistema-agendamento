package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private static int contador = 100;
    private Integer codigoDoMedico;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    
    
    //Construtores
    
    public Medico(String nome){
       this.nome = nome;
       gerarCodigo();
    }
    public Medico(){
        gerarCodigo();
    }
    
    public Medico(String nome, Especialidade[] especialidades, String telefone, String email, String crm, LocalDate dataDeNascimento){
        this.nome = nome;
        this.especialidades = especialidades;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataDeNascimento = dataDeNascimento;
        gerarCodigo();
    }
    
    public Medico(String nome, Especialidade[] especialidades, String telefone, String email, String crm, LocalDate dataDeNascimento, Integer codigoDoMedico){
        this.nome = nome;
        this.especialidades = especialidades;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataDeNascimento = dataDeNascimento;
        this.codigoDoMedico = codigoDoMedico;
        this.contador = codigoDoMedico;
    }
    
    public Medico(String nome, String telefone, String email, String crm, LocalDate dataDeNascimento, Integer codigoDoMedico){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataDeNascimento = dataDeNascimento;
        this.codigoDoMedico = codigoDoMedico;
        this.contador = codigoDoMedico;
    }
    
    //Codigo
    private void gerarCodigo(){
        this.contador++;
        this.codigoDoMedico = contador;
    }
    
    public int getContador(){
        return contador;
    }
    
    public Integer getCodigo(){
        return codigoDoMedico;
    }
    public void setCodigo(Integer codigoDoMedico){
        this.codigoDoMedico = codigoDoMedico;
    }
    
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
    
    //Fortamação com ponto e virgula para DAO
    public String getFormatacaoDoMedicoComPontoEVirgula(){
     return this.codigoDoMedico + ";" + this.nome + ";" + this.email + ";" + this.telefone + ";" + this.crm + ";" + this.especialidades + ";" + this.dataDeNascimento;
        
    }
}
