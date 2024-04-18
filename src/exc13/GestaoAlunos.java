package exc13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {
    private int indice;
    private Aluno[] alunos;
    private Scanner leia;

    public GestaoAlunos() {
        this.indice = 0;
        this.alunos = new Aluno[50];
        this.leia = new Scanner(System.in);
    }

    public void criar() {
        if (isFull()) {
            System.out.println(">> ERRO: CHEIO DE ALUNOS! Remova antes de adicionar.");
            return;
        }

        System.out.println(">>> ADICIONANDO ALUNO NOVO");
        alunos[indice] = new Aluno();

        System.out.print("Digite o ID: ");
        alunos[indice].setId(leia.nextLong());

        leia.nextLine();
        System.out.print("Digite a data de nascimento (01/01/2001): ");
        String nascimento = leia.nextLine();
        alunos[indice].setNascimento(formatarData(nascimento));

        System.out.print("Digite o RA: ");
        alunos[indice].setRa(leia.nextLine());

        System.out.print("Digite o nome: ");
        alunos[indice].setNome(leia.nextLine());

        System.out.println(">> Aluno adicionado: " + alunos[indice]);

        indice++;
    }

    public void atualizar() {
        if (isEmpty()) {
            System.out.println(">> ERRO: NÃO HÁ ALUNOS! Adicione antes de atualizar.");
            return;
        }

        int indiceRa = buscarIndice();
        if (indiceRa == -1) return; //Não encontrado

        System.out.println(">>> ATUALIZANDO ALUNO: " + alunos[indiceRa].getNome());
        System.out.println(">> Dados do aluno ANTES: " + alunos[indiceRa]);

        System.out.print("(Novo) Digite a data de nascimento (01/01/2001): ");
        String nascimento = leia.nextLine();
        alunos[indiceRa].setNascimento(formatarData(nascimento));

        System.out.print("(Novo) Digite o nome: ");
        alunos[indiceRa].setNome(leia.nextLine());

        System.out.println(">> Dados do aluno DEPOIS: " + alunos[indiceRa]);
    }

    public void excluir() {
        if (isEmpty()) {
            System.out.println(">> ERRO: NÃO HÁ ALUNOS! Adicione antes de remover.");
            return;
        }

        int indiceRa = buscarIndice();
        if (indiceRa == -1) return; //Não encontrado

        System.out.println(">>> ALUNO REMOVIDO: " + alunos[indiceRa].getNome());
        for (int i = indiceRa; i < indice - 1; i++) {
            alunos[i] = alunos[i + 1];
        }

        indice--;
    }

    public void exibir() {
        if (isEmpty()) {
            System.out.println(">> ERRO: NÃO HÁ ALUNOS! Adicione antes de exibir.");
            return;
        }
        int indiceRa = buscarIndice();

        if (indiceRa != -1) {
            System.out.println(">>> EXIBINDO ALUNO");
            System.out.println(alunos[indiceRa]);
        }
    }

    public void listarTodos() {
        System.out.println(">>> LISTANDO ALUNOS CADASTRADOS");
        for (int i = 0; i < indice; i++) {
            System.out.println(alunos[i]);
        }
    }

    public void menu() {
        System.out.println("\nDigite a letra entre o parenteses para escolher a opção.");

        char escolha;
        do {
            System.out.println("\n+=====================+");
            System.out.println("(C)riar");
            System.out.println("(E)xibir");
            System.out.println("(R)emover");
            System.out.println("(A)tualizar");
            System.out.println("(T)odos");
            System.out.println("(S)air");
            System.out.println("+=====================+");

            System.out.print("> Escolha: ");
            String textoMaiusculo = leia.nextLine().toUpperCase();
            escolha = textoMaiusculo.charAt(0);

            switch (escolha) {
                case 'C':
                    this.criar();
                    break;
                case 'E':
                    this.exibir();
                    break;
                case 'R':
                    this.excluir();
                    break;
                case 'A':
                    this.atualizar();
                    break;
                case 'T':
                    this.listarTodos();
                    break;
                case 'S':
                    System.out.println("Saindo do laço");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 'S');
    }

    private int buscarIndice() {
        System.out.print("> Digite o RA do aluno desejado: ");
        String ra = leia.nextLine();

        for (int i = 0; i < indice; i++) {
            if (alunos[i].getRa().equals(ra)) {
                return i;
            }
        }

        System.out.println(">> Aluno com RA [" + ra + "] não encontrado!");
        return -1;
    }

    private LocalDate formatarData(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataNascimento, formatter);
    }

    public boolean isFull() {
        return indice == alunos.length;
    }

    public boolean isEmpty() {
        return indice == 0;
    }
}
