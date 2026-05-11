package ejecutarvendedor;

import java.util.Scanner;

public class EjecutarVendedor {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        // Declara variables para guardar datos
        
        String n;
        double salario;
        int edad, autos;
        boolean opcion = true;
        String op;
        
        
        do{
        
        // Caso base - 1 vendedor
   
        //1. Pedir datos por teclado
        System.out.println("------------------------------------");
        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre del vendedor: ");
        n = e.nextLine();
        System.out.print("Edad del vendedor: ");
        edad = e.nextInt();
        System.out.print("Salario Mínimo $ ");
        salario = e.nextDouble();
        System.out.print("Cantidad de autos vendidos ");
        autos = e.nextInt();
        
        
        // 2. Crear el objeto
        
        Vendedor ven = new Vendedor(n, edad, salario, autos);
        
        /*
        
        Vendedor ven = new Vendedor();
        
        // 3. Setear los datos
        
        ven.setNombre(n);
        ven.setEdad(edad);
        ven.setSalarioMinimo(salario);
        ven.setNumAutos(autos);
        
        */
        
        // 3. Invocar al metodo para calcular pago mensual
        
        ven.calcularPagoMensual();
        
        
        // 4. Imprimir los resultados
        
        System.out.println("----------------------");
        System.out.println("El vendedor " + ven.getEdad() + " vendio " + ven.getNumAutos() + " autos en este mes y su pago mesual es " + ven.getPagoMensual());
        System.out.println("----------------------");
        
        e.nextLine();
        System.out.println(" Quiere seguir calculando el salario del vendedor, presione S o N");
        op = e.nextLine();
        
        if (op.equals("N")){
        
            opcion = false;
            
        }
        
        
        
        
        }while(opcion);
        
        System.out.println("Fin, muchas gracias");
        
    }
    
}
