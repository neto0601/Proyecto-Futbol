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
public class hechos {
     connexion cn = new connexion();

    public void insertar(String IdHecho, String IdTipo, String IdPartido, String carnet, String minuto) {
        cn.UID("INSERT INTO hechos(IdHecho,IdTipo,IdPartido,carnet,minuto) VALUES('" +IdHecho + "','" + IdTipo + "','" + IdPartido + "','" + carnet + "','" + minuto + "')");
    }
   
    public void modificar(String IdHecho, String IdTipo, String IdPartido, String carnet, String minuto) {
        cn.UID("UPDATE hechos SET IdTipo='" + IdTipo + "',IdPartido='" + IdPartido + "',carnet='" + carnet + "',minuto='" + minuto + "' WHERE IdHecho='" + IdHecho + "'");
    }

    public void eliminar(String IdHecho) {
        cn.UID("DELETE FROM hechos WHERE IdHecho='" + IdHecho + "'");
    }

    public ResultSet buscar(String IdHecho) {
        return (cn.getValores("SELECT * FROM hechos WHERE IdHecho='" + IdHecho + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdHecho) FROM hechos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdHecho) FROM hechos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdHecho,IdTipo,IdPartido,carnet,minuto FROM hechos"));
    }
    
}
