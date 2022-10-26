
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude e) {
        
        planosDeSaude.add(e);
        
    }
    public static ArrayList<PlanoDeSaude> getPlano() {
        return planosDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigoDoPlano) {
        for(PlanoDeSaude e : planosDeSaude){
            if(e.getCodigo() == codigoDoPlano){
                return e;
        }
    }
     return null;
     
    }
   
    public static void atualizar(PlanoDeSaude planoAtualizado){
        for(PlanoDeSaude e : planosDeSaude){
            if (e.getCodigo() == planoAtualizado.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(e), planoAtualizado);
                break;
            }
        }
    }
    public static void excluirPlano(Integer codigo){
        for(PlanoDeSaude e : planosDeSaude) {
            if (e.getCodigo() == codigo){
                planosDeSaude.remove(e);
                break;
            }
        }
    }
    
    public static void criarPlanosDeSaude(){
        PlanoDeSaude plano1 = new PlanoDeSaude("Bradesco", "Bronze", "142-8954-5614-12", LocalDate.of(1998, 4, 4));
        PlanoDeSaude plano2 = new PlanoDeSaude("SulAmérica", "Gold", "1236-7895-5548", LocalDate.of(2004, 9, 5));
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Silver", "5986-326-7456", LocalDate.of(2000, 12, 25));
        
        planosDeSaude.add(plano1);
        planosDeSaude.add(plano2);
        planosDeSaude.add(plano3);
         
    }
        
    public static DefaultTableModel getTablePlanosDeSaude(){
        
        String[] titulo = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];
        
        
        for(PlanoDeSaude e : planosDeSaude){
            int i = planosDeSaude.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = e.getValidade().format(formatar);
        }
        
        return new DefaultTableModel(dados, titulo);

    }
}

