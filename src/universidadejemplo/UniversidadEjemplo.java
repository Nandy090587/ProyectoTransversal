
package universidadejemplo;

import java.sql.Date;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.*;

public class universidadejemplo {

    public static void main(String[] args) {
        
        InscripcionData id = new InscripcionData();
        AlumnoData ad= new AlumnoData();
        MateriaData md = new MateriaData();
//        InscripcionData ins = new InscripcionData();
//        ins.ObtenerMateriasNOCursadas(2);
        Alumno aID = ad.buscarAlumno(1);
        Materia mID = md.buscarMateria(2);
        Inscripcion ins = new Inscripcion(aID, mID, 7);
        id.guardarInscripcion(ins);

//        Materia guardarMat = new Materia("Civica",3,true);
//        md.guardarMateria(guardarMat);
//        System.out.println(guardarMat.toString());     
//        for(Alumno alumno:alum.listarAlumnos())   
//            System.out.println(alumno.toString());
//            System.out.println("------------");
//        }      
//        Materia materiaEnc = md.buscarMateria(1);
//        System.out.println(materiaEnc.toString());
//        Alumno alu = new Alumno(45666333,"Mansur","Analia",LocalDate.of(2003, 10, 10),true);
//        alum.guardarAlumno(alu);
//        alum.eliminarAlumnoDni(49310852);
//        Alumno alumnoEncontrado = alum.buscarAlumnoDni(34589602);
//        System.out.println(alumnoEncontrado.toString());
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//        Alumno Martin = alum.buscarAlumno(1);
//        Materia mat = md.buscarMateria(4);
//        Inscripcion insc = id.guardarInscripcion(Martin,mat,4);
    
    }
    
}
