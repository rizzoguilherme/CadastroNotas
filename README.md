# CadastroNotas

Projeto desenvolvido para a faculdade com o objetivo de praticar os fundamentos de orientação a objetos em Java. O sistema permite cadastrar alunos, registrar três notas por aluno, calcular a média e exibir a situação de cada um (Aprovado, Recuperação ou Reprovado).

## Funcionalidades

- Cadastrar aluno com nome e três notas
- Listar todos os alunos cadastrados com suas notas, média e situação
- Exibir estatísticas da turma: quantidade de alunos, maior média, menor média e média geral
- Validação de notas entre 0 e 10 com reentrada em caso de valor inválido

## Estrutura do projeto

```
src/
  classes/
    Aluno.java    - modelo de dados do aluno
    Alunos.java   - repositório da coleção de alunos
    Menu.java     - interface de interação com o usuário via console
  test/
    Main.java     - ponto de entrada do programa
```

## Conceitos utilizados

**Orientação a objetos**
Cada classe tem uma responsabilidade bem definida. `Aluno` representa os dados de um aluno. `Alunos` gerencia a coleção. `Menu` cuida da interação com o usuário.

**Encapsulamento**
Os campos de `Aluno` são privados e acessados via getters. Os setters de nota foram removidos para que as notas só possam ser definidas no momento da criação do objeto, evitando estados inconsistentes.

**Construtor com parâmetros**
`Aluno` é criado já com nome e notas, garantindo que o objeto sempre esteja em estado válido desde a instância.

**Injeção de dependência**
O `Scanner` é criado uma única vez no `Menu` e passado para quem precisa, evitando múltiplas instâncias abertas sobre `System.in`.

**Sobrescrita de toString**
`Aluno` sobrescreve o método `toString()` para formatar a exibição dos dados, separando a lógica de apresentação da lógica de negócio.

**Validação com do-while**
A leitura de notas usa um laço `do-while` que repete a entrada enquanto o valor for inválido, garantindo que o programa nunca aceite uma nota fora do intervalo 0 a 10.

**Separação de responsabilidades**
A leitura dos dados do console foi movida para o `Menu`, deixando `Aluno` como um modelo de dados puro, sem dependência de `Scanner`.

## Como executar

1. Abra o projeto no IntelliJ IDEA
2. Execute a classe `test.Main`

O programa inicia no terminal com um menu interativo.

## Branches

- `master`: versão final com todas as melhorias aplicadas
- `branch2`: branch de desenvolvimento onde as refatorações foram realizadas antes do merge
