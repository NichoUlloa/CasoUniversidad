package modelo;

public class CarreraUniversitaria {
    private String nombreCarrera;
    private String facultad;
    private String duracion;

    public CarreraUniversitaria(String nombreCarrera, String duracion, String facultad) {
        this.nombreCarrera = nombreCarrera;
        this.duracion = duracion;
        this.facultad = facultad;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "modelo.CarreraUniversitaria " + getNombreCarrera() + "\n" +
                "duracion " + getDuracion();
    }
}