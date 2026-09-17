package classes;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String situacao;
    private float notaUm;
    private float notaDois;
    private float notaTres;
    private float media;

    public String getNome() {
        return nome;
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

    public void setMedia() {
        this.media = (this.notaUm + this.notaDois + this.notaTres) / 3;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao() {
        if (this.media >= 7) {
            this.situacao = "Aprovado";
        } else if (this.media >= 5) {
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }
    }

    // Cadastra um aluno ao ser invocado no Menu
    public void cadastrarAluno(Scanner input) {
        System.out.println("Digite o nome do aluno: ");
        this.nome = input.nextLine();

        do {
            System.out.println("Digite a primeira nota do aluno (0 a 10): ");
            this.notaUm = input.nextFloat();
            if (this.notaUm < 0 || this.notaUm > 10) {
                System.out.println("Nota inválida. Digite um valor de 0 a 10.");
            }
        } while (this.notaUm < 0 || this.notaUm > 10);

        do {
            System.out.print("Digite a segunda nota do aluno (0 a 10): ");
            this.notaDois = input.nextFloat();
            if (this.notaDois < 0 || this.notaDois > 10) {
                System.out.println("Nota inválida. Digite um valor de 0 a 10.");
            }
        } while (this.notaDois < 0 || this.notaDois > 10);

        do {
            System.out.print("Digite a terceira nota do aluno (0 a 10): ");
            this.notaTres = input.nextFloat();
            if (this.notaTres < 0 || this.notaTres > 10) {
                System.out.println("Nota inválida. Digite um valor de 0 a 10.");
            }
        } while (this.notaTres < 0 || this.notaTres > 10);

        input.nextLine(); // limpa o buffer após nextFloat()
        setMedia();
        setSituacao();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nNotas do aluno: " + notaUm + " | "  + notaDois + " | " + notaTres +
                "\nMédia: " + media +
                "\nSituação: " + situacao;
    }
}


