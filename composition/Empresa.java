package composition;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
  private String nome;
  private List<Funcionario> funcionarios;

  public Empresa(String nome) {
    this.nome = nome;
    this.funcionarios = new ArrayList<>();
  }

  public Empresa(String nome, List<Funcionario> funcionarios) {
    this.nome = nome;
    this.funcionarios = funcionarios;
  }

  public void adicionaFuncionario(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }

  public void adicionaFuncionarios(List<Funcionario> funcionarios) {
    this.funcionarios.addAll(funcionarios);
  }

  public String getNome() {
    return nome;
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }

}