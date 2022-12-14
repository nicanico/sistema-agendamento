
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282218\\sistema-plano\\Plano.txt";
    private final static String URL_TEMP = "C:\\Users\\22282218\\sistema-plano\\Plano-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude e) {
        
        planosDeSaude.add(e);
        
        // Gravar arquivo
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getFormatacaoDoPlanoDeSaudeComPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu erro!");
        }
        
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
        
        atualizarArquivo();
    }
    public static void excluirPlano(Integer codigo){
        for(PlanoDeSaude e : planosDeSaude) {
            if (e.getCodigo().equals(codigo)){
                planosDeSaude.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
        
    }
    
    public static void atualizarArquivo(){
        
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude e : planosDeSaude){
                bwTemp.write(e.getFormatacaoDoPlanoDeSaudeComPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void criarPlanosDeSaude(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while (linha != null){
                String[] vetor = linha.split(";");
                
                String[] data = vetor[4].split("/");
                
                PlanoDeSaude e = new PlanoDeSaude(
                vetor[1],
                vetor[2],
                vetor[3],
                LocalDate.of(
                        Integer.parseInt(data[2]), 
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[0])),
                Integer.valueOf(vetor[0]));
                
                planosDeSaude.add(e);
                
                linha = leitor.readLine();
            }
            
            leitor.close();
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu erro!");
        }
        
         
    }
        
    public static DefaultTableModel getTablePlanosDeSaude(){
        
        String[] titulo = {"C??DIGO", "OPERADORA", "CATEGORIA", "N??MERO", "VALIDADE"};
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

