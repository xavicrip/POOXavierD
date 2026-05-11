package ejecutaralbum;

public class Pagina {
    private int numeroPagina;
    private Estampilla estampillaIzquierda;
    private Estampilla estampillaDerecha;
    
    // Constructor
    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    // Getters y Setters
    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public Estampilla getEstampillaIzquierda() {
        return estampillaIzquierda;
    }

    public void setEstampillaIzquierda(Estampilla estampillaIzquierda) {
        this.estampillaIzquierda = estampillaIzquierda;
    }

    public Estampilla getEstampillaDerecha() {
        return estampillaDerecha;
    }

    public void setEstampillaDerecha(Estampilla estampillaDerecha) {
        this.estampillaDerecha = estampillaDerecha;
    }
}