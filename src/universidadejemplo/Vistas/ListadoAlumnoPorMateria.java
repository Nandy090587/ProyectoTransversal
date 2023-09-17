
package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;


public class ListadoAlumnoPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo=new DefaultTableModel();
    
    public ListadoAlumnoPorMateria() {
        
        initComponents();
        armarCabecera();
        cargarCombo();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbListaMaterias;
    private javax.swing.JTable jtTablaMateria;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
        
        modelo.addColumn("IdMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Anio");
        modelo.addColumn("Estado");
        jtTablaMateria.setModel(modelo);
        
    }

private void cargarCombo(){

        MateriaData md = new MateriaData();
        List<Materia> cblistaMat = md.ListarMaterias();
        
        for(int i = 0 ; i < cblistaMat.size() ; i++ ){
            
           jcbListaMaterias.addItem(new Materia(cblistaMat.get(i).getIdMateria()
                   ,cblistaMat.get(i).getNombre()
                   ,cblistaMat.get(i).getAnio()
                   ,cblistaMat.get(i).isEstado()));
           
        }
    }

}
