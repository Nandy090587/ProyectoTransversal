
package universidadejemplo;

import java.time.LocalDate;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

public class universidadejemplo {

    public static void main(String[] args) {
        
        AlumnoData alum= new AlumnoData();
//        Alumno alu = new Alumno(45666333,"Mansur","Analia",LocalDate.of(2003, 10, 10),true);
//        alum.guardarAlumno(alu);
          alum.eliminarAlumnoDni(49310852);
//        Alumno alumnoEncontrado = alum.buscarAlumnoDni(34589602);
//        System.out.println(alumnoEncontrado.toString());
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//        Alumno Martin = alum.buscarAlumno(1);
//        Materia mat = md.buscarMateria(4);
//        Inscripcion insc = id.guardarInscripcion(Martin,mat,4);
    
    }
    
}
