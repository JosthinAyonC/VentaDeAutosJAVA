package examenfinal;

import clases.Vehiculo;

import clases.Buseta;
import clases.Cliente;
import clases.Trailer;
import clases.VentaVehiculo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamenFinal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VentaVehiculo venta = new VentaVehiculo();

        Cliente cliente = null;
        Vehiculo buseta = null;
        Vehiculo trailer = null;

        int opcion;

        do {
            System.out.println("""
                               --------------------------------------------------
                               ***********************Menu***********************
                               --------------------------------------------------""");
            System.out.println("1. Venta de un vehiculo.");
            System.out.println("2. Buscar cliente que ha registrado mas compras este anio.");
            System.out.println("3. Buscar clientes segun la marca de vehiculo.");
            System.out.println("0. Salir");

            do {
                System.out.print("Ingrese la opcion que desea: \n");

                try {
                    opcion = sc.nextInt();
                    if (opcion == 0) {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("///Ingrese una opcion valida.///");
                    sc.next(); // Limpia el buffer de entrada
                    opcion = -1; // O cualquier valor que no sea una opción válida
                }

            } while (opcion < 1 || opcion > 5);

            switch (opcion) {

                case 1 -> {
                    String tipo,
                            color,
                            placa,
                            marca,
                            modelo,
                            nombre,
                            apellido,
                            correo;
                    nombre = sc.nextLine();

                    System.out.println("Ingrese nombre de comprador: ");
                    nombre = sc.nextLine();

                    System.out.println("Ingrese apellido de comprador: ");
                    apellido = sc.nextLine();

                    System.out.println("Ingrese correo de comprador: ");
                    correo = sc.nextLine();

                    System.out.println("Ingrese modelo del vehiculo: ");
                    modelo = sc.nextLine();

                    System.out.println("Ingrese marca del vehiculo: ");
                    marca = sc.nextLine();

                    System.out.println("Ingrese placa del vehiculo: ");
                    placa = sc.nextLine();

                    System.out.println("Ingrese color del vehiculo: ");
                    color = sc.nextLine();

                    cliente = new Cliente(nombre, apellido, correo);
                    while (true) {
                        tipo = null;
                        System.out.println("Ingrese el tipo de vehiculo: '(Buseta/Trailer)'");

                        tipo = sc.nextLine();

                        if (tipo.equalsIgnoreCase("Buseta")) {

                            buseta = new Buseta(color, placa, marca, modelo);
                            venta.registrarVenta(buseta, cliente);

                            System.out.println("=============================Venta terminada!============================== \n");

                            break;

                        } else if (tipo.equalsIgnoreCase("Trailer")) {

                            trailer = new Trailer(color, placa, marca, modelo);

                            venta.registrarVenta(trailer, cliente);

                            System.out.println("=============================Venta terminada!============================= \n");

                            break;

                        } else {
                            System.out.println("///Ingrese una opcion valida.///");
                        }
                    }
                }

                case 2 ->
                    venta.buscarClientesMultiplesCompras();
                case 3 -> {
                    System.out.println("Ingrese la marca que desea buscar al cliente: ");
                    sc.nextLine();
                    String a = "";
                    a = sc.nextLine();

                    venta.buscarClientesPorMarca(a);
                }
                case 0 ->{
                    System.out.println("Hasta pronto! ");
                }
                default ->
                    System.out.println("Opcion no valida.");

            }

        } while (opcion != 0);


    }
}
