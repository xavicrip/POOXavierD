package ejecutaralbum;

public class EjecutarAlbum {

    public static void main(String[] args) {
        // 1. Crear jugadores
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 10);
        Jugador jugador2 = new Jugador("Kylian Mbappé", "Delantero", 7);
        Jugador jugador3 = new Jugador("Kevin De Bruyne", "Mediocampista", 7);

        // 2. Crear estampillas
        Estampilla estampilla1 = new Estampilla("ARG-10", jugador1, true);
        Estampilla estampilla2 = new Estampilla("FRA-07", jugador2, false);
        Estampilla estampillaNueva = new Estampilla("ARG-10", jugador1, true);

        // 3. Crear páginas y asignar estampillas (Composición)
        Pagina pagina1 = new Pagina(1);
        pagina1.setEstampillaIzquierda(estampilla1);
        // Dejamos el espacio derecho libre por el momento

        Pagina pagina2 = new Pagina(2);
        pagina2.setEstampillaDerecha(estampilla2);

        // 4. Crear el álbum (Agregación)
        Album album = new Album(pagina1, pagina2);

        // 5. Probar el cálculo de completitud
        int totalEstampillasEsperadas = 4; // Suponemos 4 espacios en total en el álbum
        double porcentaje = album.calcularPorcentajeCompletitud(totalEstampillasEsperadas);
        
        System.out.println("--- RESULTADOS DEL ÁLBUM ---");
        System.out.println("Porcentaje de completitud: " + porcentaje + "%\n");

        // 6. Probar la verificación de repetidos
        boolean repetida = album.verificarRepetida(estampillaNueva);
        if (repetida) {
            System.out.println("Alerta: La estampilla con ID " + estampillaNueva.getIdEstampilla() + " ya está registrada en el álbum.");
        } else {
            System.out.println("La estampilla no está repetida.");
        }
    }
}

