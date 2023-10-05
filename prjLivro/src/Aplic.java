
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao, v_cod;
        String v_cat;
        double v_valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o codigo do livro: ");
        v_cod = entrada.nextInt();
        
        System.out.println("Informe a categoria do livro: ");
        v_cat = entrada.next();
        
        Livro objLivro = new Livro(v_cod, v_cat);
        
        System.out.println("Informe o valor da multa: ");
        v_valor = entrada.nextDouble();
        objLivro.setValMulta(v_valor);
        
        do {
            System.out.println("\n1-Consultar livro");
            System.out.println("2-Emprestar livro");
            System.out.println("3-Devolver livro");
            opcao = entrada.nextInt();
        }while (opcao < 10);
    }
    
}
