/**
 * @author 0031432312007
 */
public class Atleta {
    private String cpf;
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public Atleta (String p_cpf, String p_nome){
    cpf = p_cpf;
    nome = p_nome;
};
    public void setIdade(int id){
        idade = id;
    };
    
    public void setAltura(double alt){
        altura = alt;
    };
    
    public void setPeso(double p_peso){
        peso = p_peso;
    };
    
    public String getCpf(){
        return cpf;
    };
    
    public String getNome(){
        return nome;
    };
    
    public int getIdade(){
        return idade;
    };

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public double calcIMC(){
        return peso/ Math.pow(altura,2);
    };
}




