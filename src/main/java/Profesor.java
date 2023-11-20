public class Profesor extends Trabajador {
    private String tipoJornada;
    private String Facultad;

    public Profesor(String tituloProfesional, String nombreTrabajador, String direccion, String estadoCivil, String rut, String horario, String tipoJornada, String facultad) {
        super(tituloProfesional, nombreTrabajador, direccion, estadoCivil, rut, horario);
        this.tipoJornada = tipoJornada;
        this.Facultad = facultad;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        this.Facultad = facultad;
    }

    public String getTipo() {
        return "Profesor";
    }

    @Override
    public String toString() {
        return "Profesor:\n" +
                "Nombre: " + getNombreTrabajador() + "\n" +
                "Rut: " + getRut() + "\n" +
                "Titulo profesional: " + getTituloProfesional() + "\n" +
                "Direccion: " + getDireccion() + "\n" +
                "Estado civil: " + getEstadoCivil() + "\n" +
                "Horario: " + getHorario() + "\n" +
                "Tipo de jornada: " + getTipoJornada() + "\n";
    }
}