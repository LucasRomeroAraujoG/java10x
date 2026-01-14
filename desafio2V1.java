import java.util.Scanner;

public class desafio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int escolhaMenu;
        boolean menu = true;
        String[] ninjas = null;

        while (menu) {
            // Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            // Fim do Menu

            while(!sc.hasNextInt()){
                System.out.print("Opção inválida! Digite uma opção válida: ");
                sc.next();
            }
            escolhaMenu = sc.nextInt();
            sc.nextLine();

            while (escolhaMenu < 1 || escolhaMenu > 3) {
                System.out.print("Opção inválida. Digite uma opção válida: ");
                while(!sc.hasNextInt()){
                    System.out.print("Opção inválida! Digite uma opção válida: ");
                    sc.next();
                }
                escolhaMenu = sc.nextInt();
                sc.nextLine();
            }

            // Verificando a quantidade de ninjas que o Array irá criar.
            if (escolhaMenu == 1) {
                System.out.println("\n================");
                System.out.print("Digite a quantidade de ninjas que deseja cadastrar: ");

                // Primeiro valida se é inteiro
                while (!sc.hasNextInt()) {
                    System.out.print("Entrada inválida. Digite um número inteiro: ");
                    sc.next(); // descarta a entrada inválida
                }

                int quantidadeDeNinjas = sc.nextInt(); // Assume o numero inteiro validado anteriormente
                sc.nextLine(); // limpa o ENTER

                // Verifica se o numero em qtdDeNinjas é negativo
                while (quantidadeDeNinjas < 0) {
                    System.out.print("Quantidade não pode ser negativa. Digite novamente: ");

                    // valida tipo novamente
                    while (!sc.hasNextInt()) {
                        System.out.print("Entrada inválida. Digite um número inteiro: ");
                        sc.next(); // descarta a entrada inválida
                    }

                    quantidadeDeNinjas = sc.nextInt();
                    sc.nextLine(); // limpa ENTER
                }
                ninjas = new String[quantidadeDeNinjas];
            }

            switch (escolhaMenu) {
                case 1:
                    System.out.println("\n================");
                    System.out.println("Agora, digite o nome abaixo dos ninjas conforme o mencionado: ");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.printf("Nome do ninja na posição [%d]: ", i);
                        ninjas[i] = sc.nextLine();
                    }
                    System.out.println("\n================");
                    break;

                case 2:
                    // Listar Ninjas
                    if (ninjas == null) {
                        System.out.println("\n================");
                        System.out.println("Não existem ninjas cadastrados.");
                        System.out.println("================\n");
                        break;
                    }
                    System.out.println("\n================");
                    System.out.println("Você escolheu listar os ninjas cadastrados, segue a lista abaixo: ");
                    for (int pos = 0; pos < ninjas.length; pos++) {
                        System.out.printf("Segue o nome do ninja na posição [%d]: %s", pos, ninjas[pos]);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n================");
                    System.out.println("Você escolheu sair! Obrigado!");
                    menu = false;
                    break;
            }
        }

        sc.close();
    }
}
