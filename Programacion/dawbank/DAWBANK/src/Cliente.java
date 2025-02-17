import java.time.LocalDate;

public class Cliente extends Persona {
    
    private String telefono;
    private String email;
    private String direccion;
    
    public Cliente (String nombre, String dni, LocalDate fechaNacimiento, String telefono, String email, String direccion) {
        super(nombre, dni, fechaNacimiento);
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: Telefono=" + telefono + ", Email=" + email + ", Direccion=" + direccion;
    }

}