package exc14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoFuncionario {
    private int indice = 0 ;
    private Funcionario[] funcionarios = new Funcionario[50];
    private Scanner leia = new Scanner(System.in);

    public void criar() {
        if (isFull()) {
            System.out.println(">> ERRO: CHEIO DE FUNCIONÁRIOS! Retire algum antes.");
            return;
        }

        System.out.println(">>> ADICIONANDO FUNCIONÁRIO NOVO");
        System.out.print("Digite o nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite o matrícula: ");
        String matricula = leia.nextLine();

        System.out.print("Digite a data de admissão (01/01/2001): ");
        String admissao = leia.nextLine();

        System.out.print("Digite a data de demissão (01/01/2001): ");
        String demissao = leia.nextLine();

        System.out.print("Digite o salario: ");
        float salario = leia.nextFloat();

        System.out.print("Digite o horário: ");
        String horario = leia.nextLine();

        funcionarios[indice] = new Funcionario(indice, nome, matricula, formatarData(admissao), formatarData(demissao), salario, horario);
        indice++;
    }

    public void listarTodos() {
        for (int i = 0; i < indice; i++) {
            System.out.println(funcionarios[i]);
        }
    }

    public void exibir() {
        System.out.print("Digite a matrícula do funcionário procurado: ");
        String matricula = leia.nextLine();

        int indiceMatricula = buscarIndice(matricula);
        if (indiceMatricula == -1) {
            System.out.println("Funcionário com matrícula [" + matricula + "] não encontrado!");
        } else {
            System.out.println(funcionarios[indiceMatricula]);
        }
    }

    public void excluir() {
        if (isEmpty()) {
            System.out.println(">> ERRO: NÃO HÁ FUNCIONÁRIOS! Adicione algum antes.");
            return;
        }

        System.out.print("Digite a matrícula do funcionário desejado: ");
        String matricula = leia.nextLine();

        int indiceMatricula = buscarIndice(matricula);
        if (indiceMatricula == -1) {
            System.out.println("Funcionário com matrícula [" + matricula + "] não encontrado!");
            return;
        }

        for (int i = indiceMatricula; i < indice - 1; i++) {
            funcionarios[i] = funcionarios[i + 1];
        }
        indice--;
    }

    public void atualizar() {
        if (isEmpty()) {
            System.out.println(">> ERRO: NÃO HÁ FUNCIONÁRIO! Adicione algum antes.");
            return;
        }

        System.out.print("Digite o matrícula do funcionário desejado: ");
        String matriculaProcurada = leia.nextLine();

        int indiceMatricula = buscarIndice(matriculaProcurada);
        if (indiceMatricula == -1) {
            System.out.println("Funcionário com matrícula [" + matriculaProcurada + "] não encontrado!");
            return;
        }

        System.out.print("(NOVO) Digite o nome: ");
        String nome = leia.nextLine();

        System.out.print("(NOVO) Digite o matricula: ");
        String matricula = leia.nextLine();

        System.out.print("(NOVO) Digite a data de admissão (01/01/2001): ");
        String admissao = leia.nextLine();

        System.out.print("(NOVO) Digite a data de demissão (01/01/2001): ");
        String demissao = leia.nextLine();

        System.out.print("(NOVO) Digite a salário: ");
        float salario = leia.nextFloat();

        System.out.print("(NOVO) Digite o horário: ");
        String horario = leia.nextLine();

        funcionarios[indiceMatricula].setNome(nome);
        funcionarios[indiceMatricula].setMatricula(matricula);
        funcionarios[indiceMatricula].setAdmissao(formatarData(admissao));
        funcionarios[indiceMatricula].setDemissao(formatarData(demissao));
        funcionarios[indiceMatricula].setSalario(salario);
        funcionarios[indiceMatricula].setHorario(horario);
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

            System.out.print("Escolha: ");
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

    private int buscarIndice(String matricula) {
        int indiceRa = -1;
        for (int i = 0; i < indice; i++) {
            if (funcionarios[i].getMatricula().equals(matricula)) {
                indiceRa = i;
                break;
            }
        }
        return indiceRa;
    }

    private LocalDate formatarData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatter);
    }

    private boolean isFull() {
        return indice == 50;
    }

    private boolean isEmpty() {
        return indice == 0;
    }
}
