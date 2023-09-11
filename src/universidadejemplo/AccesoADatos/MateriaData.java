
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;
import java.util.List;
import java.util.ArrayList;


public class MateriaData {
    private Connection con=null;

    public MateriaData() {
    }
    
    public void guardarMateria(Materia mat){
       String sql="INSERT INTO materia (nombre,año,estado)"+ "VALUES(?,?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
        ps.setString(1, mat.getNombre());
        ps.setInt(2,mat.getAnio());
        ps.setBoolean(3, mat.isEstado());
       
            
        ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                mat.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada ");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla materia "+ex.getMessage());
        }
   
    } 
    
    public Materia buscarMateria(int id) {
        String sql="SELECT nombre, año, estado, FROM materia WHERE idMateria = ? AND estado = 0";
        Materia materia=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                materia=new Materia();
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null,"No exite esa materia");
            }
            
        } catch (SQLException ex) {
           
            
            JOptionPane.showMessageDialog(null, "Error al buscar la materia "+ex.getMessage());




        }
        return materia;   
        
    } 
    
    public void modificarMateria(Materia materia){
        
        String sql="UPDATE materia SET nombre= ?, año= ?, estado= ? "
                +"WHERE idMateria=?";
                
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3,materia.isEstado());
            
            int exito= ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar con tabla materia"+ex.getMessage());
        }
    }
    public List<Materia> ListarMaterias(){
        
        List<Materia> materiaList = new ArrayList<>();
       
        
        
        return materiaList;
    
    
    }

            
}
