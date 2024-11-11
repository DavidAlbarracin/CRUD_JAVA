public class Jugador { // Definición de la clase Jugador
    private int id; // Identificador único del jugador
    private String nombre; // Nombre del jugador
    private int edad; // Edad del jugador
    private String posicion; // Posición en la que juega el jugador
    private String equipo; // Nombre del equipo al que pertenece
    private double salario; // Salario del jugador

    // Constructor que inicializa las propiedades de un jugador y valida los datos de entrada
    public Jugador(int id, String nombre, int edad, String posicion, String equipo, double salario) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (edad < 0 || edad > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 100 años");
        }
        if (posicion == null || posicion.trim().isEmpty()) {
            throw new IllegalArgumentException("La posición no puede estar vacía");
        }
        if (equipo == null || equipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El equipo no puede estar vacío");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }

        // Asignación de valores a los atributos de la clase
        this.id = id;
        this.nombre = nombre.trim();
        this.edad = edad;
        this.posicion = posicion.trim();
        this.equipo = equipo.trim();
        this.salario = salario;
    }

    // Métodos getter para acceder a cada propiedad
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public double getSalario() {
        return salario;
    }

    // Método para representar al jugador como una cadena de texto
    @Override
    public String toString() {
        return String.format("ID: %d\nNombre: %s\nEdad: %d\nPosición: %s\nEquipo: %s\nSalario: $%.2f", 
                id, nombre, edad, posicion, equipo, salario);
    }
}
