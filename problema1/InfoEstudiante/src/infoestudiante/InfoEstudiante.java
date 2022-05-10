
package infoestudiante;

public class InfoEstudiante {
    
    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;
    
    public InfoEstudiante(String n, double c1, double c2, double c3){    
        nombre = n;
        cal1 = c1;
        cal2 = c2;
        cal3 = c3;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }  
    public void establecerCalificacion1(double x){
        cal1 = x;
    }
    
    public void establecerCalificacion2(double x){
        cal2 = x;
    }
    public void establecerCalificacion3(double x){
        cal3 = x;
    }
    public void calcularPromedio(){
        promedio = (cal1+cal2+cal3)/3;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenerCalificacion1(){
        return cal1;
    }
    
    public double obtenerCalificacion2(){
        return cal2;
    }
    
    public double obtenerCalificacion3(){
        return cal3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nInformacion del estudiante "
        + "\nNombre: %s \nCalificacion 1: %.2f \nCalificacion 2: %.2f "
        + "\nCalificacion 3: %.2f \nPromedio: %.2f\n",
        obtenerNombre(), 
        obtenerCalificacion1(),
        obtenerCalificacion2(),
        obtenerCalificacion3(),
        obtenerPromedio());
        
        return cadena;
    }
}
