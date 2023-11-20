package modelo;

public abstract class Trabajador {
    private String tituloProfesional;
    private String nombreTrabajador;
    private String direccion;
    private String estadoCivil;
    private String rut;
    private String horario;

    public Trabajador(String tituloProfesional, String nombreTrabajador, String direccion, String estadoCivil, String rut, String horario) {
        this.tituloProfesional = tituloProfesional;
        this.nombreTrabajador = nombreTrabajador;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horario = horario;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "modelo.Trabajador:\n" +
                "Nombre: " + nombreTrabajador + "\n" +
                "Rut: " + rut + "\n" +
                "Titulo profesional: " + tituloProfesional + "\n" +
                "Estado civil: " + estadoCivil + "\n" +
                "Direccion: " + direccion + "\n" +
                "Horario: " + horario + "\n";
    }
}