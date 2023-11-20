package modelo;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombreUniversidad;
    private ArrayList<String> direccionesAsociadas;
    private String tipoUniversidad;
    private List<Facultad> facultades;
    private List<Trabajador> trabajadores;

    //constructor
    public Universidad(String nombreUniversidad, ArrayList<String> direccionesAsociadas, String tipoUniversidad, List<Facultad> facultades, List<Trabajador> trabajadores) {
        this.nombreUniversidad = nombreUniversidad;
        this.direccionesAsociadas = direccionesAsociadas;
        this.tipoUniversidad = tipoUniversidad;
        this.facultades = facultades;
        this.trabajadores = trabajadores;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public ArrayList<String> getDireccionesAsociadas() {
        return direccionesAsociadas;
    }

    public void setDireccionesAsociadas(ArrayList<String> direccionesAsociadas) {
        this.direccionesAsociadas = direccionesAsociadas;
    }

    public String getTipoUniversidad() {
        return tipoUniversidad;
    }

    public void setTipoUniversidad(String tipoUniversidad) {
        this.tipoUniversidad = tipoUniversidad;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void agregarFacultad(Facultad facultad){
        this.facultades.add(facultad);
    }

    public void agregarTrabajador(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }

    public void agregarDireccion(String direccion){
        this.direccionesAsociadas.add(direccion);
    }

    //Obtener todos los profesores de una facultad, de acuerdo al nombre del profesor. por ejemplo si juan, pedro y diego estan en una facultad, si te ingreso por parametro juan debes entregarme todos los profesores de la facultad
    public List<Profesor> obtenerProfesoresDeUnaFacultadPorNombreDeOtroProfesor(String nombreProfesor){
        List<Profesor> profesores = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                for (Profesor profesor : departamento.getProfesores()) {
                    if (profesor.getNombreTrabajador().equals(nombreProfesor)){
                        profesores.addAll(departamento.getProfesores());
                    }
                }
            }
        }
        return profesores;
    }

    public List<CarreraUniversitaria> obtenerCarrerasPorFacultad(String nombreFacultad){
        List<CarreraUniversitaria> carreras = new ArrayList<>();
        for (Facultad facultad : facultades) {
            if (facultad.getNombreFacultad().equals(nombreFacultad)){
                for (Departamento departamento : facultad.getDepartamentos()) {
                    carreras.addAll(departamento.getCarrerasUniversitarias());
                }
            }
        }
        return carreras;
    }

    public List<Profesor> obtenerProfesoresPorJornada(String nombreDepartamento, String tipoJornada){
        List<Profesor> profesores = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                if (departamento.getNombreDepartamento().equals(nombreDepartamento)){
                    for (Profesor profesor : departamento.getProfesores()) {
                        if (profesor.getTipoJornada().equals(tipoJornada)){
                            profesores.add(profesor);
                        }
                    }
                }
            }
        }
        return profesores;
    }

    public List<Profesor> obtenerProfesores(){
        List<Profesor> profesores = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                profesores.addAll(departamento.getProfesores());
            }
        }
        return profesores;
    }

    public List<Administrativo> obtenerAdministrativos(){
        List<Administrativo> administrativos = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                administrativos.addAll(departamento.getAdministrativos());
            }
        }
        return administrativos;
    }

    public List<Trabajador> obtenerTrabajadores(){
        List<Trabajador> trabajadores = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                trabajadores.addAll(departamento.getAdministrativos());
                trabajadores.addAll(departamento.getProfesores());
            }
        }
        return trabajadores;
    }

    @Override
    public String toString() {
        return "modelo.Universidad:\n" +
                "Nombre: " + getNombreUniversidad() + "\n" +
                "Tipo: " + getTipoUniversidad() + "\n" +
                "Direcciones asociadas: " + getDireccionesAsociadas() + "\n";
    }
}