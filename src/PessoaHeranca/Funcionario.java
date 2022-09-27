package PessoaHeranca;

public class Funcionario extends PessoaL{

    private String setor;
    private boolean trabalhando;


    // Método
    public void mudarTrabalho(){

    }
    // Método Especial

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
