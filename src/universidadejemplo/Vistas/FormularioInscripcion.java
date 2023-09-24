
package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;



public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        
         @Override
         public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
    
    };
    
    public FormularioInscripcion() {
        
        initComponents();
        armarCabecera();
        cargarCombo();
        
    }
    
    MateriaData md = new MateriaData();
    InscripcionData id = new InscripcionData();
    AlumnoData ad = new AlumnoData();    
    
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

        setBorder(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jcbListaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaAlumnosItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jbGrupoMat.add(jrMateriaNoInscripta);
        jrMateriaNoInscripta.setSelected(true);
        jrMateriaNoInscripta.setText("Materias no Inscriptas");
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMateria);
        if (jtMateria.getColumnModel().getColumnCount() > 0) {
            jtMateria.getColumnModel().getColumn(0).setResizable(false);
        }

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbNoInscribir.setText("Anular Inscripcion");
        jbNoInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNoInscribirActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jrMateriaInscripta)
                .addGap(48, 48, 48)
                .addComponent(jrMateriaNoInscripta)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
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

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged

        llenarLista();
        
    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        int fila = jtMateria.getSelectedRow();
        
        if (fila >= 0) {

            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            Alumno aID = ad.buscarAlumno(selectID);
            Materia mID = md.buscarMateria((int) jtMateria.getValueAt(fila, 0));
            Inscripcion ins = new Inscripcion(aID, mID, 0);
            id.guardarInscripcion(ins);

        }else{
            
            JOptionPane.showMessageDialog(null, "Eliga una fila");
        
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbNoInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNoInscribirActionPerformed
        
        int fila = jtMateria.getSelectedRow();
        
        if (fila >= 0) {

            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            id.borrarInscripcionMateriaAlumno(selectID, (int) jtMateria.getValueAt(fila, 0));

        }else{
            
            JOptionPane.showMessageDialog(null, "Eliga una fila");
        
        } 
    }//GEN-LAST:event_jbNoInscribirActionPerformed

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

        List<Alumno> cblistaAlu = ad.listarAlumnos();
        
        for (int i = 0; i < cblistaAlu.size(); i++) {

            jcbListaAlumnos.addItem(new Alumno(cblistaAlu.get(i).getIdAlumno(),
                    cblistaAlu.get(i).getDni(),
                    cblistaAlu.get(i).getApellido(),
                    cblistaAlu.get(i).getNombre()));

        }
    }    
    
    private void llenarLista() {
        
        Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
        int selectID = itemSelec.getIdAlumno();

        if (jrMateriaNoInscripta.isSelected()) {
            
            jbInscribir.setEnabled(true);
            jbNoInscribir.setEnabled(false);
            List<Materia> noInsc = id.ObtenerMateriasNOCursadas(selectID);
            modelo.setRowCount(0);

            for (Materia mat : noInsc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});

            }
        }

        if (jrMateriaInscripta.isSelected()) {
            
            jbNoInscribir.setEnabled(true);
            jbInscribir.setEnabled(false);
            modelo.setRowCount(0);
            List<Materia> insc = id.ObtenerMateriasCursadas(selectID);

            for (Materia mat : insc) {

                modelo.addRow(new Object[]{mat.getIdMateria(),
                    mat.getNombre(), mat.getAnio()});

            }
        }
    }
}

