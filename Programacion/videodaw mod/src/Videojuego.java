import java.time.LocalDate;

public class Videojuego extends Articulo {
    private boolean isAlquilada;
    private LocalDate fechaAlquiler;
    private GeneroVideojuego genero;

    public Videojuego(String titulo, String codigo, LocalDate fechaBaja, LocalDate fechaRegistro,
                      boolean isAlquilada, GeneroVideojuego genero, LocalDate fechaAlquiler) {
        super(titulo, codigo, fechaBaja, fechaRegistro);
        this.isAlquilada = isAlquilada;
        this.genero = genero;
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public GeneroVideojuego getGenero() {
        return genero;
    }

    public void setGenero(GeneroVideojuego genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Informacion Videojuego {" +
                "Alquiler Libre = " + isAlquilada +
                ", Fecha Alquiler = " + fechaAlquiler +
                ", Genero = " + genero +
                '}';
    }
}
