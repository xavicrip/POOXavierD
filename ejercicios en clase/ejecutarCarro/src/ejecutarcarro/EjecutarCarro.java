package ejecutarcarro;

public class EjecutarCarro {

    public static void main(String[] args) {

        Carro c = new Carro();
        
        Carro c1 = new Carro("sdfgh");
        
        Carro c2 = new Carro("sdfgh", 150000);
        
        Carro c3 = new Carro(12000, "jshgjsd");
        
        System.out.println("matricula " + c3.getMatricula());
        
    }
    
}
