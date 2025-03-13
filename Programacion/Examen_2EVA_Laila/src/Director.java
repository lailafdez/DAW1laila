public class Director extends Trabajador{

    private String num_telefono;
    private boolean esta_reunido;
    private boolean esta_fuera;

    public Director(String nombre, String fecha_nacimiento, String dni, String direccion, String email_empresa,
                    String numeroSS, String salario, String departamento, boolean estado,
                    String num_telefono, boolean esta_reunido, boolean esta_fuera) {
        super(nombre, fecha_nacimiento, dni);
        this.num_telefono = num_telefono;
        this.esta_reunido = esta_reunido;
        this.esta_fuera = esta_fuera;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public boolean isEsta_reunido() {
        return esta_reunido;
    }

    public void setEsta_reunido(boolean esta_reunido) {
        this.esta_reunido = esta_reunido;
    }

    public boolean isEsta_fuera() {
        return esta_fuera;
    }

    public void setEsta_fuera(boolean esta_fuera) {
        this.esta_fuera = esta_fuera;
    }

    @Override
    public String toString() {
        return "Director{" +
                "num_telefono='" + num_telefono + '\'' +
                ", esta_reunido=" + esta_reunido +
                ", esta_fuera=" + esta_fuera +
                '}';
    }
}
