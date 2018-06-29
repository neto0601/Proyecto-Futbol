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
public class tipos_hechos {
     connexion cn = new connexion();

    public void insertar(String IdTipo, String Descripcion) {
        cn.UID("INSERT INTO tipos_hechos(IdTipo,Descripcion) VALUES('" + IdTipo + "','" + Descripcion + "')");
    }
   
    public void modificar(String IdTipo, String Descripcion) {
        cn.UID("UPDATE tipos_hechos SET Descripcion='" + Descripcion + "' WHERE IdTipo='" + IdTipo + "'");
    }

    public void eliminar(String IdTipo) {
        cn.UID("DELETE FROM tipos_hechos WHERE IdTipo='" + IdTipo + "'");
    }

    public ResultSet buscar(String IdTipo) {
        return (cn.getValores("SELECT * FROM tipos_hechos WHERE IdTipo='" + IdTipo + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdTipo) FROM tipos_hechos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdTipo) FROM tipos_hechos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdTipo,Descripcion FROM tipos_hechos"));
    }
    
}
