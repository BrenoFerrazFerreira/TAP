/**
 *
 * @author Breno
 */
public class Vendedor {
    private String cpf, nome;
    private double salarioBase, taxaComissao;
    
    public Vendedor(String p_cpf, String p_nome, double p_taxa){
        cpf = p_cpf;
        nome = p_nome;
        taxaComissao = p_taxa;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void setNome(String p_nome){
        nome = p_nome;
    }
    
    public void setSalarioBase(double p_salario) {
        salarioBase = p_salario;
    }
    
    
    public void setTaxaComissao(double p_taxa){
        taxaComissao = p_taxa;
    }
   
}
