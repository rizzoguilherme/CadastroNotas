package classes;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        Alunos alunos = new Alunos();

        while (flag) {
            System.out.println("================================");
            System.out.println("SISTEMA DE CONTROLE DE NOTAS");
            System.out.println("================================");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Exibir estatísticas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                int escolha = input.nextInt();
                switch (escolha) {
                    case 1:
                        input.nextLine(); // limpa buffer antes de ler o nome
                        System.out.print("Digite o nome do aluno: ");
                        String nome = input.nextLine();
                        float notaUm  = lerNota(input, "Digite a primeira nota do aluno (0 a 10): ");
                        float notaDois = lerNota(input, "Digite a segunda nota do aluno (0 a 10): ");
                        float notaTres = lerNota(input, "Digite a terceira nota do aluno (0 a 10): ");
                        input.nextLine(); // limpa buffer após último nextFloat()
                        alunos.adicionar(new Aluno(nome, notaUm, notaDois, notaTres));
                        System.out.println("Aluno cadastrado com sucesso!");
                        break;
                    case 2:
                        if (alunos.isEmpty()) {
                            System.out.println("Nenhum aluno cadastrado.");
                            break;
                        }
                        System.out.println("Os alunos cadastrados são:");
                        for (Aluno a : alunos.getLista()) {
                            System.out.println(a);
                            System.out.println("--------------");
                        }
                        break;
                    case 3:
                        if (alunos.isEmpty()) {
                            System.out.println("Nenhum aluno cadastrado.");
                            break;
                        }
                        Aluno maior = alunos.getMaiorAluno();
                        Aluno menor = alunos.getMenorAluno();
                        System.out.println("Quantidade de alunos: " + alunos.getQuantidade());
                        System.out.printf("Maior média: %s - %.2f%n", maior.getNome(), maior.getMedia());
                        System.out.printf("Menor média: %s - %.2f%n", menor.getNome(), menor.getMedia());
                        System.out.printf("Média geral: %.2f%n", alunos.getMediaGeral());
                        break;
                    case 4:
                        flag = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Insira uma opção válida!");
                input.nextLine(); // descarta o token inválido do buffer
            }
        }
        input.close();
    }

    // Lê e valida uma nota entre 0 e 10
    private float lerNota(Scanner input, String mensagem) {
        float nota;
        do {
            System.out.print(mensagem);
            nota = input.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite um valor de 0 a 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
