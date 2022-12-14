package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.sound.midi.Patch;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282218\\sistema\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282218\\sistema\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void gravar(Medico e) {
        
        medicos.add(e);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getFormatacaoDoMedicoComPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu erro!");
        }
    }

    public static ArrayList<Medico> getMedico() {
        return medicos;
    }

    public static Medico getMedico(Integer codigoDoMedico) {
        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigoDoMedico)) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Medico medicoAtualizado) {
        for (Medico e : medicos) {
            if (e.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(e), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigoDoMedico) {

        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigoDoMedico)) {
                medicos.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {

        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico e : medicos) {
                bwTemp.write(e.getFormatacaoDoMedicoComPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Especialidade> separarEspecialidade(String linha) {
        String[] vetor = linha.split(";");
        int codigoEsp = 6;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        while (vetor.length > codigoEsp) {
            especialidades.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEsp])));
            codigoEsp++;
        }

        return especialidades;
    }

    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");


                Medico e = new Medico(
                        vetor[1],
                        vetor[3],
                        vetor[2],
                        vetor[4],
                        LocalDate.parse(vetor[5]),
                        Integer.valueOf(vetor[0]),
                        separarEspecialidade(linha));

                medicos.add(e);

                linha = leitor.readLine();
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo!");
        }
    }

    public static DefaultListModel<Especialidade> getEspModel() {

        DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();

        try {

            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            for (Especialidade e : separarEspecialidade(linha)) {
                especialidadesLista.addElement(e);
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro!!!");
        }
        return especialidadesLista;
    }

    public static DefaultTableModel getTabelaMedicos() {
        String[] titulo = {"CODIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico e : medicos) {
            int i = medicos.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();
        }

        return new DefaultTableModel(dados, titulo);

    }

}
