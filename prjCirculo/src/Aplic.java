
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    
    public static void main(String[] args) {
        int opcao, nov = 1;
        double medRaio;
        String tipoMedida;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
        System.out.println("Informe a unidade de medida: ");
        tipoMedida = entrada.next();
        
        Circulo objCir = new Circulo(tipoMedida);
        
        System.out.println("Informe o raio: ");
        medRaio = entrada.nextDouble();
        objCir.setRaio(medRaio);
        
        do{

            System.out.println("\n1-Fazer o cálculo da área: ");
            System.out.println("2-Fazer o cálculo do diametro: ");
            System.out.println("3-Fazer o cálculo do perimetro");
            System.out.println("4-Ver Raio");
            System.out.println("5-Iniciar novamente");
            System.out.println("6-Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1){
                System.out.println("\nMedida da área do circulo: " + objCir.calcArea() + " " + objCir.getUnidMed() + "²");
            }
            else if (opcao == 2){
                System.out.println("\nMedida do diametro do circulo: " + objCir.calcDiametro() + " " + objCir.getUnidMed());
            }
            else if (opcao == 3){
                System.out.println("\nMedida do diametro do circulo: " + objCir.calcPerimetro() + " " + objCir.getUnidMed());
            }
            else if (opcao == 4){
                System.out.println("Raio: " + objCir.getRaio() + " " + objCir.getUnidMed());
            }
            else if (opcao == 5){
                objCir.setRaio(0);
                opcao = 7;
            }
            if (opcao == 6){
                opcao = 7;
                nov = 2;
            }
        } while (opcao < 7);
        }while(nov == 1);
    }
    
}
