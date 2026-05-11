package ejecutardelivery;

public class EjecutarDelivery {

    public static void main(String[] args) {

        // 1. Crear el objeto Repartidor
        Repartidor motorizado = new Repartidor("Carlos Ruiz", "Moto");

        // 2. Crear el objeto Pedido
        Pedido miPedido = new Pedido(7782, 25.50, 8.5);

        // 3. Establecer la relación entre objetos (Asociación)
        miPedido.setAsignado(motorizado);

        // 4. Instanciar lógica de control y procesar
        GestorLogistica logistica = new GestorLogistica();
        logistica.procesarEntrega(miPedido);
        
    }
    
}
