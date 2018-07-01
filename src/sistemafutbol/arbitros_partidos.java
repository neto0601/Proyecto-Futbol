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
public class arbitros_partidos {
    connexion cn = new connexion();

    public void insertar(String IdRegistro, String IdArbitro, String IdPartido, String Puesto) {
        cn.UID("INSERT INTO arbitros_partidos(IdRegistro,IdArbitro,IdPartido,Puesto) VALUES('" +IdRegistro + "','" + IdArbitro + "','" + IdPartido + "','" + Puesto + "')");
    }
   
    public void modificar(String IdRegistro, String IdArbitro, String IdPartido, String Puesto) {
        cn.UID("UPDATE arbitros_partidos SET IdArbitro='" + IdArbitro + "',IdPartido='" + IdPartido + "',Puesto='" + Puesto  + "' WHERE IdRegistro='" + IdRegistro + "'");
    }

    public void eliminar(String IdRegistro) {
        cn.UID("DELETE FROM arbitros_partidos WHERE IdRegistro='" + IdRegistro + "'");
    }

    public ResultSet buscar(String IdRegistro) {
        return (cn.getValores("SELECT * FROM arbitros_partidos WHERE IdRegistro='" + IdRegistro + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdRegistro) FROM arbitros_partidos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdRegistro) FROM arbitros_partidos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdRegistro,IdArbitro,IdPartido,Puesto FROM arbitros_partidos"));
    }
    
}
