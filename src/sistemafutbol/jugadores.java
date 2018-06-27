
package sistemafutbol;


public class jugadores {
    
    private String carnet, nombres, apellidos, carrera;

    public jugadores(String carnet, String nombres, String apellidos, String carrera) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
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

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}
