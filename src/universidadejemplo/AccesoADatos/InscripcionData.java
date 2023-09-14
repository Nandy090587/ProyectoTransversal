
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Inscripcion;

public class InscripcionData {
    
    private Connection con=null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData(){}
    
    public void guardarInscripcion(Inscripcion ins){
       
        String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria)"+ "VALUES(?,?,?)";
        
        PreparedStatement ps;
        
        try {
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());

            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                ins.setIdInscripcion(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            
            }
            
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla inscripcion "
            +ex.getMessage());
        
        } 
    }
    
    public List<Inscripcion> ObtenerInscripciones(){
        
        ArrayList<Inscripcion> inscripcionList = new ArrayList<>();
        
            String sql="SELECT * FROM inscripcion WHERE 1";
                
        try {

            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("IdInscripcion"));
                inscripcion.setNota(rs.getDouble("Nota"));
                inscripcion.getAlumno().setIdAlumno(rs.getInt("IdAlumno"));
                inscripcion.getMateria().setIdMateria(rs.getInt("IdMateria"));

                inscripcionList.add(inscripcion);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al conectar con tabla materia" + ex.getMessage());
        }

        return inscripcionList;
    }
  
    public List<Inscripcion> ObternerInscripcionesPorAlumno(int id) {

        ArrayList<Inscripcion> inscripcionListAlu = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAmlumno = ?";
        
        return inscripcionListAlu;
    }
    public List<Inscripcion> ObtenerMateriasCursadas(int id) {

        List<Inscripcion> materiasCursadas = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Inscripcion ins = new Inscripcion();

                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            
            }
            
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return alumnos;

    }
}
