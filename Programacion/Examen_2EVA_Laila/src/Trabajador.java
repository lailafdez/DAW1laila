public class Trabajador extends Persona{

    private static final String direccion = null ;
    private String numeroSS;
    private String email_empresa;
    private String salario;
    private String departamento;
    private boolean estado;

    public Trabajador(String nombre, String fecha_nacimiento, String dni) {
        super(nombre, fecha_nacimiento, dni, direccion);
        this.email_empresa = email_empresa;
        this.numeroSS = numeroSS;
        this.salario = salario;
        this.departamento = departamento;
        this.estado = estado;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "numeroSS='" + numeroSS + '\'' +
                ", email_empresa='" + email_empresa + '\'' +
                ", salario='" + salario + '\'' +
                ", departamento='" + departamento + '\'' +
                ", estado=" + estado +
                '}';
    }
}
