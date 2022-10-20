
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;

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
    public static void excluir(Integer codigo){
        for(PlanoDeSaude e : planosDeSaude) {
            if (e.getCodigo() == codigo){
                planosDeSaude.remove(e);
                break;
            }
        }
    }
}

