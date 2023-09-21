
package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class ListadoAlumnoPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo=new DefaultTableModel();
    
    public ListadoAlumnoPorMateria() {
        
        initComponents();
        armarCabecera();
        cargarCombo();
        
    }
    
    InscripcionData id = new InscripcionData();
    MateriaData md = new MateriaData();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jcbListaMaterias = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Alumno por Materia");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione una Materia");

        jtTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaMateria);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbListaMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbListaMateriasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbListaMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbListaMateriasItemStateChanged
        
        cargarLista();
                
    }//GEN-LAST:event_jcbListaMateriasItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbListaMaterias;
    private javax.swing.JTable jtTablaMateria;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("IdAlumno");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        jtTablaMateria.setModel(modelo);

    }

    private void cargarCombo() {

        List<Materia> cblistaMat = md.ListarMaterias();

        for (int i = 0; i < cblistaMat.size(); i++) {

            jcbListaMaterias.addItem(new Materia(cblistaMat.get(i).getIdMateria(),cblistaMat.get(i).getNombre(),
                     cblistaMat.get(i).getAnio(),cblistaMat.get(i).isEstado()));

        }
    }
    
    private void cargarLista() {
          
        Materia itemSele = (Materia) jcbListaMaterias.getSelectedItem();
        int selectID = itemSele.getIdMateria();
        List<Alumno> Insc = id.obtenerAlumnosXMateria(selectID);
        modelo.setRowCount(0);

            for (Alumno alu : Insc) {

                modelo.addRow(new Object[]{alu.getIdAlumno(),
                    alu.getDni(), alu.getNombre(), alu.getApellido()});
              
            }        
    }
}
