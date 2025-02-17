import java.time.LocalDate;

public class Persona {
    
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona (String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDni () {
        return dni;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento () {
        return fechaNacimiento;
    }

    public void setFechaNacimiento (LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona: Nombre=" + nombre + ", DNI=" + dni + ", Fecha de nacimiento=" + fechaNacimiento;
    }

    
}