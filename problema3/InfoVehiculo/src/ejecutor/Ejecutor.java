
package ejecutor;
import infovehiculo.InfoVehiculo;

public class Ejecutor {
    public static void main(String[] args) {
        
        InfoVehiculo vehiculo1 = new InfoVehiculo("1105716958", "Toyota", 1700,
                1580.00);
        vehiculo1.calcularValorMatricula();
        System.out.printf("%s\n", vehiculo1);
        
        InfoVehiculo vehiculo2 = new InfoVehiculo("11057145659", "Suzuki", 1700,
                1580.00);
        vehiculo2.calcularValorMatricula();
        System.out.printf("%s\n", vehiculo2);
    }
}
