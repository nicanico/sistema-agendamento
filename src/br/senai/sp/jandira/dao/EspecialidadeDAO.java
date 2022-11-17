package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282218\\sistema\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282218\\sistema\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { //creat

        especialidades.add(e);

        // Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu erro!");
        }
    }

    public static ArrayList<Especialidade> getEspecialidades() { ///read
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { // read
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;

    }

    public static void atualizar(Especialidade especialidaeAtualizada) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidaeAtualizada.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidaeAtualizada);
                break;
            }

        }
        
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { //delete

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
        
    }

    private static void atualizarArquivo() {

        // PASSO - 01 Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {

            // Criar arquivo temporario
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário, exceto o registro que
            // não queremos mais
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            // Excluir o arquivo atual
            arquivoAtual.delete();
            
            // Renomear araquivo
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guardar  especialidade na lista
                especialidades.add(e);

                //Ler próxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo");
        }

        System.out.println(especialidades.size());

    }

    public static DefaultTableModel getTabelaEspecialidade() {

        System.out.println("Montando DefaulTable..." + especialidades.size());

        String[] titulo = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
        }

        return new DefaultTableModel(dados, titulo);

    }

}
