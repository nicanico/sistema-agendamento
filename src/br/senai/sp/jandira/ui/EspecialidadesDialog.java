/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282218
 */
public class EspecialidadesDialog extends javax.swing.JDialog {

        private Especialidade especialidade;
        private OperacaoEnum operacao;
        
    public EspecialidadesDialog(
            java.awt.Frame parent, 
            boolean modal, 
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
    public EspecialidadesDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    private void preencherFormulario() {
        
        jTextFieldCodigo.setText(especialidade.getCodigo().toString());
        jTextFieldNome.setText(especialidade.getNome());
        jTextFieldDescricao.setText(especialidade.getDescricao());
    }
    
    private void preencherTitulo() {
        jLabelTitulo.setText("Especialidades - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
            jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar.png")));
        }else{
            jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdicionar = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        panelDetalhesEspecialidade = new javax.swing.JPanel();
        jLabelDescricaoEspecialidade = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNomeDaEspecialidade = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelAdicionar.setBackground(new java.awt.Color(255, 204, 204));
        jPanelAdicionar.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jLabelTitulo.setText("  Especialidades - Adicionar");
        jPanelAdicionar.add(jLabelTitulo);
        jLabelTitulo.setBounds(20, 10, 340, 40);

        getContentPane().add(jPanelAdicionar);
        jPanelAdicionar.setBounds(0, 0, 630, 60);

        panelDetalhesEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalhesEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        panelDetalhesEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        panelDetalhesEspecialidade.setLayout(null);

        jLabelDescricaoEspecialidade.setText("Descrição da Especialidade");
        panelDetalhesEspecialidade.add(jLabelDescricaoEspecialidade);
        jLabelDescricaoEspecialidade.setBounds(20, 150, 160, 16);

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(20, 170, 450, 22);

        jLabelCodigo.setText("Código");
        panelDetalhesEspecialidade.add(jLabelCodigo);
        jLabelCodigo.setBounds(20, 40, 50, 16);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(20, 60, 110, 22);
        panelDetalhesEspecialidade.add(jTextFieldNome);
        jTextFieldNome.setBounds(20, 110, 410, 22);

        jLabelNomeDaEspecialidade.setText("Nome da Especialidade");
        panelDetalhesEspecialidade.add(jLabelNomeDaEspecialidade);
        jLabelNomeDaEspecialidade.setBounds(20, 90, 170, 16);

        jButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar e fechar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(jButtonCancelar);
        jButtonCancelar.setBounds(430, 210, 60, 40);

        jButtonSalvar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(jButtonSalvar);
        jButtonSalvar.setBounds(500, 210, 60, 40);

        getContentPane().add(panelDetalhesEspecialidade);
        panelDetalhesEspecialidade.setBounds(20, 80, 580, 260);

        setSize(new java.awt.Dimension(639, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        }else{
            editar();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void editar(){
        especialidade.setNome(jTextFieldNome.getText());
        especialidade.setDescricao(jTextFieldDescricao.getText());
    
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, 
                "Especialidade atualizada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void adicionar(){
        //Criar especialidade
        Especialidade Novaespecialidade = new Especialidade();
        Novaespecialidade.setNome(jTextFieldNome.getText());
        Novaespecialidade.setDescricao(jTextFieldDescricao.getText());
        
        EspecialidadeDAO.gravar(Novaespecialidade);
        
        JOptionPane.showMessageDialog(this, 
                "Especialidade gravada com sucesso", 
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricaoEspecialidade;
    private javax.swing.JLabel jLabelNomeDaEspecialidade;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPanel panelDetalhesEspecialidade;
    // End of variables declaration//GEN-END:variables
}
