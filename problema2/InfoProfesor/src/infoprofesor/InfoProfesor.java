
package infoprofesor;


public class InfoProfesor {

    String nombre;
    String apellido;
    String cedula;
    double sueldoB;
    double sueldoS;
    double sueldoT;
    
    public InfoProfesor(String nom, String ap, String ci, double sb){    
        nombre = nom;
        apellido = ap;
        cedula = ci;
        sueldoB = sb;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerApellido(String x){
        apellido = x;
    } 
    
    public void establecerCedula(String x){
        cedula = x;
    } 
    
    public void establecerSueldoBasico(double x){
        sueldoB = x;
    }
    
    public void calcularSueldoS(){
        sueldoS = sueldoB * 0.20;
    }
    
    public void calcularSueldoTotal(){
        sueldoT = sueldoS + sueldoB;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoB;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoT;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nInformacion del profesor "
        + "\nNombre: %s \nApellido: %s \nCedula: %s "
        + "\nSueldo Basico: %.2f \nSueldo Total: %.2f\n",
        obtenerNombre(), 
        obtenerApellido(),
        obtenerCedula(),
        obtenerSueldoBasico(),
        obtenerSueldoTotal());
        
        return cadena;
    }
}
