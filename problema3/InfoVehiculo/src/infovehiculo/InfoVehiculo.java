
package infovehiculo;


public class InfoVehiculo {

    private String id_duenio;
    private String marca_vehiculo;
    private int anio_fabricacion;
    private double valor_vehiculo;
    private double valor_matricula;
    
    public InfoVehiculo(String id, String marca, int anio, double valorV){    
        id_duenio = id;
        marca_vehiculo = marca;
        anio_fabricacion = anio;
        valor_vehiculo = valorV;
    }
    
    public void establecerIdDuenio(String x){
        id_duenio = x;
    }  
    public void establecerMarcaVehiculo(String x){
        marca_vehiculo = x;
    }
    
    public void establecerAnioFabricacion(int x){
        anio_fabricacion = x;
    }
    public void establecerValorVehiculo(double x){
        valor_vehiculo = x;
    }
    public void calcularValorMatricula(){
        valor_matricula = 0.002 * 100;
    }
    
    public String obtenerIdDuenio(){
        return id_duenio;
    }
    public String obtenerMarcaVehiculo(){
        return marca_vehiculo;
    }
    
    public int obtenerAnioFabricacion(){
        return anio_fabricacion;
    }
    
    public double obtenerValorVehiculo(){
        return valor_vehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valor_matricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nInformacion del vehículo "
        + "\nCedula del dueño: %s \nMarca: %s \nAño de fabricacion: %d "
        + "\nValor vehículo: %.2f \nValor matricula: %.2f\n",
        obtenerIdDuenio(), 
        obtenerMarcaVehiculo(),
        obtenerAnioFabricacion(),
        obtenerValorVehiculo(),
        obtenerValorMatricula());
        
        return cadena;
    }
}
