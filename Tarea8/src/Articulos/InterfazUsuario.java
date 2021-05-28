/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class InterfazUsuario extends javax.swing.JFrame {
    
    BD bd = new BD();

    /**
     * Creates new form InterfazUsuario
     */
    public InterfazUsuario() {
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

        botonBuscar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaListado = new javax.swing.JTextArea();
        labelListado = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        fieldCantidad = new javax.swing.JTextField();
        fieldDescripcion = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock de artículos");

        botonBuscar.setText("Buscar");
        botonBuscar.setMaximumSize(new java.awt.Dimension(83, 32));
        botonBuscar.setMinimumSize(new java.awt.Dimension(83, 32));
        botonBuscar.setPreferredSize(new java.awt.Dimension(83, 32));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.setMaximumSize(new java.awt.Dimension(83, 32));
        botonBorrar.setMinimumSize(new java.awt.Dimension(83, 32));
        botonBorrar.setPreferredSize(new java.awt.Dimension(83, 32));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonMostrar.setText("Mostrar");
        botonMostrar.setMaximumSize(new java.awt.Dimension(83, 32));
        botonMostrar.setMinimumSize(new java.awt.Dimension(83, 32));
        botonMostrar.setPreferredSize(new java.awt.Dimension(83, 32));
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.setMaximumSize(new java.awt.Dimension(83, 32));
        botonSalir.setMinimumSize(new java.awt.Dimension(83, 32));
        botonSalir.setPreferredSize(new java.awt.Dimension(83, 32));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        areaListado.setColumns(20);
        areaListado.setRows(5);
        jScrollPane2.setViewportView(areaListado);

        labelListado.setText("Listado de productos:");

        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
            }
        });

        fieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantidadActionPerformed(evt);
            }
        });

        labelCodigo.setText("Código");

        labelNombre.setText("Nombre");

        labelCantidad.setText("Cantidad");

        labelDescripcion.setText("Descripción");

        botonInsertar.setText("Insertar");
        botonInsertar.setMaximumSize(new java.awt.Dimension(83, 32));
        botonInsertar.setMinimumSize(new java.awt.Dimension(83, 32));
        botonInsertar.setPreferredSize(new java.awt.Dimension(83, 32));
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelCodigo)
                                    .addComponent(labelNombre)
                                    .addComponent(labelCantidad)
                                    .addComponent(labelDescripcion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldDescripcion)
                                    .addComponent(fieldCantidad)
                                    .addComponent(fieldNombre)
                                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(529, 529, 529))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCodigo))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombre))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCantidad))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDescripcion))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonModificar)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.areaListado.setText(bd.buscar(Integer.parseInt(this.fieldCodigo.getText())));
        this.fieldCodigo.setText("");
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        this.areaListado.setText(bd.modificar(Integer.parseInt(fieldCodigo.getText()), fieldNombre.getText(), Integer.parseInt(fieldCantidad.getText()), fieldDescripcion.getText()));
        this.fieldCodigo.setText("");
        this.fieldNombre.setText("");
        this.fieldCantidad.setText("");
        this.fieldDescripcion.setText("");
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro?")==JOptionPane.OK_OPTION){
            areaListado.setText(bd.borrar(Integer.parseInt(fieldCodigo.getText())));
            this.fieldCodigo.setText("");
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        this.areaListado.setText(bd.mostrar());
        this.fieldCodigo.setText("");
        this.fieldNombre.setText("");
        this.fieldCantidad.setText("");
        this.fieldDescripcion.setText("");
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void fieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantidadActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Articulos articulo = new Articulos(Integer.parseInt(fieldCodigo.getText()), fieldNombre.getText(), Integer.parseInt(fieldCantidad.getText()), fieldDescripcion.getText());
        this.areaListado.setText(bd.darAlta(articulo));
        this.fieldCodigo.setText("");
        this.fieldNombre.setText("");
        this.fieldCantidad.setText("");
        this.fieldDescripcion.setText("");
    }//GEN-LAST:event_botonInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaListado;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField fieldCantidad;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelListado;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
