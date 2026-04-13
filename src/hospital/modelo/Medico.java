package hospital.modelo;

public class Medico extends Persona {

    private String colegiado;
    private String especialidad;
    private Sala sala;

    public Medico() {
    }

    public Medico(String nombre, String dpi, String telefono,
            String colegiado, String especialidad, Sala sala) {
        super(nombre, dpi, telefono);
        this.colegiado = colegiado;
        this.especialidad = especialidad;
        this.sala = sala;
    }

    public void diagnosticar() {
        System.out.println("Dr. " + getNombre()
                + " | Especialidad: " + especialidad
                + " | Colegiado: " + colegiado);
    }

    public String getColegiado() {
        return colegiado;
    }

    public void setColegiado(String colegiado) {
        this.colegiado = colegiado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Medico{nombre='" + getNombre() + "', especialidad='" + especialidad + "'}";
    }
}
