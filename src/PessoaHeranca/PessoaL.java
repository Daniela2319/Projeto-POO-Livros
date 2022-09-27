package PessoaHeranca;

public class PessoaL {

    // Atributos
    private String nome;
    private int idade;

    // Método
    public void fazendoaniversario(){
        this.idade++;
    }

    // Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String status() {
        return "PessoaL{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
