/**
 *
 * @author Breno
 */
public class Retangulo {
    private double altura;
    private double base;
    private String unidMed;
    
    public Retangulo(String uMed){
        unidMed = uMed;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public String getUnidMed(){
        return(unidMed);
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public double getBase(){
        return(base);
    }
    
    public double calcArea(){
        double area = altura * base;
        return(area);
    }
    
    public double calcPerimetro(){
        double perimetro = 2 * (altura + base);
        return(perimetro);
    }
}
