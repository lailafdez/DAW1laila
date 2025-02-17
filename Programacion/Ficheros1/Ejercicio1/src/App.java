import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

         try(FileWriter file2 =  new FileWriter("./resource/Almacen.dat", true); BufferedWriter writer =  new BufferedWriter(file2);){

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

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        Scanner reader = new Scanner(System.in);
        String opcion;
	do{
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
            break;

            default: 
            break;
        
        
    }
    }
    while (!opcion.equals("5"));
    }
}