
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import universidadejemplo.Entidades.Alumno;


public class AlumnoData {
   
    private Connection con=null;
    
    
    
    public AlumnoData(){
        
        con=Conexion.getConexion();
        
    }
    
    
    public void guardarAlumno(Alumno alumno ){
        
        String sql="INSERT INTO alumno (dni, apellido, nombre ,fechaNacimieto ,estado)"+ "VALUES(?,?,?,?,?)";
        
        PreparedStatement ps;
       
        try {
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                alumno.setIdAlumno(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Alumno Guardado ");
            
            }
            
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla alumno " + ex.getMessage());
        
        }

        
        
        
        
    }
    
    public void modificarAlumno(Alumno alumno){
        
        String sql="UPDATE alumno SET dni= ?, apellido= ?, nombre= ?, fechaNacimiento= ?, estado= ? "
                +"WHERE idAlumno=?";
                
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Alumno Modificado");
           
            }
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error "+ex.getMessage());
        
        }
        
    }
    
    public void eliminarAlumno(int id) {

        String sql = "UPDate alumno SET estado = 0 WHERE idAlumno = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }

    }
    
    public Alumno buscarAlumno(int id){
        
        String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno=null;
        
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString ("Apellido"));
                alumno.setNombre(rs.getString ("nombre"));;
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
            }else{
                
                JOptionPane.showMessageDialog(null,"No exite ese alumno");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al buscar Alumno "+ex.getMessage());

        }
        return alumno;   
        
    }
    
    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Alumno alumno = new Alumno();

                alumno.setIdAlumno(rs.getInt("idAlumno"));
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
    
    public Alumno buscarAlumnodni(int dni){
        
        String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        Alumno alumno=null;
        
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString ("Apellido"));
                alumno.setNombre(rs.getString ("nombre"));;
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
            }else{
                
                JOptionPane.showMessageDialog(null,"No exite ese alumno");
            
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al buscar Alumno "+ex.getMessage());

        }
        return alumno;   
        
    }
    
    
}