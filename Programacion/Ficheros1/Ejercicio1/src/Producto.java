public class Producto {

    private int codigo;
    private String nombre;
    private String cantidad;
    private double precio;

    public Producto (String nombre, String cantidad, int  codigo, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: Codigo=" + codigo + ", Nombre=" + nombre + ", Cantidad=" + cantidad + ", Precio=" + precio;
    }

    
}
