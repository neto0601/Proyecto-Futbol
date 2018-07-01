
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

        String sql = "INSERT INTO jugadores (carnet, nombres, apellidos,IdEquipo, carrera) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jds.getCarnet());
            ps.setString(2, jds.getNombres());
            ps.setString(3, jds.getApellidos());
            ps.setInt(4, jds.getIdequipo());
            ps.setString(5, jds.getCarrera());
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

        String sql = "UPDATE jugadores SET nombres = ?, apellidos = ?, IdEquipo=?, carrera= ? WHERE carnet = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jo.getNombres());
            ps.setString(2, jo.getApellidos());
            ps.setInt(3, jo.getIdequipo());
            ps.setString(4, jo.getCarrera());
            ps.setString(5, jo.getCarnet());
            
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
         ResultSet rs = stmt.executeQuery("SELECT * FROM jugadores WHERE carnet='" + carnet + "'");
         
         while(rs.next()){
             jo.setCarnet(rs.getString("carnet"));
             jo.setNombres(rs.getString("nombres"));
             jo.setApellidos(rs.getString("apellidos"));
             jo.setIdequipo(rs.getInt("IdEquipo"));
             jo.setCarrera(rs.getString("carrera"));
            
         }
        } catch (Exception e) {
            
            System.out.println("Error " + e.getMessage());
        }
         return jo;
            
        
    }
    
    
    
    
    
    
}
