
package universidadejemplo.Vistas;

import javax.swing.ImageIcon;

public class Vista extends javax.swing.JFrame {
   
    public Vista() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("libro.png")).getImage());            
                     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmForAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmForMateria = new javax.swing.JMenuItem();
        jmAdminitracion = new javax.swing.JMenu();
        jmManeIncripcion = new javax.swing.JMenuItem();
        jmManiNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCAMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jmAlumno.setText("Alumno");

        jmForAlumno.setText("Formulario de Alumno");
        jmForAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmForAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");

        jmForMateria.setText("Formulario de Materia");
        jmForMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmForMateria);

        jMenuBar1.add(jmMateria);

        jmAdminitracion.setText("Administracion");

        jmManeIncripcion.setText("Manejo de Inscripciones");
        jmManeIncripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManeIncripcionActionPerformed(evt);
            }
        });
        jmAdminitracion.add(jmManeIncripcion);

        jmManiNotas.setText("Manipulacion de Notas");
        jmManiNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManiNotasActionPerformed(evt);
            }
        });
        jmAdminitracion.add(jmManiNotas);

        jMenuBar1.add(jmAdminitracion);

        jMenu4.setText("Consultas");

        jmCAMateria.setText("Alumnos por Materia");
        jmCAMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCAMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmCAMateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmForAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForAlumnoActionPerformed
         
        escritorio.removeAll();
        escritorio.repaint();
        GestionAlumno gestionp=new GestionAlumno();
        gestionp.setVisible(true);
        escritorio.add(gestionp);
        escritorio.moveToFront(gestionp);
        
    }//GEN-LAST:event_jmForAlumnoActionPerformed

    private void jmForMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForMateriaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fm = new FormularioMateria();
        fm.setVisible(true);
        escritorio.add(fm);
        escritorio.moveToFront(fm);
        
    }//GEN-LAST:event_jmForMateriaActionPerformed

    private void jmCAMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCAMateriaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ListadoAlumnoPorMateria apm = new ListadoAlumnoPorMateria();
        apm.setVisible(true);
        escritorio.add(apm);
        escritorio.moveToFront(apm);
        
    }//GEN-LAST:event_jmCAMateriaActionPerformed

    private void jmManeIncripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManeIncripcionActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion fi = new FormularioInscripcion();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_jmManeIncripcionActionPerformed

    private void jmManiNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManiNotasActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        CargarNotas cn = new CargarNotas();
        cn.setVisible(true);
        escritorio.add(cn);
        escritorio.moveToFront(cn);
    }//GEN-LAST:event_jmManiNotasActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
         
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmAdminitracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenuItem jmCAMateria;
    private javax.swing.JMenuItem jmForAlumno;
    private javax.swing.JMenuItem jmForMateria;
    private javax.swing.JMenuItem jmManeIncripcion;
    private javax.swing.JMenuItem jmManiNotas;
    private javax.swing.JMenu jmMateria;
    // End of variables declaration//GEN-END:variables
}
