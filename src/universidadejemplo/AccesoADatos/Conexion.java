
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadejemplo";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){
        
    }
    
    public static  Connection getConexion(){
        
        if (connection == null) {
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");

                connection = DriverManager.getConnection(URL + DB , USUARIO , PASSWORD);

                JOptionPane.showMessageDialog(null, "Conectado ");

            } catch (ClassNotFoundException ex) {
               
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers: "+ex.getMessage());
            
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Error a Conectarse a la Base Datos"+ex.getMessage());
            
            } 
        }
        
        return connection;
    
    }  

    PreparedStatement prepareStatement(String sql, int RETURN_GENERATED_KEYS) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
    
}
