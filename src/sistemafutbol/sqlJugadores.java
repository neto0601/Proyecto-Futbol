
package sistemafutbol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class sqlJugadores extends conexion{
    
    private jugadores jo;
    
    public boolean registrar(jugadores jds){
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO jugadores (carnet, nombres, apellidos, carrera) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jds.getCarnet().toLowerCase());
            ps.setString(2, jds.getNombres().toLowerCase());
            ps.setString(3, jds.getApellidos().toLowerCase());
            ps.setString(4, jds.getCarrera().toLowerCase());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlJugadores.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean Eliminar(String carnet){
        PreparedStatement ps = null;
        Connection con = getConexion();
            
        try {
            ps = con.prepareStatement("DELETE FROM jugadores WHERE carnet=?");
            ps.setString(1, carnet);
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlJugadores.class.getName()).log(Level.SEVERE, null, ex);
           return false; 
        }
        
    }
    
    public boolean updateJugador(jugadores jo){
    
         PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE juguadores SET nombres = ?, apellidos = ?, carrera= ? WHERE carnet = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jo.getNombres());
            ps.setString(2, jo.getApellidos());
            ps.setString(3, jo.getCarrera());
            ps.setString(4, jo.getCarnet());
            
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlJugadores.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    
    }
    
     public jugadores buscarJugador(String carnet) {
    
         try {
         jo = new jugadores();
         Connection con = getConexion();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM jugadores where carnet = " + carnet);
         while(rs.next()){
             jo.setCarnet(rs.getString("carnet"));
             jo.setNombres(rs.getString("nombres"));
             jo.setApellidos(rs.getString("apellidos"));
             jo.setCarrera(rs.getString("carrera"));
             
         }
        } catch (Exception e) {
            
            System.out.println("Error " + e.getMessage());
        }
         return jo;
            
        
    }
    
    
    
    
    
    
}
