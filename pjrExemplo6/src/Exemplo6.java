/**
 *
 * @author Breno
 */
public class Exemplo6 {
    public static void main(String[] args) {
        double[] tabNum = new double[10];
        int col;
        
        for (col = 0; col < 10; col++){
            tabNum[col] = Math.random() * 100;
            
            System.out.println("Número " + col + ": " + tabNum[col]);
        }
    }
    
}
