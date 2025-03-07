import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Libros> libros = new LinkedList<>();
        Libros libros1;

        try (FileWriter file = new FileWriter("./resources/Biblioteca.dat", false);
             BufferedWriter writer = new BufferedWriter(file);) {

            writer.write("Lista de libros");
            writer.newLine();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

            String opcion = "";
            Scanner reader = new Scanner(System.in);
            do {
                System.out.println("1 - Crear libro y registrarlo en biblioteca");
                System.out.println("2 - Ver libros existentes en biblioteca");
                System.out.println("3 - Eliminar libro en biblioteca");
                System.out.println("4 - Guardar libro en fichero");
                System.out.println("5 - Guardar y salir");
                opcion = reader.nextLine();

                switch (opcion) {
                    case "1":

                        //crear el libro
                        try {
                            System.out.println("Escribe el titulo del libro: ");
                            String titulo = reader.nextLine();
                            System.out.println("Nombre del autor del libro: ");
                            String autor = reader.nextLine();
                            System.out.println("Escribe el codigo del libro (ISBN): ");
                            String isbn = reader.nextLine();
                            System.out.println("Escribe la fecha de publicacion del libro: ");
                            String fecha_publicacion = reader.nextLine();

                            libros.add(new Libros(titulo, autor, isbn, fecha_publicacion));
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
                        }catch (IOException e) {
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
                            System.out.println("Escribe el ISBN del libro que desea eliminar: ");
                            String isbnEliminar = reader.nextLine();
                            boolean eliminado = eliminarLibro(libros, isbnEliminar);

                            if (eliminado) {
                                System.out.println("Libro eliminado correctamente en la biblioteca");
                            } else {
                                System.out.println("Libro no disponible en la biblioteca");
                            }
                        } catch (Exception e) {
                            System.out.println("Escribe un ISBN que exista");
                        }

                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                }
            } while (!opcion.equals("5"));
        }
        public static boolean eliminarLibro (LinkedList <Libros> libro, String isbn) {
            for (Libros libros : libro) {
                if (libros.getIsbn() == isbn) {
                    libro.remove(libros);
                    return true;
                }
            }
            return false;
        }
    }