package modelo;

import java.util.List;

public class Facultad {
    private String nombreFacultad;
    private double latitud;
    private List<Departamento> departamentos;

    public Facultad(String nombreFacultad, double latitud, List<Departamento> departamentos) {
        this.nombreFacultad = nombreFacultad;
        this.latitud = latitud;
        this.departamentos = departamentos;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return "modelo.Facultad " + getNombreFacultad() + "\n" +
                "latitud " + getLatitud();
    }
}