package ejecutaralbum;

public class Album {
    private Pagina pagina1;
    private Pagina pagina2;

    public Album(Pagina pagina1, Pagina pagina2) {
        this.pagina1 = pagina1;
        this.pagina2 = pagina2;
    }

    // Estructura de control: Cálculo del porcentaje
    public double calcularPorcentajeCompletitud(int totalEstampillasEsperadas) {
        if (totalEstampillasEsperadas == 0) {
            return 0.0;
        }

        int estampillasActuales = 0;

        // Estructura de control repetitiva
        for (int i = 0; i < 1; i++) {
            if (this.pagina1 != null) {
                if (pagina1.getEstampillaIzquierda() != null) {
                    estampillasActuales++;
                }
                if (pagina1.getEstampillaDerecha() != null) {
                    estampillasActuales++;
                }
            }

            if (this.pagina2 != null) {
                if (pagina2.getEstampillaIzquierda() != null) {
                    estampillasActuales++;
                }
                if (pagina2.getEstampillaDerecha() != null) {
                    estampillasActuales++;
                }
            }
        }

        return ((double) estampillasActuales / totalEstampillasEsperadas) * 100.0;
    }

    // Estructura de control: Búsqueda de elementos repetidos
    public boolean verificarRepetida(Estampilla nuevaEstampilla) {
        // Estructuras de control (condicionales) para verificar el ID
        if (this.pagina1 != null) {
            if (pagina1.getEstampillaIzquierda() != null && 
                pagina1.getEstampillaIzquierda().getIdEstampilla().equals(nuevaEstampilla.getIdEstampilla())) {
                return true;
            }
            if (pagina1.getEstampillaDerecha() != null && 
                pagina1.getEstampillaDerecha().getIdEstampilla().equals(nuevaEstampilla.getIdEstampilla())) {
                return true;
            }
        }

        if (this.pagina2 != null) {
            if (pagina2.getEstampillaIzquierda() != null && 
                pagina2.getEstampillaIzquierda().getIdEstampilla().equals(nuevaEstampilla.getIdEstampilla())) {
                return true;
            }
            if (pagina2.getEstampillaDerecha() != null && 
                pagina2.getEstampillaDerecha().getIdEstampilla().equals(nuevaEstampilla.getIdEstampilla())) {
                return true;
            }
        }

        return false;
    }

    // Getters y Setters
    public Pagina getPagina1() {
        return pagina1;
    }

    public void setPagina1(Pagina pagina1) {
        this.pagina1 = pagina1;
    }

    public Pagina getPagina2() {
        return pagina2;
    }

    public void setPagina2(Pagina pagina2) {
        this.pagina2 = pagina2;
    }
}