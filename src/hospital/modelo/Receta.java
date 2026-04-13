package hospital.modelo;

import java.util.ArrayList;
import java.util.List;

public class Receta {

    private String fecha;
    private String indicaciones;
    private List<Medicamento> medicamentos;

    public Receta() {
        this.medicamentos = new ArrayList<>();
    }

    public Receta(String fecha, String indicaciones) {
        this.fecha = fecha;
        this.indicaciones = indicaciones;
        this.medicamentos = new ArrayList<>();
    }

    public void imprimirReceta() {
        System.out.println("=== RECETA ===");
        System.out.println("Fecha       : " + fecha);
        System.out.println("Indicaciones: " + indicaciones);
        System.out.println("Medicamentos:");
        for (Medicamento m : medicamentos) {
            System.out.println("  - " + m.obtenerInfo());
        }
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> lista) {
        this.medicamentos = lista;
    }

    @Override
    public String toString() {
        return "Receta{fecha='" + fecha + "', medicamentos=" + medicamentos.size() + "}";
    }
}
