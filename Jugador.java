public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private String posicion;
    private String equipo;
    private double salario;

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

        this.id = id;
        this.nombre = nombre.trim();
        this.edad = edad;
        this.posicion = posicion.trim();
        this.equipo = equipo.trim();
        this.salario = salario;
    }

    // Getter y Setter para cada propiedad
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

    @Override
    public String toString() {
        return String.format("ID: %d\nNombre: %s\nEdad: %d\nPosición: %s\nEquipo: %s\nSalario: $%.2f", 
                id, nombre, edad, posicion, equipo, salario);
    }
}
