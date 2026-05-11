package ejecutardelivery;

public class GestorLogistica {
    
    // Método para manipulación de objetos y lógica (Unidad 3)
    public void procesarEntrega(Pedido pedido) {
        if (pedido.getAsignado() == null) {
            System.out.println("Error: El pedido " + pedido.getIdPedido() + " no tiene repartidor.");
            return;
        }

        double costoEnvio = 2.0;

        // Estructura de control condicional para distancia
        if (pedido.getDistanciaKm() > 5) {
            double extraDistancia = (pedido.getDistanciaKm() - 5) * 0.50;
            costoEnvio += extraDistancia;
        }

        // Estructura de control para tipo de vehículo
        if (pedido.getAsignado().getTipoVehiculo().equals("Moto")) {
            costoEnvio += 1.0;
        }

        double totalFinal = pedido.getCostoComida() + costoEnvio;

        System.out.println("--- RESUMEN DE ENTREGA ---");
        System.out.println("Repartidor: " + pedido.getAsignado().getNombre());
        System.out.println("Costo Envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}