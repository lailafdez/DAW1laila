import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String fecha_nacimiento;
    private String dni;
    private String direccion;

    public Persona(String nombre, String fecha_nacimiento, String dni, String direccion) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre +
                ", Fecha de nacimiento = " + fecha_nacimiento + '\'' +
                ", DNI = " + dni +
                ", Direccion = " + direccion +
                '}';
    }
}
