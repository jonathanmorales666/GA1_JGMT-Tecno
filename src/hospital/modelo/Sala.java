package hospital.modelo;

public class Sala {

    private int numero;
    private String tipo;
    private int capacidad;

    public Sala() {
    }

    public Sala(int numero, String tipo, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public boolean verificarDisponibilidad() {
        return capacidad > 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Sala{numero=" + numero + ", tipo='" + tipo + "', capacidad=" + capacidad + "}";
    }
}
