
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class InscripcionData {
    
    private Connection con=null;
    private MateriaData matData;
    private AlumnoData aluData;
    private AlumnoData ad=new AlumnoData();
    private MateriaData md=new MateriaData();
    
    
    
    

    public InscripcionData(){}
    
    public void guardarInscripcion(Inscripcion ins){
       
        String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria)VALUES(?,?,?)";
        
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
  
    public List<Inscripcion> ObternerInscripcionesPorAlumno(int idAlumno) {

        ArrayList<Inscripcion> inscripcionListAlu = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAmlumno = ?";
        
        try {	
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                inscripcionListAlu.add(insc);
                    
            }
            ps.close();            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al Obtener Inscripcion por Alumno "+ex.getMessage());

        }
               
        return inscripcionListAlu;
    }
    
    public List<Materia> ObtenerMateriasCursadas(int idAlumno) {

        ArrayList<Materia> materiasCursadas = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre,año FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria" + "AND inscricion.idAlumno = ?;";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idmateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
             
               materiasCursadas.add(materia);
            }
            
            JOptionPane.showMessageDialog(null,"Lista cargada con exito");
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return materiasCursadas;

    }
    
    public List<Materia> ObtenerMateriasNOCursadas(int idAlumno) {

        ArrayList<Materia> materiasNOCursadas = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 and idmateria not in" +
                "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idmateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
             
               materiasNOCursadas.add(materia);
            }
            
            JOptionPane.showMessageDialog(null,"Lista cargada con exito");
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla " + ex.getMessage());

        }

        return materiasNOCursadas;

    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){ 
           
        ArrayList<Alumno> alumnoMateria=new ArrayList<>();
    
        String slq="SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento. estado "
                +"FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno and idMateria = ? and a.estado = 1 ";
        
        try {
            
            PreparedStatement ps=con.prepareStatement(slq);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) { 
                
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnoMateria.add(alumno);
                
                
                JOptionPane.showMessageDialog(null, "");
                
            }
            
            ps.close(); 
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al Obtener Materia por Alumno "+ex.getMessage());
            
        }
        
         return alumnoMateria;
                
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota ){
        
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        
        PreparedStatement ps;
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas=ps.executeUpdate();
            
            if (filas>0) {
                
                JOptionPane.showMessageDialog(null, "Nota Actualizada Corectamente ");
                
            }
            
            ps.close();        
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al Actualizar Nota "+ex.getMessage());

        }
           
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno ,int idMateria){
   
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ? ";
        
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            
            if (filas>0) {
                
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada Correctamente ");
                
            }
            
            ps.close();
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al Borrar Inscripcion "+ex.getMessage());
            
        }
        
    }
    
}
