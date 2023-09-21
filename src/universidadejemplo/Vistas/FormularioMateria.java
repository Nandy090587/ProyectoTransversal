
package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;


public class FormularioMateria extends javax.swing.JInternalFrame {

    public FormularioMateria() {
        
        initComponents();
        
    }
    
    MateriaData md = new MateriaData();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jbNuevaMateria = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtAnio = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("codigo");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevaMateria.setText("Nuevo");
        jbNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMateriaActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrEstado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEliminar)
                                .addGap(35, 35, 35)
                                .addComponent(jbGuardar)
                                .addGap(28, 28, 28)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(jbBuscar))
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jbNuevaMateria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jbBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaMateria)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        try {
            
            Materia buscarMat = md.buscarMateria(Integer.parseInt(jtCodigo.getText()));

            if (buscarMat != null) {

                jtNombre.setText(buscarMat.getNombre());
                jtAnio.setText(buscarMat.getAnio() + "");
                jrEstado.setSelected(buscarMat.isEstado());

            }
        }catch(NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        Materia guardarMat = new Materia();
        
        guardarMat.setNombre(jtNombre.getText());
        guardarMat.setAnio(Integer.parseInt(jtAnio.getText()));
        guardarMat.setEstado(jrEstado.isSelected());
        
        md.guardarMateria(guardarMat);
              
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        md.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMateriaActionPerformed
        
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrEstado.setSelected(false);
        
    }//GEN-LAST:event_jbNuevaMateriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevaMateria;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
