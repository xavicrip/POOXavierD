package ejecutarhospital;

public class Hospital {

    private String nombreHospital;
    private String ciudad;
    private int numDoctores;
    private int numCamas;
    private double presupuesto;

    // Declarar contructor 
    
    // Contructor Vacio
    
    public Hospital(){
    
    
    
    }
    
    
   // Opcion 1: Quito por defecto

    public Hospital(String nombreHospital, int numDoctores, int numCamas, double presupuesto) {
        this.nombreHospital = nombreHospital;
        this.ciudad = "Quito";
        this.numDoctores = numDoctores;
        this.numCamas = numCamas;
        this.presupuesto = presupuesto;
    }
    
    // Opcion #2: 

    public Hospital(String nombreHospital,  int numDoctores, int numCamas) {
        this.nombreHospital = nombreHospital;
        this.ciudad = "Quito";
        this.numDoctores = numDoctores;
        this.numCamas = numCamas;
        this.presupuesto = 250000.10;
    }
    
    // Opcion #3: Cualquier

    public Hospital(String nombreHospital, String ciudad, int numDoctores, int numCamas, double presupuesto) {
        this.nombreHospital = nombreHospital;
        this.ciudad = ciudad;
        this.numDoctores = numDoctores;
        this.numCamas = numCamas;
        this.presupuesto = presupuesto;
    }
    
    
    public String getNombreHospital() {
        return nombreHospital;
    }

    

    public String getCiudad() {
        return ciudad;
    }

    

    public int getNumDoctores() {
        return numDoctores;
    }

   

    public int getNumCamas() {
        return numCamas;
    }

    

    public double getPresupuesto() {
        return presupuesto;
    }

    
    

    
}
