
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao, v_cod, dias;
        String v_cat;
        double v_valor, pagamento = 0, resto;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o codigo do livro: ");
        v_cod = entrada.nextInt();
        
        System.out.println("Informe a categoria do livro: ");
        v_cat = entrada.next();
        
        Livro objLivro = new Livro(v_cod, v_cat);
        
        System.out.println("Informe o valor da multa: ");
        v_valor = entrada.nextDouble();
        objLivro.setValMulta(v_valor);
        
        System.out.println("Informe a quantidade de dias de atraso: ");
        dias = entrada.nextInt();
        
        do {
            System.out.println("\n1-Consultar situação do livro");
            System.out.println("2-Emprestar livro");
            System.out.println("3-Liberar livro");
            System.out.println("4-Pague a multa");
            System.out.println("5-Sair");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                if (objLivro.getEstado() == true){
                    System.out.println("\nO livro não está disponível.");
                } else {
                    System.out.println("\nO livro está disponível.");
                }
            }
            else if(opcao == 2){
                if (objLivro.getEstado() == false){
                    objLivro.emprestar();
                    System.out.println("\nO livro foi emprestado com sucesso.");
                } else {
                    System.out.println("\nO livro não está disponível.");
                }
            }
            else if (opcao == 3){
                if (objLivro.getEstado() == true && objLivro.calcTotalMulta(dias) == 0 ){
                    objLivro.devolver();
                    System.out.println("\nO livro foi devolvido com sucesso.");
                } else if (objLivro.getEstado() == true && objLivro.calcTotalMulta(dias) != 0) {
                    resto = objLivro.calcTotalMulta(dias) - pagamento;
                    if (resto == 0){
                        objLivro.devolver();
                        System.out.println("\nO livro foi devolvido com sucesso.");
                    } else {
                        System.out.println("\nPague a multa caloteiro.\nFaltam  R$" + resto + " a serem pagos");
                    }
                    
                }
                else {
                    System.out.println("\nO livro não foi emprestado.");
                }
            }
            else if (opcao == 4){
                System.out.println("Informe o valor do pagamento: ");
                pagamento = entrada.nextDouble();
                System.out.println("Pagamento efetuado. ");
            }
            else if (opcao == 5){
                opcao = 5;
            }
            else {
                
            }
        }while (opcao < 6);
    }
    
}
