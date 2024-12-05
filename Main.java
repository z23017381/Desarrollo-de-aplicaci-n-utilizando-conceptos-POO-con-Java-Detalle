import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int datoEntrada;

        do {
            System.out.println("------- Menú ---------");
            System.out.println("\n1. Reservar Boleto");
            System.out.println("2. Cancelar Boleto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            datoEntrada = entrada.nextInt();
            entrada.nextLine(); 

            if (datoEntrada == 1) {
                asignarDatos cliente = new asignarDatos();

                System.out.println("Ingrese sus datos:");
                System.out.print("Nombre: ");
                cliente.setNombreCliente(entrada.nextLine());

                System.out.println("Ingrese los datos de su viaje:");
                System.out.print("Lugar de salida: ");
                cliente.setLugarSalida(entrada.nextLine());

                System.out.print("Lugar de destino: ");
                cliente.setLugarDestino(entrada.nextLine());

                System.out.print("Hora de salida (12 hrs-AM/PM): ");
                cliente.setHoraSalida(entrada.nextLine());

                DatosBoleto boleto = new DatosBoleto();

                System.out.println("\n--- Resumen de la Reserva ---");
                System.out.println("Nombre: " + cliente.getNombreCliente());
                System.out.println("Lugar de salida: " + cliente.getLugarSalida());
                System.out.println("Lugar de destino: " + cliente.getLugarDestino());
                System.out.println("Hora de salida: " + cliente.getHoraSalida());
                boleto.mostrarDetalles();

                System.out.println("Reserva Exitosa!");

            } else if (datoEntrada == 2) {
                System.out.println("Cancelando el boleto...");
            } else if (datoEntrada == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (datoEntrada != 3);

        entrada.close();

        
    }
}
