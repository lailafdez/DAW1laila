import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Director director;
        GerenteDep gerenteDep;
        Trabajador trabajador;

        final String formatoDNI = "[0-9]{8}[A-Z]{1}";
        final String formatoCIF = "[A-Z]{1}[0-9]{10}";

        try {
            String nombre_empresa = MyUtils.leerTextoPantalla("Escribe el nombre de la empresa: ");
            String cif = MyUtils.comprobarPatronRepetidamente(formatoCIF, "Escribe el CIF de la empresa: ");
            System.out.println("Fecha de fundacion de la empresa: ");
            LocalDate fecha_fundacion = MyUtils.leerFecha();

            Empresa empresa = new Empresa(nombre_empresa, cif, fecha_fundacion);
            System.out.println("La empresa ha sido creada");

            String opcion = null ;
            String opcion1 = null ;
            String opcion2 = null ;
            do {
                sc = new Scanner(System.in);
                System.out.println("Bienvenido a su empresa, escoja una opcion: ");
                System.out.println("1. Registrar trabajador en empresa.");
                System.out.println("2. Mostrar informacion de la empresa");
                System.out.println("3. Numero de trabajadores");
                System.out.println("4. Informacion de departamento");
                System.out.println("5. Eliminar trabajador");
                System.out.println("6. Agenda director");
                System.out.println("7. Salir");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        do {
                            sc = new Scanner(System.in);
                            System.out.println("a. Registar director (max 1) ");
                            System.out.println("b. Registar gerente de departamento (max 3) ");
                            System.out.println("c. Registrar trabajador normal");
                            System.out.println("d. Salir de la opcion 1");
                            opcion1 = sc.nextLine();
                            switch (opcion1) {
                                case "a":
                                    try {
                                        String nombre = MyUtils.leerTextoPantalla("Nombre director: ");
                                        String dni = MyUtils.comprobarPatronRepetidamente(formatoDNI, "Escribe el dni: ");
                                        String fecha_nacimiento = MyUtils.leerTextoPantalla("Fecha nacimiento: ");
                                        empresa.registrarDirector(nombre, dni, fecha_nacimiento);
                                        System.out.println("El director ha sido registrado correctamente");
                                    } catch (NullPointerException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "b":
                                    try {
                                        String nombre = MyUtils.leerTextoPantalla("Nombre gerente: ");
                                        String dni = MyUtils.leerTextoPantalla("DNI: ");
                                        String fecha_nacimiento = MyUtils.leerTextoPantalla("Fecha nacimiento: ");
                                        empresa.registrarGerenteDep(nombre, dni, fecha_nacimiento);
                                    } catch (NullPointerException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "c":
                                    try {
                                        String nombre = MyUtils.leerTextoPantalla("Nombre trabajador: ");
                                        String dni = MyUtils.leerTextoPantalla("DNI: ");
                                        String fecha_nacimiento = MyUtils.leerTextoPantalla("Fecha nacimiento: ");
                                        empresa.registrarTrabajador(nombre, dni, fecha_nacimiento);
                                    } catch (NullPointerException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "d":
                                    System.out.println("Cerrando opcion 1...");
                                    break;
                                default:
                                    System.out.println("Seleccione una opcion valida por favor");
                                    break;
                            }
                        } while (!opcion1.equalsIgnoreCase("d"));
                        sc = new Scanner(System.in);
                        System.out.println("Escoja una opcion: ");
                        System.out.println("1. Registrar trabajador en empresa.");
                        System.out.println("2. Mostrar informacion de la empresa");
                        System.out.println("3. Numero de trabajadores");
                        System.out.println("4. Informacion de departamento");
                        System.out.println("5. Eliminar trabajador");
                        System.out.println("6. Agenda director");
                        System.out.println("7. Salir");
                        opcion = sc.nextLine();
                        switch (opcion) {
                            case "2":
                                System.out.println(empresa.toString());
                                System.out.println("Recorriendo todos los trabajadores...");
                                for (int i = 0; i < empresa.trabajadores.size(); i++) {
                                    System.out.println(empresa.trabajadores.get(i).toString());
                                }
                                if (empresa.trabajadores.size() == 1) {
                                    System.out.println(empresa.trabajadores.get(1).toString());
                                } else {
                                    System.out.println("No hay trabajadores registrados");
                                }
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "6":
                                do {
                                    sc = new Scanner(System.in);
                                    System.out.println("a. Reuniones ");
                                    System.out.println("b. Fuera de la oficina ");
                                    System.out.println("c. Convocar a toda la empresa ");
                                    System.out.println("d. Salir de la opcion 2");
                                    opcion2 = sc.nextLine();
                                    switch (opcion2) {
                                        case "a":
                                            break;
                                        case "b":
                                            break;
                                        case "c":
                                            break;
                                        case "d":
                                            break;
                                    }
                                } while (!opcion2.equals("d"));
                                sc = new Scanner(System.in);
                                System.out.println("Escoja una opcion: ");
                                System.out.println("1. Registrar trabajador en empresa.");
                                System.out.println("2. Mostrar informacion de la empresa");
                                System.out.println("3. Numero de trabajadores");
                                System.out.println("4. Informacion de departamento");
                                System.out.println("5. Eliminar trabajador");
                                System.out.println("6. Agenda director");
                                System.out.println("7. Salir");
                                opcion = sc.nextLine();
                                switch (opcion) {
                                    case "7":
                                        System.out.println("Cerrando programa...");
                                        break;
                                    default:
                                        System.out.println("Seleccione una opcion valida por favor");
                                        break;
                                }
                        }
                }
            }
            while (!opcion.equals("7"));
        } catch (Exception e) {
            System.out.println("Error, cerrando programa...");
        } finally {
            sc.close();
        }
    }
}
