package ejecutarhospital;

import java.util.Scanner;

public class EjecutarHospital {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        // Variables usar
        
        String nomH, ciudad;
        int nDoc, nCam;
        double pres;
        boolean op = true;
        
        int var;
        
        //for (int i=0; i<2; i++){
        
        //do{
        
        while(op){
        
        System.out.println("--------------------------------------------------");         
        System.out.println("Menu de opciones: ");
        System.out.println("Opcion 1: Crear un hospital en Quito");
        System.out.println("Opcion 2: Crear un hospital en Quito con un presupuesto de $250000.10");
        System.out.println("Opcion 3: Crear un hospital en Ecuador");
        System.out.println("Opcion 4: Salir");
        
        var = e.nextInt();
        System.out.println("--------------------------------------------------");
        e.nextLine();
                
        
        
        
        
        switch (var) {
            case 1:
                System.out.println("--------------------------------------------------");
                System.out.print("Ingresa nombre del Hospital: ");
                nomH = e.nextLine();
                System.out.print("Ingresa numero de doctores: ");
                nDoc = e.nextInt();
                System.out.print("Ingresa numero de camas: ");
                nCam = e.nextInt();
                System.out.print("Ingresa presupuesto del hospital $: ");
                pres = e.nextDouble();
                
                Hospital h = new Hospital(nomH, nDoc, nCam, pres);
                
                // Imprimir datos
                
                System.out.println("El hospital " + h.getNombreHospital() + " creado en la ciudad de " + h.getCiudad() + " , tiene un presupuesto de $ " + h.getPresupuesto());
                
                
                break;
            case 2:
                System.out.println("--------------------------------------------------");
                System.out.print("Ingresa nombre del Hospital: ");
                nomH = e.nextLine();
                System.out.print("Ingresa numero de doctores: ");
                nDoc = e.nextInt();
                System.out.print("Ingresa numero de camas: ");
                nCam = e.nextInt();
                
                Hospital h1 = new Hospital(nomH, nDoc, nCam);
                
                // Imprimir datos
                
                System.out.println("El hospital " + h1.getNombreHospital() + " creado en la ciudad de " + h1.getCiudad() + " , tiene un presupuesto de $ " + h1.getPresupuesto());
                break;
            case 3:
                System.out.println("--------------------------------------------------");
                System.out.print("Ingresa nombre del Hospital: ");
                nomH = e.nextLine();
                System.out.print("Ingresa la ciudad del hospital: ");
                ciudad = e.nextLine();
                System.out.print("Ingresa numero de doctores: ");
                nDoc = e.nextInt();
                System.out.print("Ingresa numero de camas: ");
                nCam = e.nextInt();
                System.out.print("Ingresa presupuesto del hospital $: ");
                pres = e.nextDouble();
                
                
                Hospital h2 = new Hospital(nomH, ciudad, nDoc, nCam, pres);
                
                // Imprimir datos
                
                System.out.println("El hospital " + h2.getNombreHospital() + " creado en la ciudad de " + h2.getCiudad() + " , tiene un presupuesto de $ " + h2.getPresupuesto());
                
                
                break;
                
            case 4:
                
                op = false;
                break;
            
            default:
                System.out.println("ingrese un valor entre 1 y 3");
                break;
               
                
        }
     }//while(op);
    
    }
}    
