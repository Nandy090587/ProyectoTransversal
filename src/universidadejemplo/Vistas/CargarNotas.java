package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class CargarNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public CargarNotas() {

        initComponents();
        armarCabecera();
        cargarCombo();
    }
    
    InscripcionData id = new InscripcionData();
    AlumnoData ad = new AlumnoData();
    MateriaData md = new MateriaData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoNota = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno: ");

        jtAlumnoNota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlumnoNota);
        if (jtAlumnoNota.getColumnModel().getColumnCount() > 0) {
            jtAlumnoNota.getColumnModel().getColumn(3).setResizable(false);
        }

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton2))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed

    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged
        
        cargarLista();
        
    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        int selec = jtAlumnoNota.getSelectedRow();
       
        if (selec >= 0) {
            
            Materia mat = (Materia) jtAlumnoNota.getValueAt(selec, 1);
            int idA = (Integer) jtAlumnoNota.getValueAt(selec, 0);
            int idM = mat.getIdMateria();
            String nota = (String) jtAlumnoNota.getValueAt(selec, 2).toString();
            id.actualizarNota(idA, idM, Double.parseDouble(nota));
            
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JTable jtAlumnoNota;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jtAlumnoNota.setModel(modelo);

    }

    private void cargarCombo() {

        List<Alumno> cblistaAlu = ad.listarAlumnos();

        for (int i = 0; i < cblistaAlu.size(); i++) {

            jcbListaAlumnos.addItem(new Alumno(cblistaAlu.get(i).getIdAlumno(),cblistaAlu.get(i).getDni(),
                    cblistaAlu.get(i).getApellido(),
                    cblistaAlu.get(i).getNombre()));

        }
    }
        public void cargarLista(){
            
            Alumno itemSelec = (Alumno) jcbListaAlumnos.getSelectedItem();
            int selectID = itemSelec.getIdAlumno();
            List<Inscripcion> inscri = id.ObternerInscripcionesPorAlumno(selectID);
            modelo.setRowCount(0);

            for (Inscripcion ins: inscri){

                modelo.addRow(new Object[]{ ins.getAlumno().getIdAlumno(), ins.getMateria(),ins.getNota()});
              
        }
    }
}
