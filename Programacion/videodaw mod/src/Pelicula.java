import java.time.LocalDate;

public class Pelicula extends Articulo {
    private boolean isAlquilada;
    private GeneroPelicula genero;
    private LocalDate FechaAlquiler;

    public Pelicula(String titulo, String codigo, LocalDate fechaBaja, LocalDate fechaRegistro,
                    boolean isAlquilada, GeneroPelicula genero, LocalDate fechaAlquiler) {
        super(titulo, codigo, fechaBaja, fechaRegistro);
        this.isAlquilada = isAlquilada;
        this.genero = genero;
        FechaAlquiler = fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        FechaAlquiler = fechaAlquiler;
    }

    @Override
    public String toString() {
        return "Informacion Pelicula {" +
                "Alquiler Libre = " + isAlquilada +
                ", Genero Pelicula = " + genero +
                ", Fecha Alquiler = " + FechaAlquiler +
                '}';
    }
}