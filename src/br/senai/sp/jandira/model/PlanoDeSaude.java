package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;



public class PlanoDeSaude {
	
        private static int contador = 0;
        private Integer codigoDoPlano;
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
                geradorCodigo();
	}
	public PlanoDeSaude(){
		geradorCodigo();
	}
        public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade){
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            geradorCodigo();
        }
        
        public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade, Integer codigoDoPlano){
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            this.codigoDoPlano = codigoDoPlano;
            this.contador = codigoDoPlano;
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
        
        public void setCodigo(Integer codigoDoPlano){
            this.codigoDoPlano = codigoDoPlano;
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
        
	public LocalDate getValidade() {
		return validade;
	}
	
	public String getFormatacaoDoPlanoDeSaudeComPontoEVirgula(){
            return this.codigoDoPlano + ";" + this.numero + ";" + this.categoria + ";" + this.operadora + ";" + this.validade;
        }
}
