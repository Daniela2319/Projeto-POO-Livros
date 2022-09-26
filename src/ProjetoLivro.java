import ProjetoLivroI.Pessoa;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];

        Livro[] livro = new Livro[2];

        pessoa[0] = new Pessoa("Daniela","F",38);
        pessoa[1] = new Pessoa("Frank","M",18);



        livro[0] = new Livro("Aprendendo Java","Paula Araujo",250,pessoa[1]);
        livro[0].abrir();
        livro[0].folhear(125);
        livro[0].avancaPag();
        livro[0].voltaPag();




        livro[1] = new Livro("Java para Leigos", "Thiago Chocolate",560,pessoa[0]);
        livro[1].abrir();
        livro[1].folhear(164);
        livro[1].avancaPag();
        livro[1].voltaPag();

        System.out.println("Leitor 1");
        System.out.println(livro[0].detalhes());

        System.out.println("Leitor 2");
        System.out.println(livro[1].detalhes());

    }
}
