
package chequebanco;

public class ChequeBanco {

    private String nombre;
    private String nombre_banco;
    private double valor_cheque;
    private double comision;
    private double comision_bancoTotal;
    
     public ChequeBanco(String nom, String nomB, double vcheque){    
        nombre = nom;
        nombre_banco = nomB;
        valor_cheque = vcheque;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerNombreBanco(String x){
        nombre_banco = x;
    }  
    
    public void establecerValorCheque(double x){
        valor_cheque = x;
    }
    
    public void calcularComision(){
        comision = valor_cheque * (0.003/100);
    }
    
    public void calcularComisionBancoTotal(){
        comision_bancoTotal = comision + valor_cheque ;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerNombreBanco(){
        return nombre_banco;
    }
    
    public double obtenerValorCheque(){
        return valor_cheque;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    public double obtenerComisionBancoTotal(){
        return comision_bancoTotal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nCheque "
        + "\nNombre: %s \nBanco: %s \nValor: %.2f "
        + "\nComision: %.2f",
        obtenerNombre(), 
        obtenerNombreBanco(),
        obtenerValorCheque(),
        obtenerComision());
        
        return cadena;
    }
    
}
