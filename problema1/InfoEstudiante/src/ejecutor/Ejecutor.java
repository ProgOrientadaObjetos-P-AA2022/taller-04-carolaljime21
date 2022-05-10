package ejecutor;
import infoestudiante.InfoEstudiante;

public class Ejecutor {
    public static void main(String[] args) {
        
        InfoEstudiante estudiante1 = new InfoEstudiante("Sergio", 9.90, 7.10,
                9.00);
        estudiante1.calcularPromedio();
        System.out.printf("%s\n", estudiante1);
        
        InfoEstudiante estudiante2 = new InfoEstudiante("Carolina", 8.10, 9.00,
                7.90);
        estudiante2.calcularPromedio();
        System.out.printf("%s\n", estudiante2);
    }
}
