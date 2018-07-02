package sistemafutbol;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MetodoLogin {

    conexion cn = new conexion();
    
    
    public int validar(){
        String user = Login.jtfUsuario.getText();
        String pass =String.valueOf(Login.jPassword.getPassword());
        
        int resultado =0;
        
        String sql ="SELECT * FROM usuario WHERE user='"+user+"' AND contraseña='"+pass+"'";
        Connection conect;
       
            conect = cn.getConexion();
        
        
        try {
            
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           if(rs.next()){
               resultado=1;
           } 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        return resultado;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
