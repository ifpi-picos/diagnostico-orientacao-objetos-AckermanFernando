package composition;

import java.util.List;

public abstract class Funcionario {

  private String nome;
  private double salario;
  private List<String> beneficios;
  private String identificador;

  public Funcionario(String identificador, String nome, double salario, List<String> beneficios) {
    this.identificador = identificador;
    this.nome = nome;
    this.salario = salario;
    this.beneficios = beneficios;
  }

  public String getIdentificador() {
    return identificador;
  }

  public List<String> getBeneficios() {
    return beneficios;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  abstract public double getSalarioLiquido();

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void adicionaBeneficio(String beneficio) {
    this.beneficios.add(beneficio);
  }

  public void removeBeneficio(String beneficio) {
    this.beneficios.remove(beneficio);
  }

}