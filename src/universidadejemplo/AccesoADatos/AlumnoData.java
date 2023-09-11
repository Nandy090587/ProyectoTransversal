/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Hogar
 */
public class AlumnoData {
   
    private Connection con=null;
    
    
    
    public AlumnoData(){
        con=Conexion.getConexion();
        
    }
    
    
    public void guardarAlumno(Alumno alumno ){
        String sql="INSERT INTO alumno (dni, apellido, nombre ,fechaNacimieto ,estado)"+ "VALUES(?,?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getNombre());
        ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
        ps.setBoolean(5, alumno.isActivo());
            
            
        ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado ");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla alumno "+ex.getMessage());
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
    
    public void eliminarAlumno(int id){
        String sql="UPDate alumno SET estado = 0 WHERE idAlumno = ?";
        
        
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla"+ex.getMessage());



        }
        
    }
    
    public Alumno buscarAlumno(int id){
        
        String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 0";
        Alumno alumno=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                alumno=new Alumno();
                
                
            }
            
        } catch (SQLException ex) {
           
            
            JOptionPane.showMessageDialog(null, "Error al buscar Alumno "+ex.getMessage());




        }
        return alumno;
        
        
        
        
        
    }
    
    
    
}