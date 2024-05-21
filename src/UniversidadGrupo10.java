/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo10;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author helma
 */
public class UniversidadGrupo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Connection con = Conexion.getConexion();
//        Alumno juan = new Alumno(12223,"luna","juan",LocalDate.of(1980,4,23),true);
//        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(juan);
        
         MateriaData mate = new MateriaData();
        //      AGREGAR MATERIA
//        Materia historia = new Materia(11,"historia ",1,true);
////        mate.guardarMateria(historia);

    //MODIFICAR MATERIA 
//        Materia geografia = new Materia(11,"geografia",2,true);
//        mate.modificarMateria(geografia);
//      ELIMINAR MATERIA
//        mate.eliminarMateria(11);
        //BUSCAR MATERIA
//        System.out.println(mate.buscarMateria(7));
        //LISTAR MATERIAS
        for(Materia materia:mate.listarMaterias()){
            System.out.println(materia.getIdMateria());
            System.out.println(materia.getNombre());
            System.out.println(materia.getAnioMateria());
        }
    }
    
}
