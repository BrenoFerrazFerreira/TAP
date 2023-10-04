
import java.util.Scanner;

/**
 *
 * @author Dimas
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
           System.out.println("2-Desligar a Buzina");
           System.out.println("3-Acionar a Buzina");
           System.out.println("4-Sair");
           System.out.print("Digite a opção: ");
           opcao = entrada.nextInt();
           
           if (opcao == 1){
               if (objBuzina.obterEstado() == false){
                   objBuzina.ligar();
                   System.out.println("\n[A buzina foi ligada]\n");
               }else{
                   System.out.println("\n---> A buzina já está ligada <---");
               }
           }
           else if (opcao == 2){
               if (objBuzina.obterEstado() == true){
                   objBuzina.desligar();
                   System.out.println("\n[A buzina foi desligada]\n");
               }else{
                   System.out.println("\n---> A buzina já está desligada <---");
               }
           }
           else if (opcao == 3){
               if (objBuzina.obterEstado() == true){
                   objBuzina.acionar();
               }else{
                   System.out.println("\n---> A buzina está desligada <---");
               }
           }
           else if (opcao == 4){
              opcao = 5;
           }
       }while(opcao < 4);
    }
}
