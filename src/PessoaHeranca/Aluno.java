package PessoaHeranca;

public class Aluno extends PessoaL {

    private int matricula;
    private String curso;



  // Método
    public void cancelaMatricula(){

    }

    // Método Especial

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
