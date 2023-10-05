/**
 *
 * @author Breno
 */
public class Livro {

   private int codigo;
   private String categoria;
   private boolean estado = false;
   private double valMultaDiaria;
   
   public Livro(int pCodigo, String pCategoria){
       codigo = pCodigo;
       categoria = pCategoria;
   }
   
   public void emprestar(){
       estado = true;
   }
   
   public void devolver(){
       estado = false;
   }
   
   public void setValMulta(double pValor){
       valMultaDiaria = pValor;
   }
   
   public double getValMultaDiaria(){
       return(valMultaDiaria);
   }
   
   public String getCategoria(){
       return(categoria);
   }
   
   public boolean getEstado(){
       return(estado);
   }
   
   public double calcTotalMulta(int qtd_Dias){
       double valorTotal;
       valorTotal = valMultaDiaria * qtd_Dias;
       return (valorTotal);
   }
}
