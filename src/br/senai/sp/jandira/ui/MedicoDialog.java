
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;

public class MedicoDialog extends javax.swing.JDialog {
    
    private Medico medico;
    private OperacaoEnum operacao;
    
    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal, 
            Medico e, 
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        medico = e;
        preencherTitulo();
    }
    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal, 
            OperacaoEnum operacao){
        
    super(parent, modal);
    initComponents();
    this.operacao = operacao;
    preencherTitulo();
    
}
    private void preecherFormulario(){
        
        jTextFieldCodigoDoMedico.setText(medico.getCodigo().toString());
        jTextFieldCrm.setText(medico.getCrm());
        jTextFieldEmail.setText(medico.getEmail());
        jTextFieldNomeDoMedico.setText(medico.getNome());
        jTextFieldNumero.setText(medico.getTelefone());
        
    }
    
     private void preencherTitulo(){
         
         jLabelTitulo.setText("Médicos -" + operacao);
        
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
        jPanelMedico = new javax.swing.JPanel();
        jLabelCodigoDoMedico = new javax.swing.JLabel();
        jTextFieldCodigoDoMedico = new javax.swing.JTextField();
        jLabelCrm = new javax.swing.JLabel();
        jTextFieldCrm = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNomeDoMedico = new javax.swing.JLabel();
        jTextFieldNomeDoMedico = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonCancelarMedicos = new javax.swing.JButton();
        jButtonSalvarMedicos = new javax.swing.JButton();
        formattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelEspecialidadesDoMedico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEspecialidadesMedico = new javax.swing.JList<>();
        jLabelListaDeEspecialidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListListaEspecialidades = new javax.swing.JList<>();
        jButtonRemoverEspecialidade = new javax.swing.JButton();
        jButtonMoverEspecialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 430));
        getContentPane().setLayout(null);

        jPanelAdicionar.setBackground(new java.awt.Color(255, 204, 204));
        jPanelAdicionar.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        jLabelTitulo.setText("  Médicos - Adicionar");
        jPanelAdicionar.add(jLabelTitulo);
        jLabelTitulo.setBounds(20, 10, 280, 40);

        getContentPane().add(jPanelAdicionar);
        jPanelAdicionar.setBounds(0, 0, 630, 60);

        jPanelMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
        jPanelMedico.setMaximumSize(new java.awt.Dimension(580, 260));
        jPanelMedico.setMinimumSize(new java.awt.Dimension(580, 260));
        jPanelMedico.setLayout(null);

        jLabelCodigoDoMedico.setText("Código");
        jPanelMedico.add(jLabelCodigoDoMedico);
        jLabelCodigoDoMedico.setBounds(20, 20, 80, 16);

        jTextFieldCodigoDoMedico.setEditable(false);
        jTextFieldCodigoDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDoMedicoActionPerformed(evt);
            }
        });
        jPanelMedico.add(jTextFieldCodigoDoMedico);
        jTextFieldCodigoDoMedico.setBounds(20, 40, 90, 22);

        jLabelCrm.setText("CRM:");
        jPanelMedico.add(jLabelCrm);
        jLabelCrm.setBounds(120, 20, 30, 16);

        jTextFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCrmActionPerformed(evt);
            }
        });
        jPanelMedico.add(jTextFieldCrm);
        jTextFieldCrm.setBounds(120, 40, 100, 22);

        jLabelTelefone.setText("Telefone:");
        jPanelMedico.add(jLabelTelefone);
        jLabelTelefone.setBounds(20, 80, 60, 16);

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanelMedico.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(20, 100, 180, 22);

        jLabelNomeDoMedico.setText("Nome do(a) médico(a):");
        jPanelMedico.add(jLabelNomeDoMedico);
        jLabelNomeDoMedico.setBounds(240, 20, 160, 16);

        jTextFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanelMedico.add(jTextFieldNomeDoMedico);
        jTextFieldNomeDoMedico.setBounds(230, 40, 280, 22);

        jLabelEmail.setText("E-mail:");
        jPanelMedico.add(jLabelEmail);
        jLabelEmail.setBounds(210, 80, 50, 16);

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelMedico.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(210, 100, 170, 22);

        jButtonCancelarMedicos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCancelarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        jButtonCancelarMedicos.setToolTipText("Cancelar e fechar");
        jButtonCancelarMedicos.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonCancelarMedicos.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonCancelarMedicos.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonCancelarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMedicosActionPerformed(evt);
            }
        });
        jPanelMedico.add(jButtonCancelarMedicos);
        jButtonCancelarMedicos.setBounds(430, 230, 60, 40);

        jButtonSalvarMedicos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalvarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvarMedicos.setToolTipText("Salvar");
        jButtonSalvarMedicos.setMaximumSize(new java.awt.Dimension(38, 39));
        jButtonSalvarMedicos.setMinimumSize(new java.awt.Dimension(38, 39));
        jButtonSalvarMedicos.setPreferredSize(new java.awt.Dimension(38, 39));
        jButtonSalvarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarMedicosActionPerformed(evt);
            }
        });
        jPanelMedico.add(jButtonSalvarMedicos);
        jButtonSalvarMedicos.setBounds(500, 230, 60, 40);

        formattedTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldDataNascimentoActionPerformed(evt);
            }
        });
        jPanelMedico.add(formattedTextFieldDataNascimento);
        formattedTextFieldDataNascimento.setBounds(390, 100, 150, 22);
        try{
            formattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        }catch(java.text.ParseException ex){
            ex.printStackTrace();
        }

        jLabel1.setText("Data de Nascimento:");
        jPanelMedico.add(jLabel1);
        jLabel1.setBounds(390, 80, 130, 16);

        jLabelEspecialidadesDoMedico.setText("Especialidades do médico:");
        jPanelMedico.add(jLabelEspecialidadesDoMedico);
        jLabelEspecialidadesDoMedico.setBounds(250, 140, 150, 16);

        jListEspecialidadesMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListEspecialidadesMedico);

        jPanelMedico.add(jScrollPane1);
        jScrollPane1.setBounds(250, 160, 120, 100);

        jLabelListaDeEspecialidade.setText("Lista de Especialidades:");
        jPanelMedico.add(jLabelListaDeEspecialidade);
        jLabelListaDeEspecialidade.setBounds(20, 140, 150, 16);

        jListListaEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListListaEspecialidades);

        jPanelMedico.add(jScrollPane2);
        jScrollPane2.setBounds(30, 160, 100, 100);

        jButtonRemoverEspecialidade.setText("<<<");
        jButtonRemoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverEspecialidadeActionPerformed(evt);
            }
        });
        jPanelMedico.add(jButtonRemoverEspecialidade);
        jButtonRemoverEspecialidade.setBounds(160, 210, 60, 30);

        jButtonMoverEspecialidade.setText(">>>");
        jButtonMoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverEspecialidadeActionPerformed(evt);
            }
        });
        jPanelMedico.add(jButtonMoverEspecialidade);
        jButtonMoverEspecialidade.setBounds(160, 160, 60, 30);

        getContentPane().add(jPanelMedico);
        jPanelMedico.setBounds(20, 70, 580, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDoMedicoActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoDoMedicoActionPerformed

    private void jTextFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCrmActionPerformed

    }//GEN-LAST:event_jTextFieldCrmActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDoMedicoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeDoMedicoActionPerformed

    private void jButtonCancelarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMedicosActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarMedicosActionPerformed

    private void jButtonSalvarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarMedicosActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        }else{
            editar();
        }
    }//GEN-LAST:event_jButtonSalvarMedicosActionPerformed

     private void editar(){
//        especialidade.setNome(jTextFieldNome.getText());
//        especialidade.setDescricao(jTextFieldDescricao.getText());
//    
//        EspecialidadeDAO.atualizar(especialidade);
//        
//        JOptionPane.showMessageDialog(null, 
//                "Especialidade atualizada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
//        
//        dispose();
    }
    
    private void adicionar(){
//        //Criar especialidade
//        Especialidade Novaespecialidade = new Especialidade();
//        Novaespecialidade.setNome(jTextFieldNome.getText());
//        Novaespecialidade.setDescricao(jTextFieldDescricao.getText());
//        
//        EspecialidadeDAO.gravar(Novaespecialidade);
//        
//        JOptionPane.showMessageDialog(this, 
//                "Especialidade gravada com sucesso", 
//                "Especialidades", 
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        dispose();
    }
    
    private void formattedTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldDataNascimentoActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonRemoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverEspecialidadeActionPerformed

    private void jButtonMoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMoverEspecialidadeActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField formattedTextFieldDataNascimento;
    private javax.swing.JButton jButtonCancelarMedicos;
    private javax.swing.JButton jButtonMoverEspecialidade;
    private javax.swing.JButton jButtonRemoverEspecialidade;
    private javax.swing.JButton jButtonSalvarMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigoDoMedico;
    private javax.swing.JLabel jLabelCrm;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEspecialidadesDoMedico;
    private javax.swing.JLabel jLabelListaDeEspecialidade;
    private javax.swing.JLabel jLabelNomeDoMedico;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListEspecialidadesMedico;
    private javax.swing.JList<String> jListListaEspecialidades;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JPanel jPanelMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCodigoDoMedico;
    private javax.swing.JTextField jTextFieldCrm;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeDoMedico;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
