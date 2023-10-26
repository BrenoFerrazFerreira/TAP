

/* 
@authors: Dimas
 */

public class Produto {
    private int codigo;
    private String descricao;
    private int qtde;
    private double precoUnit;
    
    public Produto(int cod, String desc) {
        codigo = cod;
        descricao = desc;
    }    

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setDescricao(String desc) {
        descricao = desc;
    }

    public void setQtde(int q) {
        qtde = q;
    }  

    public void setPrecoUnit(double preco) {
        precoUnit = preco;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public int getQtde() {
        return qtde;
    }
}
