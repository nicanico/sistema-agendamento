
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class PlanoDeSaudeDialog extends javax.swing.JDialog {
    
        private PlanoDeSaude planoDeSaude;
        private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            PlanoDeSaude e, 
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        planoDeSaude = e;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
     public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
     private void preencherFormulario() {
        
        jTextFieldCodigoDoPlano.setText(planoDeSaude.getCodigo().toString());
        jTextFieldOperadora.setText(planoDeSaude.getOperadora());
        jTextFieldCategoria.setText(planoDeSaude.getCategoria());
        jTextFieldNumero.setText(planoDeSaude.getNumero());
        jTextFieldValidade.setText(planoDeSaude.getValidade().toString());
    }
    
    private void preencherTitulo() {
        jLabelTitulo.setText("Plano de Saúde - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
            jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar.png")));
        }else{
            jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        }
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulos = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelPlanos = new javax.swing.JPanel();
        jLabelCodigoDoPlano = new javax.swing.JLabel();
        jTextFieldCodigoDoPlano = new javax.swing.JTextField();
        jLabelOperadora = new javax.swing.JLabel();
        jTextFieldOperadora = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelValidade = new javax.swing.JLabel();
        jTextFieldValidade = new javax.swing.JTextField();
        jButtonCancelarPlanos = new javax.swing.JButton();
        jButtonSalvarPlanos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanelTitulos.setBackground(new java.awt.Color(255, 204, 204));
        jPanelTitulos.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jLabelTitulo.setText("  Plano de Saúde - ADICIONAR");
        jPanelTitulos.add(jLabelTitulo);
        jLabelTitulo.setBounds(20, 10, 450, 40);

        getContentPane().add(jPanelTitulos);
        jPanelTitulos.setBounds(0, 0, 630, 60);

        jPanelPlanos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        jPanelPlanos.setMaximumSize(new java.awt.Dimension(580, 260));
        jPanelPlanos.setMinimumSize(new java.awt.Dimension(580, 260));
        jPanelPlanos.setLayout(null);

        jLabelCodigoDoPlano.setText("Código");
        jPanelPlanos.add(jLabelCodigoDoPlano);
        jLabelCodigoDoPlano.setBounds(20, 20, 160, 16);

        jTextFieldCodigoDoPlano.setEditable(false);
        jTextFieldCodigoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDoPlanoActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jTextFieldCodigoDoPlano);
        jTextFieldCodigoDoPlano.setBounds(20, 40, 90, 22);

        jLabelOperadora.setText("Operadora");
        jPanelPlanos.add(jLabelOperadora);
        jLabelOperadora.setBounds(20, 70, 160, 16);

        jTextFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOperadoraActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jTextFieldOperadora);
        jTextFieldOperadora.setBounds(20, 90, 250, 22);

        jLabelNumero.setText("Número");
        jPanelPlanos.add(jLabelNumero);
        jLabelNumero.setBounds(20, 130, 160, 16);

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(20, 150, 250, 22);

        jLabelCategoria.setText("Categoria");
        jPanelPlanos.add(jLabelCategoria);
        jLabelCategoria.setBounds(290, 70, 160, 16);

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jTextFieldCategoria);
        jTextFieldCategoria.setBounds(290, 90, 190, 22);

        jLabelValidade.setText("Validade");
        jPanelPlanos.add(jLabelValidade);
        jLabelValidade.setBounds(290, 130, 160, 16);

        jTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValidadeActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jTextFieldValidade);
        jTextFieldValidade.setBounds(290, 150, 120, 22);

        jButtonCancelarPlanos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCancelarPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        jButtonCancelarPlanos.setToolTipText("Cancelar e fechar");
        jButtonCancelarPlanos.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonCancelarPlanos.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonCancelarPlanos.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonCancelarPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPlanosActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jButtonCancelarPlanos);
        jButtonCancelarPlanos.setBounds(430, 210, 60, 40);

        jButtonSalvarPlanos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalvarPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvarPlanos.setToolTipText("Salvar");
        jButtonSalvarPlanos.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonSalvarPlanos.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonSalvarPlanos.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonSalvarPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPlanosActionPerformed(evt);
            }
        });
        jPanelPlanos.add(jButtonSalvarPlanos);
        jButtonSalvarPlanos.setBounds(500, 210, 60, 40);

        getContentPane().add(jPanelPlanos);
        jPanelPlanos.setBounds(20, 90, 580, 260);

        setSize(new java.awt.Dimension(639, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jTextFieldCodigoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDoPlanoActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigoDoPlanoActionPerformed

    private void jTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValidadeActionPerformed
        
    }//GEN-LAST:event_jTextFieldValidadeActionPerformed

    private void jTextFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperadoraActionPerformed
        
    }//GEN-LAST:event_jTextFieldOperadoraActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonCancelarPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPlanosActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarPlanosActionPerformed

    private void jButtonSalvarPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPlanosActionPerformed
       if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        }else{
            editar();
        }
    }//GEN-LAST:event_jButtonSalvarPlanosActionPerformed
     private void editar(){
        planoDeSaude.setOperadora(jTextFieldOperadora.getText());
        planoDeSaude.setCategoria(jTextFieldCategoria.getText());
        planoDeSaude.setNumero(jTextFieldNumero.getText());
        planoDeSaude.setValidade(LocalDate.parse(jTextFieldValidade.getText(), DateTimeFormatter.ISO_DATE));
        
       
         PlanoDeSaudeDAO.atualizar(planoDeSaude);
        
         JOptionPane.showMessageDialog(null, 
                "Plano de Saúde atualizado com sucesso", "Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void adicionar(){
        //Criar especialidade
        PlanoDeSaude novoPlano = new PlanoDeSaude();
        novoPlano.setOperadora(jTextFieldOperadora.getText());
        novoPlano.setCategoria(jTextFieldCategoria.getText());
        novoPlano.setNumero(jTextFieldNumero.getText());
        novoPlano.setValidade(LocalDate.parse(jTextFieldValidade.getText(), DateTimeFormatter.ISO_DATE));
        
        PlanoDeSaudeDAO.gravar(novoPlano);
        
        JOptionPane.showMessageDialog(this, 
                "Plano de Saúde gravado com sucesso", 
                "Plano de Saúde", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarPlanos;
    private javax.swing.JButton jButtonSalvarPlanos;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigoDoPlano;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOperadora;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JPanel jPanelPlanos;
    private javax.swing.JPanel jPanelTitulos;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigoDoPlano;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOperadora;
    private javax.swing.JTextField jTextFieldValidade;
    // End of variables declaration//GEN-END:variables
}
