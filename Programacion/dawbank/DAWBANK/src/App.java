import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		CuentaBancaria c1;

		final String formatoIBAN = "[A-Z]{2}[0-9]{22}";
		final String formatoDNI = "[0-9]{8}[A-Z]{1}";

	try{
		String nombre = MyUtils.leerTextoPantalla("Escribe tu nombre");
		String dni = MyUtils.comprobarPatronRepetidamente(formatoDNI, "Escribe tu DNI:");
		String email = MyUtils.leerTextoPantalla("Escribe tu email:");
		String direccion = MyUtils.leerTextoPantalla("Escribe tu direccion:");
        String telefono = MyUtils.leerTextoPantalla("Escribe tu telefono:");

		System.out.print("Escribe su fecha de nacimiento");
		LocalDate nacimiento = MyUtils.leerFecha();

		Cliente cliente = new Cliente(nombre, dni, nacimiento, telefono, email, direccion);
		System.out.println("El cliente ha sido creado");

		String iban = MyUtils.comprobarPatronRepetidamente(formatoIBAN, "Escribe tu IBAN");
		c1 = new CuentaBancaria(cliente, iban, 0);
		System.out.println("La cuenta ha sido creada");
	
		String opcion;
	do{
		reader = new Scanner(System.in);
		System.out.println("DAWBANK, ESCOGE UNA OPCION");
		System.out.println("1. Datos de la cuenta");
		System.out.println("2. IBAN");
		System.out.println("3. Titular");
		System.out.println("4. Saldo");
		System.out.println("5. Ingreso");
		System.out.println("6. Retirada");
		System.out.println("7. Movimientos");
		System.out.println("8. Salir");
		opcion = reader.nextLine();

		
			switch (opcion) {
				case "1":
					System.out.println(c1.toString());
					break;

				case "2":
					System.out.println(c1.informacionIban());
					break;

				case "3":
				System.out.println(c1.informacionCliente());
					break;

				case "4":
				System.out.println(c1.informacionSaldo());
					break;

				case "5":
					try{
					System.out.println("Cantidad que vas a ingresar = ");
					double ingresar = reader.nextDouble();

					Movimiento ingreso = new Movimiento("Ingreso",ingresar);
					c1.ingresar(ingreso);
					System.out.println("Ingreso hecho. " + c1.informacionSaldo());
					}
					catch (CuentaException e){
						System.out.println(e.getMessage());
					}
					catch (AvisarHaciendaException e){
						System.out.println(e.getMessage());
						System.out.println("Ingreso hecho. " + c1.informacionSaldo());
					}
					break;

				case "6":
					try{
					System.out.println("Cantidad que vas a retirar = ");
					double retirar = reader.nextDouble();

					Movimiento retirada = new Movimiento("Retirada",retirar);
					c1.retirar(retirada);
					System.out.println("Retirada hecha. " + c1.informacionSaldo());
					}
					catch (CuentaException e){
						System.out.println(e.getMessage());
					}
					catch (AvisarHaciendaException e){
						System.out.println(e.getMessage());
						System.out.println("Retirada hecha" + c1.informacionSaldo());
					}
					break;

				case "7":
					System.out.println(c1.informacionMovimiento());
					break;

				case "8":
					System.out.println("Cerrando programa...");
					break;

				default:
					System.out.println("Seleccione una opcion valida por favor");
					break;
			}
		}
		while(!opcion.equals("8"));
	}catch (Exception e){
		System.out.println("Error, cerrando programa...");
	}finally{
		reader.close();
	}
	}

}