package hospital.modelo;

public class Consulta {

    private String fecha;
    private String hora;
    private double costo;
    private Medico medico;
    private Paciente paciente;
    private Receta receta;

    public Consulta() {
    }

    public Consulta(String fecha, String hora, double costo,
            Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.costo = costo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void generarRecibo() {
        System.out.println("=== RECIBO DE CONSULTA ===");
        System.out.println("Fecha   : " + fecha);
        System.out.println("Hora    : " + hora);
        System.out.println("Costo   : Q" + costo);
        System.out.println("Médico  : " + (medico != null ? medico.getNombre() : "N/A"));
        System.out.println("Paciente: " + (paciente != null ? paciente.getNombre() : "N/A"));
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Consulta{fecha='" + fecha + "', hora='" + hora + "', costo=" + costo + "}";
    }
}
