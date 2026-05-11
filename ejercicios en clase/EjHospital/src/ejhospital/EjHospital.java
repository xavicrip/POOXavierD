package ejhospital;

import java.util.Scanner;

public class EjHospital {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        // Declarar variables para usar en el constructor
        String nom, ciud;
        int numD, numC;
        double pres;
        int op;
        boolean opcion = true;
        
        //for (int i=0;1 i<3; i++){
        
        //do{
        
        while(opcion){
        
        // CASO BASE {
        System.out.println("----------------------------------");
        System.out.println("Seleccione la opción: ");
        System.out.println("Opción 1: Crear hospitales en quito");
        System.out.println("Opción 2: Crear hospitales en quito, con $ 250000.10");
        System.out.println("Opción 3: Crear hospitales en cualquier lugar del Ecuador");
        System.out.println("Opción 4: Salir");
        
        op = e.nextInt();
        e.nextLine();
        
        switch (op) {
            case 1:
                // Pido datos
                System.out.println("-----------------------------------");
                System.out.println("Ingreso de datos: ");
                System.out.print("Ingrese nombre del hospital: ");
                nom = e.nextLine();
                System.out.print("Ingrese la cantidad de médicos: ");
                numD = e.nextInt();
                System.out.print("Ingrese número de camas: ");
                numC = e.nextInt();
                System.out.print("Ingrese el presupuesto anual $: ");
                pres = e.nextDouble();
                System.out.println("-----------------------------------");
                
                // 2. Crear el objeto hospital
                
                Hospital h = new Hospital(nom, numD, numC, pres);
                
                // setear
               
                /*
               h.setNombreHospital(nom);
               h.setNumDoc(numD);
               h.setNumCamas(numC);
               h.setPresupuesto(pres);
                */
                
                // 3. Imprimir resultados
                
                System.out.println("--------------------------------");
                System.out.println("El hospital " + h.getNombreHospital() + " esta en la ciudad de " + h.getCiudadHospital() + " y tiene un presupuesto de $ " + h.getPresupuesto());
                System.out.println("--------------------------------");
               
                
                
                break;
                
            case 2:
                
                // Pido datos
                System.out.println("-----------------------------------");
                System.out.println("Ingreso de datos: ");
                System.out.print("Ingrese nombre del hospital: ");
                nom = e.nextLine();
                System.out.print("Ingrese la cantidad de médicos: ");
                numD = e.nextInt();
                System.out.print("Ingrese número de camas: ");
                numC = e.nextInt();
                System.out.println("-----------------------------------");
                
                // 2. Crear el objeto hospital
                
                Hospital h1 = new Hospital(nom, numD, numC);
                
                // 3. Imprimir resultados
                
                System.out.println("--------------------------------");
                System.out.println("El hospital " + h1.getNombreHospital() + " esta en la ciudad de " + h1.getCiudadHospital() + " y tiene un presupuesto de $ " + h1.getPresupuesto());
                System.out.println("--------------------------------");
               break;
            
            case 3:
                // Pido datos
                System.out.println("-----------------------------------");
                System.out.println("Ingreso de datos: ");
                System.out.print("Ingrese nombre del hospital: ");
                nom = e.nextLine();
                System.out.print("Ingrese la ciudad del hospital: ");
                ciud = e.nextLine();
                System.out.print("Ingrese la cantidad de médicos: ");
                numD = e.nextInt();
                System.out.print("Ingrese número de camas: ");
                numC = e.nextInt();
                System.out.print("Ingrese el presupuesto anual $: ");
                pres = e.nextDouble();
                System.out.println("-----------------------------------");
                
                // 2. Crear el objeto hospital
                
                Hospital h2 = new Hospital(nom, ciud,numD, numC, pres);
               
                // 3. Imprimir resultados
                
                System.out.println("--------------------------------");
                System.out.println("El hospital " + h2.getNombreHospital() + " esta en la ciudad de " + h2.getCiudadHospital() + " y tiene un presupuesto de $ " + h2.getPresupuesto());
                System.out.println("--------------------------------");
               break;
            
            case 4:
                opcion = false;
                System.out.println("Muchas gracias.");
                break;
               
            default:
                System.out.println("Ingrese un valor valido entre 1 y 3");
        }
        
        // CIERRE }
        
    }//while(opcion);
        
        
    }
    
}
