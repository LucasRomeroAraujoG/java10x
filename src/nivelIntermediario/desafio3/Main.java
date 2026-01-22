package nivelIntermediario.desafio3;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int ninjasCadastrados = 0;
        int uchihasCadastrados = 0;
        int quantidadeMaximaDeNinjas = 10;

        Ninja[] ninjas = new Ninja[quantidadeMaximaDeNinjas];
        Uchiha[] uchihas = new Uchiha[quantidadeMaximaDeNinjas];

        while (opcao != 0) {

            System.out.println("\nCadastro de Ninjas");
            System.out.println("1 - Cadastrar ninja");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Mostrar informações");
            System.out.println("4 - Cadastrar habilidade especial (Uchiha)");
            System.out.println("5 - Atualizar habilidade especial (Uchiha)");
            System.out.println("6 - Mostrar habilidades especiais (Uchiha)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            while (true) {
                if (sc.hasNextInt()) {
                    int validarOpcao = sc.nextInt();
                    sc.nextLine();
                    if (validarOpcao >= 0 && validarOpcao <= 6) {
                        opcao = validarOpcao;
                        break;
                    }
                } else {
                    sc.next();
                }
                System.out.print("Opção inválida. Digite novamente: ");
            }

            switch (opcao) {

                case 1:
                    if (ninjasCadastrados + uchihasCadastrados == quantidadeMaximaDeNinjas) {
                        System.out.println("Limite de cadastro atingido.");
                        break;
                    }

                    System.out.println("\nTipo de ninja:");
                    System.out.println("1 - Ninja comum");
                    System.out.println("2 - Uchiha");
                    System.out.print("Escolha: ");
                    int opcaoNinja = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeDoNinja = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeDoNinja = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Missão atual: ");
                    String missaoAtual = sc.nextLine();

                    System.out.print("Nível da missão: ");
                    String nivelDiffMissao = sc.nextLine();

                    System.out.print("Status da missão: ");
                    String statusMissao = sc.nextLine();

                    if (opcaoNinja == 2) {
                        uchihas[uchihasCadastrados] =
                                new Uchiha(nomeDoNinja, idadeDoNinja, missaoAtual, nivelDiffMissao, statusMissao);
                        uchihasCadastrados++;
                        System.out.println("Uchiha cadastrado com sucesso.");
                    } else {
                        ninjas[ninjasCadastrados] =
                                new Ninja(nomeDoNinja, idadeDoNinja, missaoAtual, nivelDiffMissao, statusMissao);
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    }
                    break;

                case 2:
                    System.out.println("\nNinjas cadastrados:");
                    if (ninjas[0] == null) {
                        System.out.println("Nenhum ninja comum cadastrado.");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null) break;
                            System.out.println(i + " - " + ninjas[i].nome);
                        }
                    }

                    System.out.println("\nUchihas cadastrados:");
                    if (uchihas[0] == null) {
                        System.out.println("Nenhum Uchiha cadastrado.");
                    } else {
                        for (int i = 0; i < uchihas.length; i++) {
                            if (uchihas[i] == null) break;
                            System.out.println(i + " - " + uchihas[i].nome);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nInformações dos ninjas:");

                    if (ninjas[0] == null) {
                        System.out.println("Nenhum ninja comum cadastrado.");
                    } else {
                        System.out.println("Ninjas comuns:");
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null) break;
                            ninjas[i].mostrarInformacoes();
                            System.out.println();
                        }
                    }

                    if (uchihas[0] == null) {
                        System.out.println("Nenhum Uchiha cadastrado.");
                    } else {
                        System.out.println("Uchihas:");
                        for (int i = 0; i < uchihas.length; i++) {
                            if (uchihas[i] == null) break;
                            uchihas[i].mostrarInformacoes();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    if (uchihas[0] == null) {
                        System.out.println("Nenhum Uchiha cadastrado.");
                    } else {
                        System.out.println("Escolha o Uchiha para cadastrar a habilidade especial:");
                        for (int i = 0; i < uchihas.length; i++) {
                            if (uchihas[i] == null) break;
                            System.out.println(i + " - " + uchihas[i].nome);
                        }
                        System.out.print("Opção: ");
                        int escolhaNinja = sc.nextInt();
                        sc.nextLine();

                        if (uchihas[escolhaNinja].habilidadeEspecial != null) {
                            System.out.println("Este Uchiha já possui habilidade especial.");
                            break;
                        }

                        System.out.print("Habilidade especial: ");
                        String habilidadeEspecial = sc.nextLine();
                        uchihas[escolhaNinja].cadastrarHabilidadeEspecial(habilidadeEspecial);
                        System.out.println("Habilidade especial cadastrada.");
                    }
                    break;

                case 5:
                    if (uchihas[0] == null) {
                        System.out.println("Nenhum Uchiha cadastrado.");
                    } else {
                        System.out.println("Escolha o Uchiha para atualizar a habilidade especial:");
                        for (int i = 0; i < uchihas.length; i++) {
                            if (uchihas[i] == null) break;
                            System.out.println(i + " - " + uchihas[i].nome);
                        }
                        System.out.print("Opção: ");
                        int opcaoAtualizar = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nova habilidade especial: ");
                        String novaHabilidadeEspecial = sc.nextLine();
                        uchihas[opcaoAtualizar].cadastrarHabilidadeEspecial(novaHabilidadeEspecial);
                        System.out.println("Habilidade especial atualizada.");
                    }
                    break;

                case 6:
                    if (uchihas[0] == null) {
                        System.out.println("Nenhum Uchiha cadastrado.");
                    } else {
                        System.out.println("Escolha o Uchiha para visualizar a habilidade especial:");
                        for (int i = 0; i < uchihas.length; i++) {
                            if (uchihas[i] == null) break;
                            System.out.println(i + " - " + uchihas[i].nome);
                        }
                        System.out.print("Opção: ");
                        int opcaoMostrar = sc.nextInt();
                        sc.nextLine();
                        uchihas[opcaoMostrar].mostrarHabilidadeEspecial();
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa.");
                    if (ninjasCadastrados + uchihasCadastrados == 0) {
                        System.out.println("Nenhum ninja foi cadastrado.");
                    } else {
                        System.out.println("Total de ninjas cadastrados: " + (ninjasCadastrados + uchihasCadastrados));
                    }
                    break;
            }
        }
        sc.close();
    }
}
