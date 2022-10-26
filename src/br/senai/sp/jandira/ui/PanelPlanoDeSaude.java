
package br.senai.sp.jandira.ui;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanoDeSaude extends javax.swing.JPanel {

        private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaude();
        preencherTabela();
    }

    private int getLinha() {
        linha = jTablePlanos.getSelectedRow();
        return linha;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanelPlanos = new javax.swing.JScrollPane();
        jTablePlanos = new javax.swing.JTable();
        jButtonExcluirPlano = new javax.swing.JButton();
        jButtonAtualizarPlano = new javax.swing.JButton();
        jButtonNovoPlano = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        setLayout(null);

        jTablePlanos.setBackground(new java.awt.Color(255, 204, 204));
        jTablePlanos.setForeground(new java.awt.Color(255, 255, 255));
        jTablePlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePlanos.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePlanos.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPanelPlanos.setViewportView(jTablePlanos);

        add(jScrollPanelPlanos);
        jScrollPanelPlanos.setBounds(20, 40, 800, 230);

        jButtonExcluirPlano.setBackground(new java.awt.Color(204, 204, 204));
        jButtonExcluirPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        jButtonExcluirPlano.setToolTipText("Excluir Especialidade");
        jButtonExcluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirPlanoActionPerformed(evt);
            }
        });
        add(jButtonExcluirPlano);
        jButtonExcluirPlano.setBounds(660, 290, 50, 40);

        jButtonAtualizarPlano.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtualizarPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar.png"))); // NOI18N
        jButtonAtualizarPlano.setToolTipText("Atualizar Especialidade");
        jButtonAtualizarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarPlanoActionPerformed(evt);
            }
        });
        add(jButtonAtualizarPlano);
        jButtonAtualizarPlano.setBounds(720, 290, 50, 40);

        jButtonNovoPlano.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNovoPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jButtonNovoPlano.setToolTipText("Nova Especialidade");
        jButtonNovoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPlanoActionPerformed(evt);
            }
        });
        add(jButtonNovoPlano);
        jButtonNovoPlano.setBounds(790, 290, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirPlanoActionPerformed

        if(getLinha() != -1){
            excluirPlano();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o plano que deseja excluir",
                "Atenção",
                JOptionPane.OK_OPTION);
        }

    }
        private void excluirPlano() {

       int resposta = JOptionPane.showConfirmDialog(
               this, 
               "Confirma exclusão?", 
               "Atenção", 
               JOptionPane.YES_NO_OPTION, 
               JOptionPane.QUESTION_MESSAGE);
       
       if(resposta == 0){
           PlanoDeSaudeDAO.excluirPlano(getCodigo());
           preencherTabela();
       }
       
    }
       private Integer getCodigo(){
       String codigoStr = jTablePlanos.getValueAt(getLinha(), 0).toString();
       Integer codigo = Integer.valueOf(codigoStr);
       
       return codigo;

    }//GEN-LAST:event_jButtonExcluirPlanoActionPerformed

    private void jButtonAtualizarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarPlanoActionPerformed

        if(getLinha() != -1){
            editarPlano();
        }else{
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o plano que você deseja editar!",
                "Planos de Saúde",
                JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButtonAtualizarPlanoActionPerformed
     private void editarPlano() {
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = 
                new PlanoDeSaudeDialog(null, true, 
                        planoDeSaude,
                        OperacaoEnum.EDITAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
        
    }
    
    
    private void jButtonNovoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlanoActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog =
        new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_jButtonNovoPlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarPlano;
    private javax.swing.JButton jButtonExcluirPlano;
    private javax.swing.JButton jButtonNovoPlano;
    private javax.swing.JScrollPane jScrollPanelPlanos;
    private javax.swing.JTable jTablePlanos;
    // End of variables declaration//GEN-END:variables

private void preencherTabela() {

        jTablePlanos.setModel(PlanoDeSaudeDAO.getTablePlanosDeSaude());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        
        //Impedir que o usúario movimento as colunas
        jTablePlanos.getTableHeader().setReorderingAllowed(false);
        //Bloquear edição de celulas
        jTablePlanos.setDefaultEditor(Object.class, null);
        //Tamanho da coluna
        jTablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTablePlanos.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTablePlanos.getColumnModel().getColumn(1).setPreferredWidth(190);
        jTablePlanos.getColumnModel().getColumn(2).setPreferredWidth(190);
        jTablePlanos.getColumnModel().getColumn(3).setPreferredWidth(190);
        jTablePlanos.getColumnModel().getColumn(4).setPreferredWidth(140);
    }

}
