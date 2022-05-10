
package ejecutor;
import chequebanco.ChequeBanco;

public class Ejecutor {
    public static void main(String[] args) {
        
        ChequeBanco cheque1 = new ChequeBanco("Marta", "Banco de Loja", 1500.00);
        cheque1.calcularComision();
        cheque1.calcularComisionBancoTotal();
        System.out.printf("%s\n", cheque1);
        
        ChequeBanco cheque2 = new ChequeBanco("Sofia", "Banco de Guayaquil", 
                2700.00);
        cheque2.calcularComision();
        cheque2.calcularComisionBancoTotal();
        System.out.printf("%s\n", cheque2);
    }
}
