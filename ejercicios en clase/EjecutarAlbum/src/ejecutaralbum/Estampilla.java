package ejecutaralbum;

public class Estampilla {
    private String idEstampilla;
    private Jugador jugador;
    private boolean esHolografica;

    // Constructor sobrecargado
    public Estampilla(String idEstampilla, Jugador jugador, boolean esHolografica) {
        this.idEstampilla = idEstampilla;
        this.jugador = jugador;
        this.esHolografica = esHolografica;
    }

    // Getters y Setters
    public String getIdEstampilla() {
        return idEstampilla;
    }

    public void setIdEstampilla(String idEstampilla) {
        this.idEstampilla = idEstampilla;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEsHolografica() {
        return esHolografica;
    }

    public void setEsHolografica(boolean esHolografica) {
        this.esHolografica = esHolografica;
    }
}