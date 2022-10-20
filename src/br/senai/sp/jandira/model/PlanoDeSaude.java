package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class PlanoDeSaude {
	
        private static int contador = 1;
        private Integer codigoDoPlano;
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
	
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		this.quantidade++;
                geradorCodigo();
	}
	public PlanoDeSaude() {
		this.quantidade++;
	}
        public PlanoDeSaude(String operdora, String categoria, String numero){
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            geradorCodigo();
        }
        
        private void geradorCodigo(){
            this.contador++;
            this.codigoDoPlano = contador;
        }
        
        public int getContador() {
            return contador;
        }
	
        public Integer getCodigo() {
            return codigoDoPlano;
        }
        
        public void setCodigo(Integer codigo){
            this.codigoDoPlano = codigo;
        }
        
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
		
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setValidade(LocalDate validade) {
		this.validade = validade;
		
	}
	
	public int getValidade() {
		Period p = Period.between(validade, LocalDate.now());
		return p.getYears();
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
}
