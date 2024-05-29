/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import AccesoADatos.*;
import Entidades.*;
import java.sql.Connection;
import java.time.LocalDate;

public class UniversidadGrupo10 {

    public static void main(String[] args) {

//        Connection con = Conexion.getConexion();
        System.out.println("commit de prueba. no le den bola");
        AlumnoData alu = new AlumnoData();
        MateriaData mate = new MateriaData();
        InscripcionData id = new InscripcionData();
        
///////////////////////////////////////////////////////////////////////////////////////////////

        //GUARDAR ALUMNO
        
        //Alumno juan = new Alumno(675675,"Diaz","Pablo",LocalDate.of(2000,1,04),true);
        //alu.guardarAlumno(juan);
        
        // BUSCAR ALUMNO POR DNI
//        Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(12223);
//        if(alumnoEncontrado!=null){
//            System.out.println("dni: " + alumnoEncontrado.getDni());
//            System.out.println("apellido: " + alumnoEncontrado.getApellido());
//            System.out.println("nombre: " + alumnoEncontrado.getNombre());
//        }
        // LISTAR ALUMNOS.
        
//        for(Alumno alumno: alu.listarAlumnos()){
//            System.out.println("dni: " + alumno.getDni());
//            System.out.println("nombre: " + alumno.getNombre());
//            System.out.println("apellido: " + alumno.getApellido());
//            System.out.println("fecha nacimiento: " + alumno.getFechaNac());
//        }

///////////////////////////////////////////////////////////////////////////////////////////////

//              //AGREGAR MATERIA

        //Materia materia = new Materia(11,"matematica ",1,true);
        //mate.guardarMateria(materia);
        
        //MODIFICAR MATERIA 
        
        //Materia geografia = new Materia(2,"laboratorio",2,true);
        //mate.modificarMateria(geografia);
        
//      ELIMINAR MATERIA
        //mate.eliminarMateria(1);
        
        //BUSCAR MATERIA
        //System.out.println(mate.buscarMateria(3));
        
        //LISTAR MATERIAS       
        
//        for(Materia materia:mate.listarMaterias()){
//            System.out.println("id: " + materia.getIdMateria());
//            System.out.println("nombre: " +materia.getNombre());
//            System.out.println("anio: " +materia.getAnioMateria());
//            System.out.println("");
//        }

///////////////////////////////////////////////////////////////////////////////////////////////

        //GUARDAR INSCRIPCION.
        
//      AlumnoData ad = new AlumnoData();
//      MateriaData md = new MateriaData();
//      Alumno alumn = ad.buscarAlumno(5);
//      Materia matee = md.buscarMateria(1);
//      Inscripcion insc = new Inscripcion(alumn,matee,10);
//      id.guardarInscripcion(insc); 

        //ACTUALIZAR NOTA.
        
        //InscripcionData id = new InscripcionData();
        //id.actualizarNota(1,2,8);
        
        //BORRAR INSCRIPCION.
        
        //id.borrarInscripcionMateriaAlumno(1,3);
        
        //OBTENER INSCRIPCIONES.
        
//        for(Inscripcion ins : id.obtenerInscripciones()){
//        
//        System.out.println("\nid: " + ins.getIdInscripcion());
//        System.out.println("Apellido: " + ins.getAlumno().getApellido());
//        System.out.println("Materia: " + ins.getMateria().getNombre());
//        }

        // OBTENER MATERIAS CURSADAS POR ALUMNO
        
//        for (Materia materia: id.obtenerMateriasCursadas(1)){
//        
//        System.out.println("nombre: " + materia.getNombre());
//        }

        //OBTENER MATERIAS NO CURSADAS POR ALUMNO
        
//        for (Materia materia: id.obtenerMateriasNOCursadas(2)){
//        
//        System.out.println("nombre: " + materia.getNombre());
//        }

          // OBTENER INSCRIPCIONES POR ALUMNO.
          
//          for (Inscripcion ins : id.obtenerInscripcionesPorAlumno(2)){
//              
//              System.out.println("\nid: " + ins.getIdInscripcion());
//              System.out.println("Apellido: " + ins.getAlumno().getApellido());
//              System.out.println("Materia: " + ins.getMateria().getNombre());   
//          }
          
          // OBTENER ALUMNOS POR MATERIA.
          
//          for(Alumno alumno : id.obtenerAlumnosXMateria(2)){
//              
//              System.out.println("\nnombre: " + alumno.getNombre());
//              System.out.println("apellido: " + alumno.getApellido());
//              System.out.println("fecha de nacimiento: " + alumno.getFechaNac());
//          }
    }
}

