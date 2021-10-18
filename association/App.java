package association;

public class App {

    public static void main(String[] args) {
        Curso ads = new Curso("ADS");

        Professor jesiel = new Professor("Jesiel");

        ads.adicionaDisciplina(new Disciplina("Topicos Especiais", 100, jesiel));

        System.out.println("Curso: " + ads.getNome());

        for (Disciplina disciplina : ads.getDisciplinas()) {
            System.out.println(disciplina.getNome() + " \nch: " + disciplina.ch);
        }

    }
}