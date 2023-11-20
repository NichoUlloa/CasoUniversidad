package modelo;

public class Administrativo extends Trabajador {
    private String tipoJornada;

    public Administrativo(String tituloProfesional, String nombreTrabajador, String direccion, String estadoCivil, String rut, String horario, String tipoJornada) {
        super(tituloProfesional, nombreTrabajador, direccion, estadoCivil, rut, horario);
        this.tipoJornada = tipoJornada;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getTipo() {
        return "modelo.Administrativo";
    }

    @Override
    public String toString() {
        return "modelo.Administrativo:\n" +
                "Nombre: " + getNombreTrabajador() + "\n" +
                "Rut: " + getRut() + "\n" +
                "Titulo profesional: " + getTituloProfesional() + "\n" +
                "Direccion: " + getDireccion() + "\n" +
                "Estado civil: " + getEstadoCivil() + "\n" +
                "Horario: " + getHorario() + "\n";
    }
}