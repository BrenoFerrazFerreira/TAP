/**
 *
 * @author Breno
 */
public class Exemplo4 {
    public static void main(String[] args) {
        double numero;
        double resultado;
        
        numero = Math.random() * 100;
        
        for (int count = 1; count <= 10; count++){
            resultado = numero * count;
            System.out.println(numero + " * " + count + " = " + resultado);
        }
    }
    
}
