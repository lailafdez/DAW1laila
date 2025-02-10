public class NombreException extends Exception{

    public NombreException (String nombre) {

        super("Error en el nombre " + nombre + "debe tener al menos 3 letras ");
       
    }
}
