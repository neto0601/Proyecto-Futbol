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
public class equipos {
     connexion cn = new connexion();

    public void insertar(String IdEquipo, String Nombre) {
        cn.UID("INSERT INTO equipos(IdEquipo,Nombre) VALUES('" + IdEquipo + "','" + Nombre + "')");
    }
   
    public void modificar(String IdEquipo, String Nombre) {
        cn.UID("UPDATE equipos SET Nombre='" + Nombre  + "' WHERE IdEquipo='" + IdEquipo + "'");
    }

    public void eliminar(String IdEquipo) {
        cn.UID("DELETE FROM equipos WHERE IdEquipo='" + IdEquipo + "'");
    }

    public ResultSet buscar(String IdEquipo) {
        return (cn.getValores("SELECT * FROM eqipos WHERE IdEquipo='" + IdEquipo + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdEquipo) FROM equipos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdEquipo) FROM equipos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdEquipo,Nombre FROM equipos"));
    }
}
