package classes;

public class Aluno {
    private String nome;
    private String situacao;
    private float notaUm;
    private float notaDois;
    private float notaTres;
    private float media;

    // Construtor com parâmetros
    public Aluno(String nome, float notaUm, float notaDois, float notaTres) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
        setMedia();
        setSituacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaUm() {
        return notaUm;
    }

    public float getNotaDois() {
        return notaDois;
    }

    public float getNotaTres() {
        return notaTres;
    }

    public float getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    private void setMedia() {
        this.media = (this.notaUm + this.notaDois + this.notaTres) / 3;
    }

    private void setSituacao() {
        if (this.media >= 7) {
            this.situacao = "Aprovado";
        } else if (this.media >= 5) {
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s%nNotas: %.2f | %.2f | %.2f%nMédia: %.2f%nSituação: %s",
            nome, notaUm, notaDois, notaTres, media, situacao
        );
    }
}
