
import java.time.LocalDateTime;

public class Movimiento {

    private static int contador = 0;

    private int id;
    private LocalDateTime fecha;
    private String tipo;
    private double cantidad;

    //Constructores
    public Movimiento(String tipo, double cantidad){

        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.id = contador;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Movimiento: ID=" + id + ", Fecha=" + fecha + ", Tipo=" + tipo + ", Cantidad=" + cantidad;
    }

}