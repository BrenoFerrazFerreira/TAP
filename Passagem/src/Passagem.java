/**
 *
 * @author Breno
 */
public class Passagem {
    private int numero, poltrona;
    private String tipo;
    private double preco;
    
    public Passagem(int pPassagem){
        numero = pPassagem;
    }
    
    public void setPoltrona(int pPoltrona){
        poltrona = pPoltrona;
    }
    
    public void setTipo(String pTipo){
        tipo = pTipo;
    }
    
    public void setPreco(double pPreco){
        preco = pPreco;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public String getTipo(){
        return(tipo);
    }
    
    public int getPoltrona(){
        return(poltrona);
    }
    
    public double getPreco(){
        return(preco);
    }
    
    public double calcValPagar(){
        double valorDesconto;
        
        if(tipo.equals("c") || tipo.equals("C")){
            valorDesconto = preco * 1;
            return(valorDesconto);
        }
        else if(tipo.equals("e") || tipo.equals("E")){
            valorDesconto = preco * 0.85;
            return(valorDesconto);
        }
        else if(tipo.equals("i") || tipo.equals("I")){
            valorDesconto = preco * 0.75;
            return(valorDesconto);
        }
        else {
            return 0;
        }
    } 
}
