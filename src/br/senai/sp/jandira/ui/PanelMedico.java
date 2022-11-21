
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import javax.swing.JOptionPane;


public class PanelMedico extends javax.swing.JPanel {
    
    private int linha;
    
    public PanelMedico() {
        initComponents();
        //MedicoDAO.criarListaDeMedicos();
        //preencherTabela();
        
    }
    
    private int getLinha() {
        linha = jTableMedicos.getSelectedRow();
        return linha;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanelMedicos = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jButtonadicionarNovoMedico = new javax.swing.JButton();
        jButtonatualizarMedicos = new javax.swing.JButton();
        jButtonDeleteMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Medicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        setLayout(null);

        jTableMedicos.setBackground(new java.awt.Color(255, 204, 204));
        jTableMedicos.setForeground(new java.awt.Color(255, 255, 255));
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMedicos.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMedicos.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPanelMedicos.setViewportView(jTableMedicos);

        add(jScrollPanelMedicos);
        jScrollPanelMedicos.setBounds(20, 40, 800, 230);

        jButtonadicionarNovoMedico.setBackground(new java.awt.Color(204, 204, 204));
        jButtonadicionarNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jButtonadicionarNovoMedico.setToolTipText("Nova Especialidade");
        jButtonadicionarNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadicionarNovoMedicoActionPerformed(evt);
            }
        });
        add(jButtonadicionarNovoMedico);
        jButtonadicionarNovoMedico.setBounds(790, 290, 50, 40);

        jButtonatualizarMedicos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonatualizarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar.png"))); // NOI18N
        jButtonatualizarMedicos.setToolTipText("Atualizar Especialidade");
        jButtonatualizarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonatualizarMedicosActionPerformed(evt);
            }
        });
        add(jButtonatualizarMedicos);
        jButtonatualizarMedicos.setBounds(720, 290, 50, 40);

        jButtonDeleteMedico.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeleteMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        jButtonDeleteMedico.setToolTipText("Excluir Especialidade");
        jButtonDeleteMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteMedicoActionPerformed(evt);
            }
        });
        add(jButtonDeleteMedico);
        jButtonDeleteMedico.setBounds(660, 290, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonadicionarNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadicionarNovoMedicoActionPerformed
        
    }//GEN-LAST:event_jButtonadicionarNovoMedicoActionPerformed

    private void jButtonatualizarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonatualizarMedicosActionPerformed


    }//GEN-LAST:event_jButtonatualizarMedicosActionPerformed

    private void jButtonDeleteMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteMedicoActionPerformed

        if(getLinha() != -1){
           excluirEspecialidade();
       } else {
            JOptionPane.showMessageDialog(
                   this, 
                   "Por favor, selecione a especialidade que deseja excluir", 
                   "Atenção", 
                   JOptionPane.OK_OPTION);
       }

    }//GEN-LAST:event_jButtonDeleteMedicoActionPerformed
    
    private void excluirEspecialidade() {

       int resposta = JOptionPane.showConfirmDialog(
               this, 
               "Confirma exclusão?", 
               "Atenção", 
               JOptionPane.YES_NO_OPTION, 
               JOptionPane.QUESTION_MESSAGE);
       
       if(resposta == 0){
           MedicoDAO.excluir(getCodigo());
           //preencherTabela();
       }
       
    }
       private Integer getCodigo(){
       String codigoStr = jTableMedicos.getValueAt(getLinha(), 0).toString();
       Integer codigo = Integer.valueOf(codigoStr);
       
       return codigo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteMedico;
    private javax.swing.JButton jButtonadicionarNovoMedico;
    private javax.swing.JButton jButtonatualizarMedicos;
    private javax.swing.JScrollPane jScrollPanelMedicos;
    private javax.swing.JTable jTableMedicos;
    // End of variables declaration//GEN-END:variables
}
