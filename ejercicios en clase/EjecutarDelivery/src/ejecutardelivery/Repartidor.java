package ejecutardelivery;

public class Repartidor {
    private String nombre;
    private String tipoVehiculo; // "Moto" o "Bicicleta"

    public Repartidor(String nombre, String tipoVehiculo) {
        this.nombre = nombre;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getTipoVehiculo() { return tipoVehiculo; }
}