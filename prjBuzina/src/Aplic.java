
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao;
        
        //instanciação de um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        //instanciação de um objeto da classe Buzina
        
        Buzina objBuzina = new Buzina();
        
        do{
            System.out.println("\n1-Ligar a Buzina");
            System.out.println("\n2-Desligar a Buzina");
            System.out.println("\n3-Acionar a Buzina");
            System.out.println("\n4-Sair");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                if (objBuzina.obterEstado() == false){
                    objBuzina.ligar();
                    System.out.println("\n[A buzina foi ligada]\n");
                } else {
                    System.out.println("\n----> A buzina já está ligada <----");
                }
            }
        } while(opcao < 4);
    }
}
