package test;

import modelo.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Inicializar();
    }
    public static void Inicializar(){
        Universidad universidad = new Universidad("modelo.Universidad de La Frontera", new ArrayList<String>(), "estatal", new ArrayList<Facultad>(), new ArrayList<Trabajador>());
        Facultad facultad = new Facultad("modelo.Facultad de Ingenieria y Ciencias", 0.0, new ArrayList<Departamento>());
        universidad.agregarFacultad(facultad);
        facultad.agregarDepartamento(new Departamento("modelo.Departamento de Ingenieria Civil Informatica", new ArrayList<Profesor>(), new ArrayList<Administrativo>(), new ArrayList<CarreraUniversitaria>()));

        facultad.getDepartamentos().get(0).agregarProfesor(new Profesor("Ingeniero Civil Informatico", "Juan Perez", "Direccion 123", "Soltero", "12345678-9", "8:00 - 18:00", "Completa", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarProfesor(new Profesor("Ingeniero Civil Informatico", "Pedro Perez", "Direccion 456", "Casado", "98765432-1", "8:00 - 18:00", "Completa", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarProfesor(new Profesor("Ingeniero Civil Informatico", "Maria Lopez", "Direccion 789", "Soltera", "12345678-9", "8:00 - 18:00", "Completa", "modelo.Facultad de Ingenieria y Ciencias"));

        facultad.getDepartamentos().get(0).agregarAdministrativo(new Administrativo("Psicologo", "Maria Perez", "Direccion 123", "Soltero", "12345678-9", "8:00 - 18:00", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarAdministrativo(new Administrativo("Ingeniero en administracion", "Pedro Lopez", "Direccion 456", "Casado", "98765432-1", "8:00 - 18:00", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarAdministrativo(new Administrativo("Ingeniero civil matematicas", "Juan Lopez", "Direccion 789", "Soltera", "12345678-9", "8:00 - 18:00", "modelo.Facultad de Ingenieria y Ciencias"));

        facultad.getDepartamentos().get(0).agregarCarreraUniversitaria(new CarreraUniversitaria("Ingenieria Civil Informatica", "12 semestres", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarCarreraUniversitaria(new CarreraUniversitaria("Ingenieria Civil Industrial", "12 semestres", "modelo.Facultad de Ingenieria y Ciencias"));
        facultad.getDepartamentos().get(0).agregarCarreraUniversitaria(new CarreraUniversitaria("Ingenieria Civil Mecanica", "12 semestres", "modelo.Facultad de Ingenieria y Ciencias"));

        universidad.getDireccionesAsociadas().add("Direccion 123");
        universidad.getDireccionesAsociadas().add("Direccion 456");
        universidad.getDireccionesAsociadas().add("Direccion 789");

        System.out.println("==== Datos de la universidad ====");
        System.out.println(universidad);
        System.out.println();

        System.out.println("==== Datos de la facultad ====");
        System.out.println(facultad);
        System.out.println();

        System.out.println("==== Datos del departamento ====");
        System.out.println(facultad.getDepartamentos().get(0));
        System.out.println();


        System.out.println("==== Lista de profesores de una facultad respecto a un profesor ====");
        System.out.println(universidad.obtenerProfesoresDeUnaFacultadPorNombreDeOtroProfesor("Juan Perez"));
        System.out.println();

        System.out.println("==== Lista de carreras universitarias de una facultad ====");
        System.out.println(universidad.obtenerCarrerasPorFacultad("modelo.Facultad de Ingenieria y Ciencias"));
        System.out.println();

        System.out.println("==== Lista de profesores contratados por jornada ====");
        System.out.println(universidad.obtenerProfesoresPorJornada("modelo.Departamento de Ingenieria Civil Informatica", "Completa"));
        System.out.println();

        System.out.println("==== Lista de todos los profesores de la universidad ====");
        System.out.println(universidad.obtenerProfesores());
        System.out.println();

        System.out.println("==== Lista de todos los administrativos de la universidad ====");
        System.out.println(universidad.obtenerAdministrativos());
        System.out.println();

        System.out.println("==== Lista de todos los trabajadores de la universidad ====");
        System.out.println(universidad.obtenerTrabajadores());
    }
}
