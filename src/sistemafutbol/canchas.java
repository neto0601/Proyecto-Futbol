/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafutbol;

import java.sql.ResultSet;

/**
 *
 * @author H ERICK
 */
public class canchas {
     connexion cn = new connexion();

    public void insertar(String IdCancha, String Nombre, String Ubicacion) {
        cn.UID("INSERT INTO canchas(IdCancha,Nombre,Ubicacion) VALUES('" + IdCancha + "','" + Nombre + "','" + Ubicacion + "')");
    }
   
    public void modificar(String IdCancha, String Nombre, String Ubicacion) {
        cn.UID("UPDATE canchas SET Nombre='" + Nombre + "',Ubicacion='" + Ubicacion + "' WHERE IdCancha='" + IdCancha + "'");
    }

    public void eliminar(String IdCancha) {
        cn.UID("DELETE FROM canchas WHERE IdCancha='" + IdCancha + "'");
    }

    public ResultSet buscar(String IdCancha) {
        return (cn.getValores("SELECT * FROM canchas WHERE IdCancha='" + IdCancha + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdCancha) FROM canchas"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdCancha) FROM canchas"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdCanchas,Nombre,Ubicacion FROM canchas"));
    }
    
}
