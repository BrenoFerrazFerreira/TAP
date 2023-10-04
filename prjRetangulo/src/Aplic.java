
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao, nov = 1;
        double medAlt, medBase;
        String tipoMedida;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
        System.out.println("Informe a unidade de medida: ");
        tipoMedida = entrada.next();

        Retangulo objRet = new Retangulo(tipoMedida);

        System.out.println("Informe a altura: ");
        medAlt = entrada.nextDouble();
        objRet.setAltura(medAlt);

        System.out.println("Informe a base: ");
        medBase = entrada.nextDouble();
        objRet.setBase(medBase);
        
        do{

            System.out.println("\n1-Fazer o cálculo da área: ");
            System.out.println("2-Fazer o cálculo do perímetro: ");
            System.out.println("3-Ver Altura");
            System.out.println("4-Ver base");
            System.out.println("5-Iniciar novamente");
            System.out.println("6-Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1){
                System.out.println("\nMedida da área do retangulo: " + objRet.calcArea() + " " + objRet.getUnidMed() + "²");
            }
            else if (opcao == 2){
                System.out.println("\nMedida do perimetro do retangulo: " + objRet.calcPerimetro() + " " + objRet.getUnidMed());
            }
            else if (opcao == 3){
                System.out.println("Altura: " + objRet.getAltura() + " " + objRet.getUnidMed());
            }
            else if (opcao == 4){
                System.out.println("Altura: " + objRet.getBase() + " " + objRet.getUnidMed());
            }
            else if (opcao == 5){
                objRet.setAltura(0);
                objRet.setBase(0);
                opcao = 7;
            }
            if (opcao == 6){
                opcao = 7;
                nov = 2;
            }
        } while (opcao < 6);
        }while (nov == 1);
    }
}
