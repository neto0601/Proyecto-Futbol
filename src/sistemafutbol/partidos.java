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
public class partidos {
    connexion cn = new connexion();

    public void insertar(String IdPartido, String EquipoL, String Equipov, String IdCancha, String Fecha) {
        cn.UID("INSERT INTO partidos(IdPartido,EquipoL,Equipov,IdCancha,Fecha) VALUES('" +IdPartido + "','" + EquipoL + "','" + Equipov + "','" + IdCancha + "','" + Fecha + "')");
    }
   
    public void modificar(String IdPartido, String EquipoL, String Equipov, String IdCancha, String Fecha) {
        cn.UID("UPDATE partidos SET EquipoL='" + EquipoL + "',Equipov='" + Equipov + "',IdCancha='" + IdCancha + "',Fecha='" + Fecha + "' WHERE IdPartido='" + IdPartido + "'");
    }

    public void eliminar(String IdPartido) {
        cn.UID("DELETE FROM partidos WHERE IdPartido='" + IdPartido + "'");
    }

    public ResultSet buscar(String IdPartido) {
        return (cn.getValores("SELECT * FROM partidos WHERE IdPartido='" + IdPartido + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdPartido) FROM partidos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdPartido) FROM partidos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdPartido,EquipoL,Equipov,IdCancha,Fecha FROM partidos"));
    }
    
}
