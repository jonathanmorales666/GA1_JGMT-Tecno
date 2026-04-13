package hospital.modelo;

public class Medicamento {

    private String nombre;
    private String dosis;
    private double precio;

    public Medicamento() {
    }

    public Medicamento(String nombre, String dosis, double precio) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.precio = precio;
    }

    public String obtenerInfo() {
        return "Medicamento: " + nombre
                + " | Dosis: " + dosis
                + " | Precio: Q" + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Medicamento{nombre='" + nombre + "', dosis='" + dosis + "', precio=" + precio + "}";
    }
}
