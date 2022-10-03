package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    /*
    Classe responsável pela persistência de 
    dados das especialidades, por exemplo, 
    adicionar uma nova especialidade, excluir, etc.
    */
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade e) { //creat
        
        especialidades.add(e);
    }
    
    public static ArrayList<Especialidade> getEspecialidades() { ///read
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo){ // read
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
            return null;
    
    }
    
    public static void atualizar(Especialidade especialidaeAtualizada) {
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == especialidaeAtualizada.getCodigo()) {
                //e = especialidaeAtualizada;
                //especialidades.remove(e);
                //especialidades.add(especialidaeAtualizada);
                especialidades.set(especialidades.indexOf(e), especialidaeAtualizada);
                break;
      }
            
    }
}
    
    public static void excluir(Integer codigo){ //delete
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
        
    }
}
