package composition;

import java.util.List;

public class PessoaFisica extends Funcionario {

  public PessoaFisica(String identificador, String nome, double salario, List<String> beneficios) throws Exception {
    super(identificador, nome, salario, beneficios);
    this.validaCPF(identificador);
  }

  private void validaCPF(String cpf) throws Exception {
    try {
      if (cpf.length() != 11) {
        throw new Exception("CPF Inválido");
      }
    } catch (Exception e) {
      throw e;

    }
  }

  @Override
  public double getSalarioLiquido() {
    return super.getSalario() - super.getSalario() * 0.1;
  }

}