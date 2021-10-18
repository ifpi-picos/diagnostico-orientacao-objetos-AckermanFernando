package association;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public boolean adicionaDisicplinas(List<Disciplina> disciplinas){
        if(disciplinas.isEmpty()){
            return false;
        }
        this.disciplinas.addAll(disciplinas);
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
