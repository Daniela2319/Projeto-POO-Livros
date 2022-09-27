package PessoaHeranca;

public class EscolaMain {
    public static void main(String[] args) {

        // Programa Principal

        PessoaL pessoaL = new PessoaL();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoaL.setNome("Daniela");
        pessoaL.setIdade(38);

        aluno.setNome("Frank");
        aluno.setIdade(5);

        professor.setNome("Valdemar");
        professor.setIdade(37);

        funcionario.setNome("Junior");
        funcionario.setIdade(55);

        System.out.println(pessoaL.status());
        System.out.println(aluno.status());
        System.out.println(professor.status());
        System.out.println(funcionario.status());
    }
}
