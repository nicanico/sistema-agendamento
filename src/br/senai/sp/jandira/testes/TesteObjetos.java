package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        
        
        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setDescricao("não deixa ter um ataque");
        
        EspecialidadeDAO.gravar(e1);

        Especialidade e2 = new Especialidade("Gastrienterologia");
        e2.setDescricao("Não deixa ter dor de barriga");
        
        EspecialidadeDAO.gravar(e2);
    
 
        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");
        EspecialidadeDAO.gravar(e4);
        
        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa!");
        EspecialidadeDAO.gravar(e3);
        Especialidade e5 = new Especialidade();
        e5.setNome("Especialidade 5");
        EspecialidadeDAO.gravar(e5);
        
         for (Especialidade ee : EspecialidadeDAO.getEspecialidades()){
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
         EspecialidadeDAO.excluir(101);
         System.out.println("--------------");
          for (Especialidade ee : EspecialidadeDAO.getEspecialidades()){
             System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        
          System.out.println("-------BUSCA-------");
          Especialidade procurada = EspecialidadeDAO.getEspecialidade(102);
          System.out.println(procurada.getNome());
          System.out.println("-------UPDATE------");
          Especialidade especialidadeAtualizada = new Especialidade();
          especialidadeAtualizada.setCodigo(102);
          especialidadeAtualizada.setNome("Otorrinolaringologia");
          especialidadeAtualizada.setDescricao("Nova descrição");
          EspecialidadeDAO.atualizar(especialidadeAtualizada);
          
          System.out.println("-------NOVA BUSCA-------");
          for (Especialidade ee : EspecialidadeDAO.getEspecialidades()){
             System.out.println(ee.getNome() + " - " + ee.getCodigo());
          }
        
        System.out.println("TOTAL ---------" + e1.getContador());
        System.out.println(e1.getCodigo() + "--" + e1.getNome());
        System.out.println(e2.getCodigo() + "--" + e2.getNome());
        System.out.println(e3.getCodigo() + "--" + e3.getNome());
        System.out.println(e4.getCodigo() + "--" + e4.getNome());
        System.out.println(e5.getCodigo() + "--" + e5.getNome());
        
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();

        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        //Imprimir no console nome das especialidades
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // Utilização do for para iteração no Arraylist
//		for(contador;condição;acumulador) {
//			
//		}
        System.out.println("-----FOR-----");
        for (int contador = 0; contador < especialidades.size(); contador++) {
            System.out.println(especialidades.get(contador).getNome());
        }

        System.out.println("------FOR EACH------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // Criar 3 planos de saúde, armazenar em um arraylist 
        //e exibir o nome da operadora de cada um deles
        PlanoDeSaude p1 = new PlanoDeSaude("Amil");
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);

        System.out.println("------OPERADORAS------");
        for (PlanoDeSaude e : planosDeSaude) {
            System.out.println(e.getOperadora());
            System.out.println(e.getQuantidade());
        }

        PlanoDeSaude xpto = new PlanoDeSaude();
        PlanoDeSaude xpto2 = new PlanoDeSaude();
        PlanoDeSaude xpto3 = new PlanoDeSaude();

        System.out.println("--------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("--------" + PlanoDeSaude.getQuantidade());
        
    }

}
