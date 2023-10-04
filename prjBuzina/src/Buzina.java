/**
 *
 * @author Dimas
 */
public class Buzina {
    private boolean estado;//false - desligada  true - ligada
    
    //método construtor
    //tem o mesmo nome da classe
    //fornece um estado inicial 
    //para o objeto
    public Buzina(){
        estado = false; //estado de desligada
    }
    
    public void ligar(){
        estado = true; //estado de ligada
    }
    
    public void desligar(){
        estado = false; //estado de desligada
    }
    
    public void acionar(){
        if (estado == true){
            System.out.println("\n\tFonFon...FonFon...FonFon...FonFon...FonFon...\n");
        }    
    }
    
    public boolean obterEstado(){
        return(estado);
    }
}
