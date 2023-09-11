
package universidadejemplo;

import java.sql.Connection;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;




public class UniversidadEjemplo {
   
    public static void main(String[] args) {
       Connection con= Conexion.getConexion();
        AlumnoData alu=new AlumnoData();
        Alumno alumnoEncontrado=alu.buscarAlumno(4);
        MateriaData mat=new MateriaData();
    }    
}
