package modelo;

import java.util.List;

public class Departamento {
    private String nombreDepartamento;
    private List<Profesor> profesores;
    private List<Administrativo> administrativos;
    private List<CarreraUniversitaria> carrerasUniversitarias;

    public Departamento(String nombreDepartamento, List<Profesor> profesores, List<Administrativo> administrativos, List<CarreraUniversitaria> carrerasUniversitarias) {
        this.nombreDepartamento = nombreDepartamento;
        this.profesores = profesores;
        this.administrativos = administrativos;
        this.carrerasUniversitarias = carrerasUniversitarias;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public List<CarreraUniversitaria> getCarrerasUniversitarias() {
        return carrerasUniversitarias;
    }

    public void setCarrerasUniversitarias(List<CarreraUniversitaria> carrerasUniversitarias) {
        this.carrerasUniversitarias = carrerasUniversitarias;
    }

    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public void agregarAdministrativo(Administrativo administrativo){
        this.administrativos.add(administrativo);
    }

    public void agregarCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria){
        this.carrerasUniversitarias.add(carreraUniversitaria);
    }


    @Override
    public String toString() {
        return "modelo.Departamento " + getNombreDepartamento() + "\n" +
                "profesores " + getProfesores() + "\n" +
                "administrativos " + getAdministrativos() + "\n" +
                "carrerasUniversitarias " + getCarrerasUniversitarias();
    }
}