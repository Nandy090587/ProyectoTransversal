
package universidadejemplo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class UniversidadEjemplo {
   
    public static void main(String[] args) {
       
        try{
            //cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
            //cargar a la base de datos.
            Connection conexion=DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadEjemplo","root","");
        
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Debe agragar los driver al proyecto"+ex.getMessage());
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion"+ex.getMessage());
        }
        
        }
     
}
