package ejemploTriangulo;

public class triangulo {
    private double base;
    private double altura;
    private double area;

    // metodo que devuelve el area del triangulo -> double
    public void calcularArea() {
        area = (base * altura) / 2;
    }
    
    // metodos setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // metodo getter
    public double getArea() {
        return area;    
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;  
    }
    

}
