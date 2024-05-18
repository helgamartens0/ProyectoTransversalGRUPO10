/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author helma
 */
public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    //como necesito controlar la cantidad de instancias de conexion, le hago un
    //constructor privado. Por lo que no voy a poder instanciar objetos de esta clase.
    //por lo que tengo que utilizar metodos estaticos
    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                //cargamos los drivers de conexion
                Class.forName("org.mariadb.jdbc.Driver");

                connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);

//                JOptionPane.showMessageDialog(null, "CONECTADO");
                //puede ser q me haya equivocado en alguno de los parametros u olvidado de 
                //levantar el administrador de base de datos, por lo que tiene que haber otro catch
                // y es el de SQLException, lo que no significa error de drives sino de conexion
            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
//                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
        return connection;
    }
}
