
package sistemafutbol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class sqlJugadores extends conexion{
    
    private jugadores js;
    
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
    
    
    
    
    
    
}
