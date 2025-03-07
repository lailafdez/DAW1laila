import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        LinkedList<Producto> product = new LinkedList<>();
        Producto p;

        try (FileWriter file = new FileWriter("Ejercicio1/resource/Almacent.dat", false);
             BufferedWriter writer = new BufferedWriter(file);) {

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

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Scanner reader = new Scanner(System.in);
        String opcion;
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
                    try {
                            System.out.println("Escribe el nombre del producto: ");
                        String nombre = reader.nextLine();
                        System.out.println("Escribe la cantidad que te vas a llevar de ese producto: ");
                        int cantidad = reader.nextInt();
                        System.out.println("Escribe el codigo del producto: ");
                        int codigo = reader.nextInt();
                        System.out.println("Escribe el precio del producto: ");
                        double precio = reader.nextDouble();

                        product.add(new Producto(nombre, cantidad, codigo, precio));
                        System.out.println("El producto ha sido creado con exito.");

                    } catch (InputMismatchException e) {
                        System.out.println("Formato de dato introducido incorrecto");
                    }
                    break;

                case "2":
                    System.out.println("Listado de productos:");
                    product.forEach(System.out::println);
                    break;

                case "3":
                    System.out.println("Productos disponibles:");
                    product.forEach(System.out::println);
                    try {
                        System.out.print("Escribe el código del producto que quieres eliminar: ");
                        int codigoEliminar = reader.nextInt();
                        boolean eliminado = eliminarProducto(product, codigoEliminar);
                        if (eliminado) {
                            System.out.println("El producto se ha eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún producto con ese codigo");
                        }
                    } catch (Exception e) {
                        System.out.println("Escribe un codigo que exista");
                    }

                    break;

                case "4":
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ejercicio1/resource/Almacent.dat", true))) { // true para "append"
                        writer.write(product.toString());
                        writer.newLine();
                        System.out.println("Producto añadido correctamente al fichero.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar el producto: " + e.getMessage());
                    }

                default:
                    break;

            }
        } while (!opcion.equals("5"));
        reader.close();


    }
    public static boolean eliminarProducto(LinkedList<Producto> productos, int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productos.remove(producto);
                return true;
            }
        }
        return false;
    }
}

