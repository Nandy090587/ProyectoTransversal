
package universidadejemplo.Vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;



public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    
    public FormularioInscripcion() {
        
        initComponents();
        armarCabecera();
        cargarCombo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGrupoMat = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrMateriaNoInscripta = new javax.swing.JRadioButton();
        jrMateriaInscripta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMateria = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbNoInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jcbListaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaAlumnosItemStateChanged(evt);
            }
        });
        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jbGrupoMat.add(jrMateriaNoInscripta);
        jrMateriaNoInscripta.setSelected(true);
        jrMateriaNoInscripta.setText("Materias no Inscriptas");
        jrMateriaNoInscripta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrMateriaNoInscriptaItemStateChanged(evt);
            }
        });
        jrMateriaNoInscripta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrMateriaNoInscriptaMouseClicked(evt);
            }
        });
        jrMateriaNoInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMateriaNoInscriptaActionPerformed(evt);
            }
        });

        jbGrupoMat.add(jrMateriaInscripta);
        jrMateriaInscripta.setText("Materias Inscriptas");
        jrMateriaInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMateriaInscriptaActionPerformed(evt);
            }
        });

        jtMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMateria);

        jbInscribir.setText("Inscribir");

        jbNoInscribir.setText("Anular Inscripcion");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jcbListaAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbInscribir)
                        .addGap(68, 68, 68)
                        .addComponent(jbNoInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrMateriaInscripta)
                        .addGap(48, 48, 48)
                        .addComponent(jrMateriaNoInscripta)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMateriaNoInscripta)
                    .addComponent(jrMateriaInscripta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbNoInscribir)
                    .addComponent(jbSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       
        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrMateriaInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMateriaInscriptaActionPerformed

        llenarLista();

    }//GEN-LAST:event_jrMateriaInscriptaActionPerformed

    private void jrMateriaNoInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMateriaNoInscriptaActionPerformed

        llenarLista();

    }//GEN-LAST:event_jrMateriaNoInscriptaActionPerformed

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        // TODO add your handling code here:  
        
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jrMateriaNoInscriptaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrMateriaNoInscriptaMouseClicked
        
        
    }//GEN-LAST:event_jrMateriaNoInscriptaMouseClicked

    private void jrMateriaNoInscriptaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrMateriaNoInscriptaItemStateChanged
       
        
    }//GEN-LAST:event_jrMateriaNoInscriptaItemStateChanged

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged

        llenarLista();
        
    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbGrupoMat;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbNoInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JRadioButton jrMateriaInscripta;
    private javax.swing.JRadioButton jrMateriaNoInscripta;
    private javax.swing.JTable jtMateria;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Anio");
        jtMateria.setModel(modelo);
        
    }
    
    private void cargarCombo() {

        AlumnoData ad = new AlumnoData();
        List<Alumno> cblistaAlu = ad.listarAlumnos();
        
        for (int i = 0; i < cblistaAlu.size(); i++) {

            jcbListaAlumnos.addItem(new Alumno(cblistaAlu.get(i).getIdAlumno(),
                    cblistaAlu.get(i).getDni(),
                    cblistaAlu.get(i).getApellido(),
                    cblistaAlu.get(i).getNombre()));

        }
    }    
    
    private void llenarLista() {
        
        Alumno selectedItem = (Alumno) jcbListaAlumnos.getSelectedItem();
        int selectedID = selectedItem.getIdAlumno();
        InscripcionData md = new InscripcionData();

        if (jrMateriaNoInscripta.isSelected()) {

            List<Materia> noInsc = md.ObtenerMateriasNOCursadas(selectedID);
            modelo.setRowCount(0);

            for (Materia mat : noInsc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});

            }
        }

        if (jrMateriaInscripta.isSelected()) {

            modelo.setRowCount(0);
            List<Materia> insc = md.ObtenerMateriasCursadas(selectedID);

            for (Materia mat : insc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});

            }
        }
    }
}

