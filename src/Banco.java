import java.util.List;

public class Banco {

    private String nomeBanco;
    private List<Conta> contas;

    public String getNome() {
        return nomeBanco;
    }

    public void setNome(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
