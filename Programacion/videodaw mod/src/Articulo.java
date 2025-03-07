import java.time.LocalDate;
public class Articulo {
    private String titulo;
    private String codigo;
    private LocalDate fechaRegistro;
    private  LocalDate fechaBaja;

    public Articulo(String titulo, String codigo, LocalDate fechaBaja, LocalDate fechaRegistro) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.fechaBaja = null;
        this.fechaRegistro = fechaRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Informacion Articulo {" +
                "Titulo = " + titulo  +
                ", Codigo = " + codigo  +
                ", Fecha de Registro = " + fechaRegistro +
                ", Fecha de Baja = " + fechaBaja +
                '}';
    }
}