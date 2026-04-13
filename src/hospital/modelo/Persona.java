package hospital.modelo;

public class Persona {

    private String nombre;
    private String dpi;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String dpi, String telefono) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
    }

    public void identificarse() {
        System.out.println("Nombre: " + nombre + " | DPI: " + dpi);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dpi='" + dpi + "', telefono='" + telefono + "'}";
    }
}
