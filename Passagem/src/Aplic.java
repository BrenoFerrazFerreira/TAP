
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao, numPassagem, poltrona;
        double preco, valorPagar;
        String tipo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número da passagem: ");
        numPassagem = entrada.nextInt();
        
        Passagem objPass = new Passagem(numPassagem);
        
        System.out.println("Informe o número da poltrona: ");
        poltrona = entrada.nextInt();
        objPass.setPoltrona(poltrona);
        
        System.out.println("Informe o preço da passagem: ");
        preco = entrada.nextInt();
        objPass.setPreco(preco);
        
        System.out.println("Informe o tipo da passagem: ");
        tipo = entrada.next();
        objPass.setTipo(tipo);
        
        
        do{
        System.out.println("\n1-Consultar passagem: ");
        System.out.println("2-Alterar tipo passagem: ");
        System.out.println("Sair");
        opcao = entrada.nextInt();
        
        if (opcao == 1){
            System.out.println("\nNúmero da passagem: " + objPass.getNumero());
            System.out.println("Número da poltrona: " + objPass.getPoltrona());
            System.out.println("Preço da passagem: " + objPass.getPreco());
            System.out.println("Tipo da passagem: " + objPass.getTipo());
            System.out.println("Valor a pagar: " + objPass.calcValPagar());
            
        }
        else if (opcao == 2){
            System.out.println("\nInforme o tipo da passagem: ");
            tipo = entrada.next();
            objPass.setTipo(tipo);
        }
        else if (opcao == 3){
            opcao = 4;
        }
        } while(opcao < 4);
    }
    
}
