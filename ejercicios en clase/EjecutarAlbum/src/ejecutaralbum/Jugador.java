package ejecutaralbum;

public class Jugador {
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    // Constructor por defecto
    public Jugador() {
        this.nombre = "Desconocido";
        this.posicion = "Sin posición";
        this.numeroCamiseta = 0;
    }

    // Constructor sobrecargado
    public Jugador(String nombre, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}