import java.util.ArrayList;

public class GerenteDep extends Trabajador {
    private String num_empleados;
    private String num_telefono;
    ArrayList <Trabajador> trabajadoresDep = new ArrayList <Trabajador>();

    public GerenteDep(String nombre, String fecha_nacimiento, String dni, String direccion, String email_empresa,
                      String numeroSS, String salario, String departamento, boolean estado,
                      String num_empleados, String num_telefono, ArrayList <Trabajador> trabajadoresDep) {

        super(nombre, fecha_nacimiento, dni);
        this.num_empleados = num_empleados;
        this.num_telefono = num_telefono;
        this.trabajadoresDep = trabajadoresDep;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getNum_empleados() {
        return num_empleados;
    }

    public void setNum_empleados(String num_empleados) {
        this.num_empleados = num_empleados;
    }

    @Override
    public String toString() {
        return "GerenteDep{" +
                "num_empleados='" + num_empleados + '\'' +
                ", num_telefono='" + num_telefono + '\'' +
                ", trabajadoresDep=" + trabajadoresDep +
                '}';
    }
}
