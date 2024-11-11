import java.util.ArrayList;
import java.util.List;

public class JugadorManager {
    private List<Jugador> jugadores;  // Lista para almacenar los jugadores
    
    public JugadorManager() {
        jugadores = new ArrayList<>();
    }

    // Método para agregar un jugador
    public void agregarJugador(int id, String nombre, int edad, String posicion, String equipo, double salario) {
        Jugador nuevoJugador = new Jugador(id, nombre, edad, posicion, equipo, salario);
        jugadores.add(nuevoJugador);
        System.out.println("Jugador agregado: " + nuevoJugador);
    }

    // Método para buscar un jugador por ID
    public Jugador buscarJugador(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;  // Si no se encuentra el jugador
    }

    // Método para listar todos los jugadores
    public void listarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        }
    }

    // Método para eliminar un jugador
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

    // Métodos adicionales para editar jugador o realizar otras operaciones podrían agregarse aquí
}
