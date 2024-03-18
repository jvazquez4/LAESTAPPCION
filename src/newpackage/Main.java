/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEventos gestorEventos = new GestorEventos();
        GestorPromociones gestorPromociones = new GestorPromociones();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Evento");
            System.out.println("2. Eliminar Evento");
            System.out.println("3. Listar Eventos");
            System.out.println("4. Agregar Promoción");
            System.out.println("5. Eliminar Promoción");
            System.out.println("6. Listar Promociones");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del evento: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del evento: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la fecha del evento: ");
                    String fecha = scanner.nextLine();
                    Evento nuevoEvento = new Evento(id, nombre, fecha);
                    gestorEventos.agregarEvento(nuevoEvento);
                    System.out.println("Evento agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el ID del evento a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestorEventos.eliminarEvento(idEliminar);
                    System.out.println("Evento eliminado correctamente.");
                    break;
                case 3:
                    System.out.println("Listado de Eventos:");
                    gestorEventos.listarEventos();
                    break;
                case 4:
                    System.out.print("Ingrese el ID de la promoción: ");
                    int idPromocion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre de la promoción: ");
                    String nombrePromocion = scanner.nextLine();
                    System.out.print("Ingrese el descuento de la promoción (%): ");
                    double descuento = scanner.nextDouble();
                    Promocion nuevaPromocion = new Promocion(idPromocion, nombrePromocion, descuento);
                    gestorPromociones.agregarPromocion(nuevaPromocion);
                    System.out.println("Promoción agregada correctamente.");
                    break;
                case 5:
                    System.out.print("Ingrese el ID de la promoción a eliminar: ");
                    int idEliminarPromocion = scanner.nextInt();
                    gestorPromociones.eliminarPromocion(idEliminarPromocion);
                    System.out.println("Promoción eliminada correctamente.");
                    break;
                case 6:
                    System.out.println("Listado de Promociones:");
                    gestorPromociones.listarPromociones();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
