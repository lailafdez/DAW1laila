import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Inventario {
    public static void main(String[] args) {

        LinkedList<Producto> productos = new LinkedList<Producto>();
        Producto producto1;

        try {
            FileOutputStream file = new FileOutputStream("./resources/Almacen.dat", false);
            ObjectOutputStream buffer = new ObjectOutputStream(file);

            buffer.writeObject("Lista de ficheros: ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}