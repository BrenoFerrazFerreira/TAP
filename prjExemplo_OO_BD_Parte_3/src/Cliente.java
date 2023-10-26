/**
 *
 * @author Dimas
 */
public class Cliente {
    private String cpf;
    private String nome;
    private double limCred;
    private double limCredDisp;

    public Cliente(String c, String n, double lc) {
        cpf = c;
        nome = n;
        limCred = lc;
        //limCredDisp = limCred;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getLimCred() {
        return limCred;
    }

    public double getLimCredDisp() {
        return limCredDisp;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setLimCred(double lc) {
        limCred = lc;
    }

    public void setLimCredDisp(double lcd) {
        limCredDisp = lcd;
    }
    
    
}
