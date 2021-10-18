package composition;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    List<String> beneficiosPF = new ArrayList<>();
    beneficiosPF.add("plano de saúde");
    beneficiosPF.add("VR");
    beneficiosPF.add("Férias");

    List<String> beneficiosPJ = new ArrayList<>();
    beneficiosPJ.add("plano de saúde");

    Empresa ifpi = new Empresa("IFPI");

    Funcionario fernando;

    try {
      fernando= new PessoaFisica("74011232112", "Fernando", 10000, beneficiosPF);
      
      ifpi.adicionaFuncionario(fernando);
      
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Empresa: " + ifpi.getNome());

    for (Funcionario funcionario : ifpi.getFuncionarios()) {
      System.out.print("Nome: " + funcionario.getNome() + " ----------------------  ");
      System.out.print("\nIdentificador: " + funcionario.getIdentificador());  
      System.out.print("\nSalário bruto: " + funcionario.getSalario());
      System.out.print("\nSalário Liquido: " + funcionario.getSalarioLiquido());
      System.out.println("\nBeneficios: " + funcionario.getBeneficios());
    }
  }
}