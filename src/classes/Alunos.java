package classes;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getLista() {
        return alunos;
    }

    public int getQuantidade() {
        return alunos.size();
    }

    public boolean isEmpty() {
        return alunos.isEmpty();
    }

    public Aluno getMaiorAluno() {
        if (isEmpty()) return null;
        Aluno maior  = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getMedia() > maior.getMedia()) {
                maior = a;
            }
        }
        return maior;
    }

    public Aluno getMenorAluno() {
        if (isEmpty()) return null;
        Aluno menor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getMedia() < menor.getMedia()) {
                menor = a;
            }
        }
        return menor;
    }

    public float getMediaGeral(){
        if (isEmpty()) return 0;
        float soma = 0;
        for (Aluno a : alunos) {
            soma += a.getMedia();
        }
        return soma / alunos.size();
    }

}
