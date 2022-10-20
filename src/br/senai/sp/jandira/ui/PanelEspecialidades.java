
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelEspecialidades extends javax.swing.JPanel {
    
    private int linha;
    
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = jTableEspecialidades.getSelectedRow();
        return linha;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneEspecialidade = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();
        jButtondeleteEspecialidade = new javax.swing.JButton();
        jButtonatualizarEspecialidade = new javax.swing.JButton();
        jButtonadicionarNovaEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 340));
        setLayout(null);

        jTableEspecialidades.setBackground(new java.awt.Color(255, 204, 204));
        jTableEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEspecialidades.setGridColor(new java.awt.Color(255, 255, 255));
        jTableEspecialidades.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPaneEspecialidade.setViewportView(jTableEspecialidades);

        add(jScrollPaneEspecialidade);
        jScrollPaneEspecialidade.setBounds(20, 40, 800, 230);

        jButtondeleteEspecialidade.setBackground(new java.awt.Color(204, 204, 204));
        jButtondeleteEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        jButtondeleteEspecialidade.setToolTipText("Excluir Especialidade");
        jButtondeleteEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteEspecialidadeActionPerformed(evt);
            }
        });
        add(jButtondeleteEspecialidade);
        jButtondeleteEspecialidade.setBounds(660, 290, 50, 40);

        jButtonatualizarEspecialidade.setBackground(new java.awt.Color(204, 204, 204));
        jButtonatualizarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar.png"))); // NOI18N
        jButtonatualizarEspecialidade.setToolTipText("Atualizar Especialidade");
        jButtonatualizarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonatualizarEspecialidadeActionPerformed(evt);
            }
        });
        add(jButtonatualizarEspecialidade);
        jButtonatualizarEspecialidade.setBounds(720, 290, 50, 40);

        jButtonadicionarNovaEspecialidade.setBackground(new java.awt.Color(204, 204, 204));
        jButtonadicionarNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jButtonadicionarNovaEspecialidade.setToolTipText("Nova Especialidade");
        jButtonadicionarNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadicionarNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(jButtonadicionarNovaEspecialidade);
        jButtonadicionarNovaEspecialidade.setBounds(790, 290, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondeleteEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteEspecialidadeActionPerformed
        
       if(getLinha() != -1){
           excluirEspecialidade();
       } else {
           JOptionPane.showMessageDialog(
                   this, 
                   "Por favor, selecione a especialidade que deseja excluir", 
                   "Atenção", 
                   JOptionPane.OK_OPTION);
       }
       
    }//GEN-LAST:event_jButtondeleteEspecialidadeActionPerformed

    private void excluirEspecialidade() {

       int resposta = JOptionPane.showConfirmDialog(
               this, 
               "Confirma exclusão?", 
               "Atenção", 
               JOptionPane.YES_NO_OPTION, 
               JOptionPane.QUESTION_MESSAGE);
       
       if(resposta == 0){
           EspecialidadeDAO.excluir(getCodigo());
           preencherTabela();
       }
       
    }
       private Integer getCodigo(){
       String codigoStr = jTableEspecialidades.getValueAt(getLinha(), 0).toString();
       Integer codigo = Integer.valueOf(codigoStr);
       
       return codigo;
    }
    private void jButtonatualizarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonatualizarEspecialidadeActionPerformed
        
        if(getLinha() != -1){
            editarEspecialidade();
        }else{
            JOptionPane.showConfirmDialog(
               this, 
               "Por favor, selecione a especialidade que você deseja editar!", 
               "Especialidades", 
               JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButtonatualizarEspecialidadeActionPerformed
        private void editarEspecialidade() {
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog = 
                new EspecialidadesDialog(null, true, especialidade,OperacaoEnum.EDITAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
        
    }
    
    private void jButtonadicionarNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadicionarNovaEspecialidadeActionPerformed
        EspecialidadesDialog especialidadeDialog = 
                new EspecialidadesDialog(null, true, OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
        
    }//GEN-LAST:event_jButtonadicionarNovaEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadicionarNovaEspecialidade;
    private javax.swing.JButton jButtonatualizarEspecialidade;
    private javax.swing.JButton jButtondeleteEspecialidade;
    private javax.swing.JScrollPane jScrollPaneEspecialidade;
    private javax.swing.JTable jTableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        jTableEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidade());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        
        //Impedir que o usúario movimento as colunas
        jTableEspecialidades.getTableHeader().setReorderingAllowed(false);
        //Bloquear edição de celulas
        jTableEspecialidades.setDefaultEditor(Object.class, null);
        //Tamanho da coluna
        jTableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(490);
    }

}
