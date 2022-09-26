import ProjetoLivroI.Pessoa;

public class Livro implements Publicacao {

    private String tilulo;
    private String autor;
    private int totalpagina;
    private Pessoa leitor;
    private int pagAtual;
    private boolean aberto;


    public String detalhes() {
        return "Livro{" +
                "\n tilulo= '" + tilulo + '\'' +
                ", \n autor= '" + autor + '\'' +
                ", \n totalpagina= " + totalpagina +
                ", \n pagAtual= " + pagAtual +",  aberto= " + aberto +
                ", \n leitor= " + leitor.getNome() + ", sexo = " + leitor.getSexo()+",  idade= " + leitor.getIdade()+
                '}';

    }

    // Construtor
    public Livro(String tilulo, String autor, int totalpagina, Pessoa leitor) {
        this.tilulo = tilulo;
        this.autor = autor;
        this.totalpagina = totalpagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
        // Getter Setter
    public String getTilulo() {
        return tilulo;
    }

    public void setTilulo(String tilulo) {
        this.tilulo = tilulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpagina() {
        return totalpagina;
    }

    public void setTotalpagina(int totalpagina) {
        this.totalpagina = totalpagina;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    // Implementacao Publicacao
    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totalpagina) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancaPag() {
        this.pagAtual++;
    }

    @Override
    public void voltaPag() {
        this.pagAtual--;
    }
}
