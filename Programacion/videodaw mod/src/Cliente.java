import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente extends  Persona {
    private String numSocio;
    private LocalDate fechBaja;
    private LinkedList <Articulo> articulosAlquilados;

    public Cliente(String dni, String nombre, String fechaNacimiento, String direccion, String numSocio, LocalDate fechBaja,
                   LinkedList<Articulo> articulosAlquilados) {
        super(dni, nombre, fechaNacimiento, direccion);
        this.numSocio = numSocio;
        this.fechBaja = null;
        this.articulosAlquilados = new LinkedList<Articulo>();
    }

    public LinkedList<Articulo> getArticulosAlquilados() {
        return articulosAlquilados;
    }

    public void setArticulosAlquilados(LinkedList<Articulo> articulosAlquilados) {
        this.articulosAlquilados = articulosAlquilados;
    }

    public LocalDate getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(LocalDate fechBaja) {
        this.fechBaja = fechBaja;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }


    }

