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
            System.out.println("2. Listar aluno");
            System.out.println("3. Exibir estatísticas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                int escolha = input.nextInt();
                switch (escolha) {
                    case 1:
                        Aluno aluno = new Aluno();
                        aluno.cadastrarAluno(input);
                        alunos.adicionar(aluno);
                        break;
                    case 2:
                        if (alunos.isEmpty()) {
                            System.out.println("Nehum aluno cadastrado.");
                            break;
                        }
                        for (Aluno a : alunos.getLista()) {
                            a.toString();
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
                        System.out.printf("Maior média: %.2f%n" + maior.getNome() + " - " + maior.getMedia());
                        System.out.printf("Menor média: %.2f%n" + menor.getNome() + " - " + menor.getMedia());
                        System.out.printf("Média geral: %.2f%n" + alunos.getMediaGeral());
                        break;
                    case 4:
                        flag = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Insira uma opção válida!");
                input.nextLine();
            }
        }
        input.close();
    }
}
