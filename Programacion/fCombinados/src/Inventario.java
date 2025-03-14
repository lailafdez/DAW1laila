import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Inventario {
    public static void main(String[] args) {


        //path a la carpeta Recursos del proyecto
        final String pathFile = "./ QRecursos/";

        //Nombre del fichero Binario
        final String fileNameBinario = "almacen.dat";

        //Nombre del fichero UNICODE
        final String fileNameUnicode = "productos.csv";

        LinkedList<Producto> productosLeidos = leerFicheroUnicode(pathFile, fileNameUnicode);



    }

    private static LinkedList<Producto> leerFicheroUnicode(final String pathFile, String fileName) {
        LinkedList<Producto> lineas = null;
        if(pathFile != null && fileName != null)
        {
            lineas = new LinkedList<Producto>();

            try (FileReader file = new FileReader(pathFile+fileName);
                 BufferedReader buffer = new BufferedReader(file);)
            {
                String linea = null;
                do {
                    linea = buffer.readLine();

                    if(linea != null) {

                        String [] elementos = linea.split("/");
                        Producto p =
                                new Producto(elementos[0], elementos[1], elementos[2], Double.parseDouble(elementos[3]),
                                        Integer.parseInt(elementos[4]), Integer.parseInt(elementos[5]));
                        lineas.add(p);

                    }

                }while(linea != null);

                return lineas;

            }catch(IOException e) {
                e.printStackTrace();
            }
        }//if

        return lineas;

    }//metodo
}