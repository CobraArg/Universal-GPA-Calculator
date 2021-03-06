/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpatest;

import Controllers.ArchivoController;
import Utilidades.Global;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 *
 * @author Martin
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();
        // String [] p=Global.getListaPaises();
        String[] paises = Global.getListaPaises();
        // String[] paises = {"Argentina", "USA", "Spain", "Chile"};
        this.comboGPA.setModel(new javax.swing.DefaultComboBoxModel(paises));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        buttonCalcular = new javax.swing.JButton();
        DatosLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        comboGPA = new javax.swing.JComboBox();
        labelRango = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuSave = new javax.swing.JMenuItem();
        menuLoad = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuExportCVS = new javax.swing.JMenuItem();
        menuClearTable = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Materia", "Horas", "Creditos", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMateriasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMaterias);
        tablaMaterias.getColumnModel().getColumn(0).setMinWidth(100);
        tablaMaterias.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablaMaterias.getColumnModel().getColumn(0).setMaxWidth(400);
        tablaMaterias.getColumnModel().getColumn(1).setMinWidth(50);
        tablaMaterias.getColumnModel().getColumn(1).setPreferredWidth(50);
        tablaMaterias.getColumnModel().getColumn(2).setMinWidth(50);
        tablaMaterias.getColumnModel().getColumn(2).setPreferredWidth(50);
        tablaMaterias.getColumnModel().getColumn(3).setMinWidth(50);
        tablaMaterias.getColumnModel().getColumn(3).setPreferredWidth(50);

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        DatosLabel.setText("Datos:");

        countLabel.setText("0 ingresados");

        comboGPA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Country" }));
        comboGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGPAActionPerformed(evt);
            }
        });

        labelRango.setText("Range: 0.0-10.0");

        menuBar.setMinimumSize(new java.awt.Dimension(27, 30));
        menuBar.setPreferredSize(new java.awt.Dimension(89, 30));

        menuFile.setText("File");
        menuFile.setMinimumSize(new java.awt.Dimension(27, 20));
        menuFile.setPreferredSize(new java.awt.Dimension(27, 20));

        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);

        menuLoad.setText("Load");
        menuLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoadActionPerformed(evt);
            }
        });
        menuFile.add(menuLoad);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        menuExportCVS.setText("Export as CVS");
        menuExportCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExportCVSActionPerformed(evt);
            }
        });
        menuEdit.add(menuExportCVS);

        menuClearTable.setText("Clear Table");
        menuClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClearTableActionPerformed(evt);
            }
        });
        menuEdit.add(menuClearTable);

        menuBar.add(menuEdit);

        menuHelp.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DatosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCalcular))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelRango)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelRango)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcular)
                    .addComponent(DatosLabel)
                    .addComponent(countLabel)
                    .addComponent(comboGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExportCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExportCVSActionPerformed
        JDialog dialogo= new SaveFileDialog(this,true);
        dialogo.setVisible(true);
    }//GEN-LAST:event_menuExportCVSActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
         if (!ArchivoController.SaveFile(tablaMaterias)) {
            JDialog dialogo = new errorDialog(this, true, "Error al guardar el Archivo");
            dialogo.setVisible(true);
        } 
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoadActionPerformed
       if (!ArchivoController.LoadFile(tablaMaterias)) {
            JDialog dialogo = new errorDialog(this, true, "El archivo no existe! Debes guardar antes de Cargar");
            dialogo.setVisible(true);
        }      
    }//GEN-LAST:event_menuLoadActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExitActionPerformed

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

        String pais = (String) this.comboGPA.getSelectedItem();
        Global.setValorPais(pais);
        Float totalHora = 0.0f;
        Float totalCredito = 0f;
        Float cantidadCreditos = 0.0f;
        Float cantidadHora = 0.0f;
        Integer hora;
        Integer credito;
        Float nota;
        //chequear si los valores estan dentro del rango
        String rango = this.labelRango.getText();
        String[] rang = rango.split(":");
        String[] notaA1 = rang[1].split("-"); // en notaA1[0] y notaA1[1] tengo el rango de valores 9-10
        Float valorMin = Float.valueOf(notaA1[0]);
        Float valorMax = Float.valueOf(notaA1[1]);

        boolean sigo = true;
        for (int i = 0; i < this.tablaMaterias.getRowCount(); i++) {
            hora = (Integer) this.tablaMaterias.getValueAt(i, 1);
            credito = (Integer) this.tablaMaterias.getValueAt(i, 2);
            nota = (Float) this.tablaMaterias.getValueAt(i, 3);
            if (nota != null) {
                if (valorMin <= nota && nota <= valorMax) {
                    //se encuentra dentro del rango
                    if (hora != null || credito != null) {
                        if (!pais.equals("USA")) {
                            nota = Global.getValor(nota);
                        }
                        if (hora != null) {
                            totalHora += nota * hora;
                            cantidadHora += hora;
                        }
                        if (credito != null) {
                            totalCredito += nota * credito;
                            cantidadCreditos += credito;
                        }
                    }
                } else {
                    this.tablaMaterias.clearSelection();
                    this.tablaMaterias.changeSelection(i, 3, true, false);
                    JDialog dialogo = new errorDialog(this, true, "Nota fuera del Rango!");
                    dialogo.setVisible(true);
                    sigo = false;
                    break;
                }
            }
        }
        if (sigo) {
            if (cantidadCreditos != 0) {
                totalCredito = totalCredito / cantidadCreditos;
            }
            if (cantidadHora != 0) {
                totalHora = totalHora / cantidadHora;

                //ver el caso de que el pais sea USA!
                JDialog dialogo = new calculoDialog(this, true, totalCredito, totalHora);
                dialogo.setVisible(true);
            }
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
       JDialog dialogo = new AboutDialog(this, true);
       dialogo.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void tablaMateriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMateriasMousePressed
        int count = 0;
        for (int i = 0; i < this.tablaMaterias.getRowCount(); i++) {
            //for (int j = 0; j < this.tablaMaterias.getColumnCount(); j++) {
            String fila = (String) this.tablaMaterias.getValueAt(i, 0);
            if (fila == null) {
                fila = "";
            }
            fila = fila.trim();
            if (!fila.equals("")) {
                count++;
            }
        }
        this.countLabel.setText(count + " Ingresados");
    }//GEN-LAST:event_tablaMateriasMousePressed

    private void menuClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClearTableActionPerformed
        Global.clearTabla(this.tablaMaterias);
    }//GEN-LAST:event_menuClearTableActionPerformed

    private void comboGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGPAActionPerformed
        this.labelRango.setText("Rango: " + Global.getRango((String) this.comboGPA.getSelectedItem()));
    }//GEN-LAST:event_comboGPAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatosLabel;
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox comboGPA;
    private javax.swing.JLabel countLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRango;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuClearTable;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuExportCVS;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuLoad;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables
}
