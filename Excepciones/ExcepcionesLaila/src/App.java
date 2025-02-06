import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
   
    Scanner reader = new Scanner (System.in);

    //1
    try {
        System.out.println("Escribe un numero entero: ");
        int a = reader.nextInt();
        System.out.println("El valor introducido es: " + a);
    }
    catch (InputMismatchException e) { 
        System.out.println("Valor introducido incorrecto");
        System.out.println(e.getMessage());
    }
    finally {
        System.out.println("Hasta pronto"); 
    }

    //2
    try {
        System.out.println("Escribe un numero entero: ");
        int a1 = reader.nextInt();
        System.out.println("Escribe otro numero entero: ");
        int b1 = reader.nextInt();
        int division = a1/b1;
        System.out.println("El resultado total de la division es: " + division);
    }
    catch (InputMismatchException e) { //Solo cuando introduzca un numero NO entero
        System.out.println("Error de InputMismatchException, valor introducido incorrecto ");
        System.out.println(e.getMessage());
    }
    catch (ArithmeticException e1) { //Solo cuando la division la operacion esta mal hecha
        System.out.println("Error de ArithmeticException, no se puede realizar esta operacion");
        System.out.println(e1.getMessage());
    }
    finally {
        System.out.println("Hasta pronto"); 
    }

    //3
    double[] vector = new double[5];
        
    for (int i = 0; i < vector.length; i++) {
        boolean valorCorrecto = false;
            
        while (!valorCorrecto) {
            try {
                System.out.print("Introduce el valor " + (i + 1) + ": ");
                vector[i] = reader.nextDouble();
                valorCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Tienes que introducir un número válido.");
                reader.nextLine(); 
            } catch (Exception e) {
                System.out.println(e.getMessage());
                reader.nextLine(); 
                }
            }
        }
        
    System.out.println("Valores introducidos en el vector:");
    for (int i = 0; i < vector.length; i++) {
    System.out.println("Posición " + i + ": " + vector[i]);
    }

    //4
    try{
        System.out.println("Escribe un numero: ");
        int p = reader.nextInt();
        if ( p < 0) {
            System.out.println("El valor introducido es positivo.");
        } else {
            System.out.println("El valor introducido es negativo.");
        }
    } catch (Exception e ) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Hasta pronto"); 
    }




    }
    public void imprimirPositivo (int numPos) throws Positivo {
        if (numPos < 0) {
          throw new Positivo(numPos);
        }
      }
  
      public void imprimirNegativo (int numNeg) throws Negativo {
          if (numNeg > 0) {
              throw new Negativo(numNeg);
          }
        }
    
    }


