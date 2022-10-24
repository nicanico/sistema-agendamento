
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;



public class HomeFrame extends javax.swing.JFrame {

    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/calendario (3).png")));
        initPanels();
    }
    
    //Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    
    //Constantes
    private final int POS_X = 10;
    private final int POS_Y = 160;
    private final int LARGURA = 850;
    private final int ALTURA = 340;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelicon = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        Buttonagenda = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonMedicos = new javax.swing.JButton();
        jButtonEspecialidades = new javax.swing.JButton();
        jButtonPlanoDeSaude = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelTitulo.setBackground(new java.awt.Color(255, 153, 153));
        jPanelTitulo.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Sistema para Agendamento de Consultas");
        jPanelTitulo.add(jLabelTitulo);
        jLabelTitulo.setBounds(110, 10, 440, 50);

        jLabelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario (2).png"))); // NOI18N
        jLabelicon.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabelicon.setMinimumSize(new java.awt.Dimension(45, 45));
        jPanelTitulo.add(jLabelicon);
        jLabelicon.setBounds(30, 0, 70, 80);

        getContentPane().add(jPanelTitulo);
        jPanelTitulo.setBounds(0, 0, 870, 80);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(20, 10, 160, 50);

        jLabel2.setText("Sistema de Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(60, 80, 320, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Dados para contato ou suporte:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(60, 120, 220, 20);

        jLabel4.setText("Telefone: 5555-7777");
        panelHome.add(jLabel4);
        jLabel4.setBounds(60, 160, 180, 16);

        jLabel5.setText("Email: nicsousan@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(60, 140, 240, 16);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        panelHome.add(jPanel3);
        jPanel3.setBounds(60, 100, 720, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 850, 340);

        buttonHome.setBackground(new java.awt.Color(204, 204, 204));
        buttonHome.setForeground(new java.awt.Color(102, 102, 102));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/placeholder.png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 100, 50);

        Buttonagenda.setBackground(new java.awt.Color(204, 204, 204));
        Buttonagenda.setForeground(new java.awt.Color(102, 102, 102));
        Buttonagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario (3).png"))); // NOI18N
        Buttonagenda.setText("Agenda");
        Buttonagenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonagendaActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonagenda);
        Buttonagenda.setBounds(120, 100, 110, 50);

        jButtonPacientes.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPacientes.setForeground(new java.awt.Color(102, 102, 102));
        jButtonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saude.png"))); // NOI18N
        jButtonPacientes.setText("Pacientes");
        jButtonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPacientes);
        jButtonPacientes.setBounds(240, 100, 110, 50);

        jButtonMedicos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMedicos.setForeground(new java.awt.Color(102, 102, 102));
        jButtonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente (2).png"))); // NOI18N
        jButtonMedicos.setText("Médicos");
        jButtonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMedicos);
        jButtonMedicos.setBounds(360, 100, 110, 50);

        jButtonEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEspecialidades.setForeground(new java.awt.Color(102, 102, 102));
        jButtonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/carteira-de-identidade.png"))); // NOI18N
        jButtonEspecialidades.setText("Especialistas");
        jButtonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEspecialidades);
        jButtonEspecialidades.setBounds(480, 100, 140, 50);

        jButtonPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPlanoDeSaude.setForeground(new java.awt.Color(102, 102, 102));
        jButtonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        jButtonPlanoDeSaude.setText("Planos de Saúde");
        jButtonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlanoDeSaude);
        jButtonPlanoDeSaude.setBounds(630, 100, 160, 50);

        jButtonSair.setBackground(new java.awt.Color(255, 51, 51));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(800, 100, 60, 50);

        setSize(new java.awt.Dimension(886, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedicosActionPerformed

    private void jButtonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEspecialidadesActionPerformed
        panelEspecialidades.setVisible(true);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(false);
    }//GEN-LAST:event_jButtonEspecialidadesActionPerformed

    private void jButtonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlanoDeSaudeActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
    }//GEN-LAST:event_jButtonPlanoDeSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void jButtonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPacientesActionPerformed

    private void ButtonagendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonagendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonagendaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonagenda;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton jButtonEspecialidades;
    private javax.swing.JButton jButtonMedicos;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JButton jButtonPlanoDeSaude;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelicon;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
    }

    

}
