/**
 *
 * @author Breno
 */
public class Exemplo5 {
    public static void main(String[] args) {
        double numero,  resultado;
        int count = 1;
        
        numero = Math.random() * 100;
        
        while (count < 11){
            resultado = numero * count;
            System.out.println(numero + " * " + count + " = " + resultado);
            count ++;
        }
    }
    
}
