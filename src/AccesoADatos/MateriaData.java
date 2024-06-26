/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author helma
 */
public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre,año,estado)"
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3,materia.isActivo() );
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys(); 
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"materia guardada correctamente");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");

        }
    }
    public void modificarMateria(Materia materia){
        String sql="UPDATE materia SET nombre=?, año=?, estado=? "
                    + "WHERE idMateria=?";
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3,materia.isActivo() );
            ps.setInt(4,materia.getIdMateria());
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia modificada");                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");                
        }
    }
    public void eliminarMateria(int id){
        String sql="UPDATE `materia` SET estado =0 WHERE idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia eliminada ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
    }
    public Materia buscarMateria(int id){
        String sql="SELECT `nombre`, `año` FROM `materia` WHERE idMateria=? AND estado=1";
        Materia materia=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                materia= new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe materia con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        return materia;
        
    }   
    public List<Materia> listarMaterias(){
        String sql="SELECT idMateria, nombre,año FROM materia WHERE estado=1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materia materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        
        }
        return materias;
    }
}
