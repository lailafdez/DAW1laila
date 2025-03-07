import java.io.Serializable;
import java.util.ArrayList;

public class Libros implements Serializable {
    private String isbn;
    private String titulo;
    private String autor;
    private String fecha_publicacion;

    public Libros(String isbn, String titulo, String autor, String fecha_publicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    @Override
    public String toString() {
        return " Libros {" +
                " Título= " + titulo +
                " Autor= " + autor +
                " ISBN = " + isbn +
                " Fecha de publicación= " + fecha_publicacion +
                '}';
    }
}
