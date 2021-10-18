package composition;

import java.util.List;

public class PessoaJuridica extends Funcionario {

  public PessoaJuridica(String identificador, String nome, double salario, List<String> beneficios) throws Exception {
    super(identificador, nome, salario, beneficios);
    this.validaCNPJ(identificador);
  }

  private void validaCNPJ(String cnpj) throws Exception {
    try {
      if (cnpj.length() != 14) {
        throw new Exception("CNPJ Inválido");
      }
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public double getSalarioLiquido() {
    return super.getSalario() - super.getSalario() * 0.05;
  }

}