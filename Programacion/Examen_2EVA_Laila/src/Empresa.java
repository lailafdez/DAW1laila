import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

    private String nombre_empresa;
    private String cif_empresa;
    private LocalDate fecha_fundacion;
    ArrayList <Trabajador> trabajadores = new ArrayList<Trabajador>();
    private int contador = 0;


    public Empresa(String nombre_empresa, String cif_empresa, LocalDate fecha_fundacion) {
        this.nombre_empresa = nombre_empresa;
        this.cif_empresa = cif_empresa;
        this.fecha_fundacion = fecha_fundacion;
        this.contador = 0;
    }

    public String getCif_empresa() {
        return cif_empresa;
    }

    public void setCif_empresa(String cif_empresa) {
        this.cif_empresa = cif_empresa;
    }

    public LocalDate getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(LocalDate fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    @Override
    public String toString() {
        return "Empresa {" +
                "CIF ='" + cif_empresa +
                ", Nombre de la empresa ='" + nombre_empresa +
                ", Fecha de fundacion =" + fecha_fundacion +
                '}';
    }

    public boolean registrarTrabajador (String nombre, String fecha_nacimiento, String dni) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getDni().equals (dni)) {
                System.out.println("Este trabajador ya existe");
            }
            return false;
        }
        Trabajador aTrabajador = new Trabajador (nombre, fecha_nacimiento, dni);
        trabajadores.add(aTrabajador);
        System.out.println("Trabajador registrado");
        contador ++;
        return true;
    }


    public void registrarDirector (String nombre, String dni, String fecha_nacimiento)  {
        for (Trabajador director : trabajadores) {
            if (director.getDni().equals (dni)) {
                System.out.println("Este director ya existe");
            } else {
                trabajadores.add(director);
                System.out.println("Director registrado");
                contador ++;
            }
            if (contador == 1) {
                System.out.println("Solamente se puede registrar un director");
            } else {
                System.out.println("No hay ningun director registrado");
            }
        }
    }

    public void registrarGerenteDep (String nombre, String dni, String fecha_nacimiento) throws DepartamentoMarketing{
        for (Trabajador gerente : trabajadores) {
            if (gerente.getDni().equals (dni)) {
                System.out.println("Este gerente de departamento ya existe");
            } else {
                trabajadores.add(gerente);
                System.out.println("Gerente registrado");
                contador ++;
            }
        }
    }

    public  boolean eliminarTrabajador (String nombre, String dni, String fecha_nacimiento) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getDni().equals(dni)) {
               trabajadores.remove(trabajador);
               return true;
            } else {
                System.out.println("El trabajador no existe");
            }
        }
        return false;
    }

}

