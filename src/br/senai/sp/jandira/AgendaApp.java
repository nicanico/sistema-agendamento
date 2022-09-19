package br.senai.sp.jandira;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
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
		
		// Criar objeto endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elto Silva");
		endereco.setNumero("905");
		endereco.setBairro("Centro");
		endereco.setCidade("Jandira");
		endereco.setCep("06600-025");
		endereco.setEstado("São Paulo");
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
		
		// Exibir os dados do Paciente
		
		// Nome do paciente: ???
		// Telefone do paciente: ???
		// Operadora de saúde: ???
		// Categoria do plano de saúde: ???
		// Cidade do paciente: ???
		// Estado do paciente: ???
		
		System.out.println("Nome do paciente:" + paciente.getNome());
		System.out.println("Telefone do paciente:" + paciente.getTelefone());
		System.out.println("Operadora de saúde:" + paciente.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria do plano de saúde:" + paciente.getPlanoDeSaude().getCategoria());
		System.out.println("Cidade do paciente:" + paciente.getEndereco().getCidade());
		System.out.println("Estado do paciente:" + paciente.getEndereco().getEstado());
		
		
	}

}
