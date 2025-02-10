public class EdadException extends Exception {

    public EdadException (int edad) {

        super("La edad " + edad +  " es incorrecta, no puede ser negativa");
       
    }
}
