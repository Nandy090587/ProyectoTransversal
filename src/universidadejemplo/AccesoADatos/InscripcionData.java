
package universidadejemplo.AccesoADatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Inscripcion;


public class InscripcionData {
    
    private Conexion con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion ins){
       String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria)"+ "VALUES(?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
            
            ps.setDouble(1,ins.getNota());
            ps.setInt(2,ins.getAlumno().getIdAlumno());
            ps.setInt(3,ins.getMateria().getIdMateria());
            
        ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla inscripcion "+ex.getMessage());
        } 
    }
    
}
