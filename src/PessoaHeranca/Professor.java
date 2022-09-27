package PessoaHeranca;

public class Professor extends PessoaL{

    private String especialidades;
    private double salario;


  // Método
    public void receberAumento(double aumento){
        this.salario += aumento;
    }

    // Método Especial

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
