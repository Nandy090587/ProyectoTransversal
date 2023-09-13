
package universidadejemplo;

import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class universidadejemplo {

    public static void main(String[] args) {
        
        AlumnoData alum= new AlumnoData();
        Alumno alumnoEncontrado = alum.buscarAlumno(2);
        System.out.println(alumnoEncontrado.toString());
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//        
//        Alumno Martin = alum.buscarAlumno(1);
//        Materia mat = md.buscarMateria(4);
        //Inscripcion insc = id.guardarInscripcion(Martin,mat,4);
    }
    
}
