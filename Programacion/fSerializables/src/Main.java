import java.io.*;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        LinkedList<Libros> libros = new LinkedList<>();
        Libros libros1;

        try {
            FileOutputStream file = new FileOutputStream("./resources/Biblioteca.dat", false);
            ObjectOutputStream buffer = new ObjectOutputStream(file);

            buffer.writeObject("Lista de Libros");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String isbn;
        String titulo;
        String autor;
        String fecha_publicacion;
        String opcion = "";
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("1 - Crear libro y guardarlo en biblioteca");
            System.out.println("2 - Ver libros existentes en biblioteca");
            System.out.println("3 - Eliminar libro en biblioteca");
            System.out.println("4 - Guardar y salir");
            opcion = reader.nextLine();

            switch (opcion) {
                case "1":
                    //crear el libro
                    try {
                        do {
                            System.out.println("Escribe el codigo del libro (ISBN): ");
                            isbn = reader.nextLine();
                        } while (!isbnUnico(libros, isbn));

                        System.out.println("Escribe el titulo del libro: ");
                        titulo = reader.nextLine();

                        System.out.println("Nombre del autor del libro: ");
                        autor = reader.nextLine();

                        System.out.println("Escribe la fecha de publicacion del libro: ");
                        fecha_publicacion = reader.nextLine();

                        libros.add(new Libros(isbn, titulo, autor, fecha_publicacion));
                        System.out.println("El libro ha sido creado correctamente.");

                    } catch (InputMismatchException e) {
                        System.out.println("Formato de dato introducido incorrecto");
                    }

                    //abrir el fichero
                    FileOutputStream file;
                    ObjectOutputStream buffer;

                    try {
                        file = new FileOutputStream("./resources/Biblioteca.dat");
                        buffer = new ObjectOutputStream(file);
                    } catch (IOException e) {
                        System.out.println("Error al abrir el fichero");
                        System.out.println(e.getMessage());
                        return;
                    }

                    //guardar el libro en el fichero
                    try {
                        buffer.writeObject(libros);
                        System.out.println("Libro guardado correctamente en la biblioteca.");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el fichero");
                        System.out.println(e.getMessage());
                    }

                    //cerrar el fichero
                    try {
                        buffer.close();
                        file.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el fichero");
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    System.out.println("Listado de libros:");
                    libros.forEach(System.out::println);
                    break;

                case "3":
                    //lista de todos los libros
                    System.out.println("Libros disponibles:");
                    libros.forEach(System.out::println);

                    //eliminar el producto
                    try {
                        System.out.println("Escribe el isbn del libro:");
                        isbn = reader.nextLine();
                        eliminarLibro(libros, isbn);
                    } catch (InputMismatchException e) {
                        System.out.println("ISBN incorrecto");
                    }

                    break;
                case "4":
                    System.out.println("Guardando informacion y saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrrecta");
            }
        } while (!opcion.equals("4"));
    }

    public static boolean eliminarLibro(LinkedList<Libros> libros, String isbn) {
        Iterator<Libros> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libros libro1 = iterator.next();
            if (libro1.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Libro eliminado correctamente en la biblioteca");
                return true;
            }
        }
        System.out.println("Libro no encontrado");
        return false;
    }

    public static boolean isbnUnico(LinkedList<Libros> libros, String isbn) {
        for (Libros isbnUnico : libros) {
            if (isbnUnico.getIsbn().equals(isbn)) {
                System.out.println("El ISBN " + isbn + " ya existe en la biblioteca");
            }
        }
        return true;
    }
}