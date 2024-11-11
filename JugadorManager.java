import java.util.ArrayList;
import java.util.List;

public class JugadorManager {
    private List<Jugador> jugadores; // Lista para almacenar los objetos de tipo Jugador
    
    // Constructor que inicializa la lista de jugadores
    public JugadorManager() {
        jugadores = new ArrayList<>();
    }

    // Método para agregar un nuevo jugador a la lista
    public void agregarJugador(int id, String nombre, int edad, String posicion, String equipo, double salario) {
        Jugador nuevoJugador = new Jugador(id, nombre, edad, posicion, equipo, salario);
        jugadores.add(nuevoJugador);
        System.out.println("Jugador agregado: " + nuevoJugador);
    }

    // Método para buscar un jugador por su ID
    public Jugador buscarJugador(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador; // Retorna el jugador si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra
    }

    // Método para imprimir la lista de todos los jugadores
    public void listarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        }
    }

    // Método para eliminar un jugador de la lista
    public boolean eliminarJugador(int id) {
        Jugador jugador = buscarJugador(id);
        if (jugador != null) {
            jugadores.remove(jugador);
            System.out.println("Jugador eliminado: " + jugador);
            return true;
        }
        System.out.println("Jugador no encontrado.");
        return false;
    }
}
