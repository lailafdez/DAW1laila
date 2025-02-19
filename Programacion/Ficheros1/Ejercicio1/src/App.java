import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (FileWriter file =  new FileWriter("Ejercicio1/resource/Almacent.dat", true); 
             BufferedWriter writer =  new BufferedWriter(file);){

            writer.write("PRODUCTOS DE MODA");
            writer.newLine();
            writer.write("Vestido mini estampado");
            writer.newLine();
            writer.write("Pantalones tachuelas tiro medio");
            writer.newLine();
            writer.write("Falda vaquera puntillo");
            writer.newLine();
            writer.write("Jersey cuello vuelto");
            writer.newLine();

        } 
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        Scanner reader = new Scanner(System.in);
        String opcion;
        Producto p = null;
    do {
        reader = new Scanner(System.in);
        System.out.println("Escoge una opcion: ");
        System.out.println("1. Crear producto");
        System.out.println("2. Mostrar productos existentes");
        System.out.println("3. Eliminar producto por codigo");
        System.out.println("4. Guardar productos en el fichero");
        System.out.println("5. Salir");
        opcion = reader.nextLine();
    
        switch (opcion) {
            case "1":
            try{
                System.out.println("Escribe el nombre del producto: ");
                String nombre = reader.nextLine();
                System.out.println("Escribe la cantidad que te vas a llevar de ese producto: ");
                String cantidad = reader.nextLine();
                System.out.println("Escribe el codigo del producto: ");
                int codigo = reader.nextInt();
                System.out.println("Escribe el precio del producto: ");
                double precio = reader.nextDouble();
                
                p = new Producto(nombre, cantidad, codigo, precio);
                System.out.println("El producto ha sido creado con exito.");

 
            
                
            }catch(InputMismatchException e){
                System.out.println("Formato de dato introducido incorrecto");
            }

            break;

            case "2":
            break;

            case "3":
            break;

            case "4":
            try (FileWriter file2 =  new FileWriter("Ejercicio1/resource/Almacent.dat", true);
            BufferedWriter buffer = new BufferedWriter(file2);) {
           BufferedWriter writer;
           writer.write("Producto: " + p);
           buffer.newLine();
            }catch(IOException e){

            }
            break;

            default: 
            break;
            }
        
    } while (!opcion.equals("5"));
    reader.close();
    
    
    }
}
