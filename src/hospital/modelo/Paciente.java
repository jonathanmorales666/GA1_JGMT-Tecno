package hospital.modelo;

public class Paciente extends Persona {

    private String historial;
    private String tipoSangre;

    public Paciente() {
    }

    public Paciente(String nombre, String dpi, String telefono,
            String historial, String tipoSangre) {
        super(nombre, dpi, telefono);
        this.historial = historial;
        this.tipoSangre = tipoSangre;
    }

    public void describirSintomas() {
        System.out.println("Paciente: " + getNombre()
                + " | Historial: " + historial
                + " | Tipo de sangre: " + tipoSangre);
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Paciente{nombre='" + getNombre() + "', tipoSangre='" + tipoSangre + "'}";
    }
}
