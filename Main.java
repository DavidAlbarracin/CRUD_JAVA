import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JugadorManager manager = new JugadorManager();
        
        // Bucle infinito para mostrar el menú y gestionar la interacción del usuario
        while (true) {
            try {
                // Mostrar opciones del menú
                System.out.println("\n=== SISTEMA DE GESTIÓN DE JUGADORES ===");
                System.out.println("1. Agregar jugador");
                System.out.println("2. Buscar jugador");
                System.out.println("3. Editar jugador");
                System.out.println("4. Eliminar jugador");
                System.out.println("5. Listar jugadores");
                System.out.println("6. Salir");
                System.out.print("\nSeleccione una opción: ");
                
                String opcionStr = scanner.nextLine().trim();
                if (opcionStr.isEmpty()) {
                    System.out.println("\nPor favor, seleccione una opción.");
                    continue;
                }
                
                int opcion = Integer.parseInt(opcionStr);
                
                switch (opcion) {
                    case 1:
                        // Agregar jugador: solicita los datos y llama al método correspondiente
                        System.out.print("Ingrese ID del jugador: ");
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        
                        System.out.print("Ingrese el nombre del jugador: ");
                        String nombre = scanner.nextLine().trim();
                        
                        System.out.print("Ingrese la edad del jugador: ");
                        int edad = Integer.parseInt(scanner.nextLine().trim());
                        
                        System.out.print("Ingrese la posición del jugador: ");
                        String posicion = scanner.nextLine().trim();
                        
                        System.out.print("Ingrese el equipo del jugador: ");
                        String equipo = scanner.nextLine().trim();
                        
                        System.out.print("Ingrese el salario del jugador: ");
                        double salario = Double.parseDouble(scanner.nextLine().trim());
                        
                        manager.agregarJugador(id, nombre, edad, posicion, equipo, salario);
                        break;
                    
                    case 2:
                        // Buscar jugador: solicita el ID y muestra el jugador si se encuentra
                        System.out.print("Ingrese el ID del jugador a buscar: ");
                        int idBuscar = Integer.parseInt(scanner.nextLine().trim());
                        Jugador jugador = manager.buscarJugador(idBuscar);
                        if (jugador != null) {
                            System.out.println("\nJugador encontrado: \n" + jugador);
                        } else {
                            System.out.println("\nJugador no encontrado.");
                        }
                        break;
                    
                    case 3:
                        // Editar jugador: muestra un mensaje de funcionalidad pendiente
                        System.out.println("Funcionalidad de edición no implementada.");
                        break;
                    
                    case 4:
                        // Eliminar jugador: solicita el ID y elimina el jugador si existe
                        System.out.print("Ingrese el ID del jugador a eliminar: ");
                        int idEliminar = Integer.parseInt(scanner.nextLine().trim());
                        if (!manager.eliminarJugador(idEliminar)) {
                            System.out.println("\nError al eliminar el jugador. Puede que no exista.");
                        }
                        break;
                    
                    case 5:
                        // Listar jugadores: imprime la lista de jugadores
                        System.out.println("\nLista de jugadores:");
                        manager.listarJugadores();
                        break;
                    
                    case 6:
                        // Salir: cierra el escáner y termina el programa
                        System.out.println("\n¡Gracias por usar el sistema!");
                        scanner.close();
                        return;
                    
                    default:
                        System.out.println("\n¡Opción inválida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError: Por favor ingrese un número válido.");
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }
    }
}
