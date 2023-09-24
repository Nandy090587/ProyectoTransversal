package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class CargarNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        boolean[] canEdit = new boolean[]{
                    false, false, true
            };

        @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
    };

    public CargarNotas() {

        initComponents();
        armarCabecera();
        cargarCombo();
        jbGuardar.setEnabled(false);
    }
    
    InscripcionData id = new InscripcionData();
    AlumnoData ad = new AlumnoData();
    MateriaData md = new MateriaData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoNota = new javax.swing.JTable();

        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Administracion1.png"))); // NOI18N

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(383, 380));

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
        jtAlumnoNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnoNotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlumnoNota);
        if (jtAlumnoNota.getColumnModel().getColumnCount() > 0) {
            jtAlumnoNota.getColumnModel().getColumn(3).setResizable(false);
        }

        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbListaAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jbGuardar)
                .addGap(82, 82, 82)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(87, 87, 87))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcbListaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaAlumnosItemStateChanged

        cargarLista();

    }//GEN-LAST:event_jcbListaAlumnosItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        int selec = jtAlumnoNota.getSelectedRow();

        try {

            Materia mat = (Materia) jtAlumnoNota.getValueAt(selec, 1);
            int idA = (Integer) jtAlumnoNota.getValueAt(selec, 0);
            int idM = mat.getIdMateria();
            double nota = Double.parseDouble(jtAlumnoNota.getValueAt(selec, 2).toString());

            if (nota >= 0 && nota <= 10) {

                id.actualizarNota(idA, idM, nota);

            } else {

                JOptionPane.showMessageDialog(null, "Ingrese un valor entre 0 y 10 ");

            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros entre 0 y 10");

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtAlumnoNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnoNotaMouseClicked
        
        jbGuardar.setEnabled(true);
        
    }//GEN-LAST:event_jtAlumnoNotaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
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
