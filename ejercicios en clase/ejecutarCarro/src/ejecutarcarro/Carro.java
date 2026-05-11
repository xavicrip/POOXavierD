package ejecutarcarro;

public class Carro {

    private String matricula;
    private String placa;
    private double kilometraje;

    // Constructor por defecto - Caso
    
    // constructor vacio

    public Carro() {
    
    
    
    }
    
    // parametros

    public Carro(String matricula) {
        this.matricula = matricula;
    }

    public Carro(String matricula, double kilometraje) {
        this.matricula = matricula;
        this.kilometraje = kilometraje;
    }

    public Carro(double kilometraje, String placa) {
        this.matricula = "ABC12";
        this.placa = placa;
        this.kilometraje = kilometraje;
    }
    
    
    
    
    
    
    
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    

    
}
