
package ejecutor;
import infoprofesor.InfoProfesor;

public class Ejecutor {
    public static void main(String[] args) {
        
        InfoProfesor profesor1 = new InfoProfesor("Carmen", "Vera", "1105892345",
                500.00);
        profesor1.calcularSueldoS();
        profesor1.calcularSueldoTotal();
        System.out.printf("%s\n", profesor1);
        
        InfoProfesor profesor2 = new InfoProfesor("Mario", "Cardenas", "1105893275",
                450.00);
        profesor2.calcularSueldoS();
        profesor2.calcularSueldoTotal();
        System.out.printf("%s\n", profesor2);
    }
}
