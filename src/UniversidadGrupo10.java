/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo10;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
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
        
        Connection con = Conexion.getConexion();
        Alumno juan = new Alumno(12223,"luna","juan",LocalDate.of(1980,4,23),true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);
    }
    
}
