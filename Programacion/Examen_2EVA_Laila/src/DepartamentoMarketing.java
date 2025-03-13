public class DepartamentoMarketing extends Exception {
  private String trabajadores;

  public DepartamentoMarketing(String trabajadores) {
    super ("Todavia no hay informacion de este departamento");
    this.trabajadores = trabajadores;
  }

  @Override
  public String toString() {
    return "DepartamentoMarketing{" +
            "Trabajadores='" + trabajadores  +
            '}';
  }
}
