
package sistemafutbol;


public class jugadores {
    
    private String carnet, nombres, apellidos, carrera;
    private int IdEquipo;

    public jugadores(String carnet, String nombres, String apellidos,int IdEquipo, String carrera) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.IdEquipo=IdEquipo;
        this.carrera = carrera;
    }
   
    public jugadores(){
        
    }
    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getIdequipo() {
        return IdEquipo;
    }

    public void setIdequipo(int IdEquipo) {
        this.IdEquipo = IdEquipo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}
