/**
 *
 * @author Breno
 */
public class Circulo {

    private double raio;
    private String unidMed;
    
    public Circulo(String uMed){
        unidMed = uMed;
    }
    
    public void setRaio(double r){
       raio = r;
    }
    
    public String getUnidMed(){
        return(unidMed);
    }
    
    public double getRaio(){
        return(raio);
    }
    
    public double calcArea(){
        double area = Math.pow(raio, 2) * 3.1416;
        return(area);
    }
    
    public double calcPerimetro(){
        double diametro = (2 * 3.1416) * raio;
        return(diametro);
    }
    
    public double calcDiametro(){
        double diametro = 2 * raio;
        return(diametro);
    }
}
