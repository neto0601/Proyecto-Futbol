package sistemafutbol;

import java.sql.ResultSet;

/**
 *
 * @author H ERICK
 */
public class arbitros {
    connexion cn = new connexion();

    public void insertar(String IdArbitro, String nombres, String apellidos) {
        cn.UID("INSERT INTO arbitros(IdArbitro,nombres,apellidos) VALUES('" + IdArbitro + "','" + nombres + "','" + apellidos + "')");
    }
   
    public void modificar(String IdArbitro, String nombres, String apellidos) {
        cn.UID("UPDATE arbitros SET nombres='" + nombres + "',apellidos='" + apellidos + "' WHERE IdArbitro='" + IdArbitro + "'");
    }

    public void eliminar(String IdArbitro) {
        cn.UID("DELETE FROM arbitros WHERE IdArbitro='" + IdArbitro + "'");
    }

    public ResultSet buscar(String IdArbitro) {
        return (cn.getValores("SELECT * FROM arbitros WHERE IdArbitro='" + IdArbitro + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(IdArbitro) FROM arbitros"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(IdArbitro) FROM arbitros"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT IdArbitro,nombres,apellidos FROM arbitros"));
    }
}
