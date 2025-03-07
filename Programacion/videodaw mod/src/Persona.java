public class Persona {
    private  String dni;
    private String nombre;
    private String direccion;
    private String fechaNacimiento;

    public Persona(String dni, String nombre, String fechaNacimiento, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Informacion Persona{" +
                "DNI='" + dni  +
                ", Nombre='" + nombre +
                ", Direccion='" + direccion +
                ", Fecha de Nacimiento='" + fechaNacimiento +
                '}';
    }

}

