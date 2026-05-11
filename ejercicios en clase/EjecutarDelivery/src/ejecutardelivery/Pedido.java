package ejecutardelivery;

public class Pedido {
    private int idPedido;
    private double distanciaKm;
    private double costoComida;
    private Repartidor asignado; // Relación entre clases (Unidad 2)

    public Pedido(int idPedido, double costoComida, double distanciaKm) {
        this.idPedido = idPedido;
        this.costoComida = costoComida;
        this.distanciaKm = distanciaKm;
    }

    // Métodos establecer y obtener
    public void setAsignado(Repartidor r) { this.asignado = r; }
    public Repartidor getAsignado() { return asignado; }
    public double getDistanciaKm() { return distanciaKm; }
    public double getCostoComida() { return costoComida; }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
}
