/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

/**
 *
 * @author 22282218
 */
public class PanelPlanoDeSaude extends javax.swing.JPanel {

    /**
     * Creates new form PanelPlanoDeSaude
     */
    public PanelPlanoDeSaude() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanelPlanos = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N
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
        jScrollPanelPlanos.setViewportView(jTableEspecialidades);

        add(jScrollPanelPlanos);
        jScrollPanelPlanos.setBounds(20, 40, 800, 230);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPanelPlanos;
    private javax.swing.JTable jTableEspecialidades;
    // End of variables declaration//GEN-END:variables
}
