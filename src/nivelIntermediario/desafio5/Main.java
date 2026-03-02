package nivelIntermediario.desafio5;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int opcaoConta = -1;

        ContaPoupanca contaPoupanca = new ContaPoupanca(0);
        contaPoupanca.tipoConta = TipoConta.POUPANCA;
        ContaCorrente contaCorrente = new ContaCorrente(0);
        contaCorrente.tipoConta = TipoConta.CORRENTE;

        while(opcao != 0) {
            System.out.println("\n=== Bem-vindo ao Banco de Konoha! ===");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1. Depositar");
            System.out.println("2. Verificar saldo");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir entre contas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEm qual conta deseja fazer o depósito?");
                    System.out.println("1. " + contaCorrente.tipoConta);
                    System.out.println("2. " + contaPoupanca.tipoConta);
                    opcaoConta = sc.nextInt();
                    sc.nextLine();

                    while (true) {
                        if (opcaoConta == 1) {
                            System.out.print("Digite o valor a depositar na conta Corrente: R$ ");
                            double deposito = sc.nextDouble();
                            contaCorrente.depositar(deposito);
                            break;
                        } else if (opcaoConta == 2) {
                            System.out.print("Digite o valor a depositar na conta Poupança: R$ ");
                            double deposito = sc.nextDouble();
                            contaPoupanca.depositar(deposito);
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = sc.nextInt();
                            sc.nextLine();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha a conta que deseja consultar o saldo:");
                    System.out.println("1. " + contaCorrente.tipoConta);
                    System.out.println("2. " + contaPoupanca.tipoConta);
                    opcaoConta = sc.nextInt();
                    sc.nextLine();

                    while(true){
                        if(opcaoConta == 1){
                            System.out.println("Saldo atual da conta Corrente: R$ " + contaCorrente.saldo);
                        }
                        else if(opcaoConta == 2){
                            System.out.println("Saldo atual da conta Poupança: R$ " + contaPoupanca.saldo);
                        }
                        else{
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = sc.nextInt();
                            sc.nextLine();
                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.println("\nEscolha a conta para realizar o saque:");
                    System.out.println("1. " + contaCorrente.tipoConta);
                    System.out.println("2. " + contaPoupanca.tipoConta);
                    opcaoConta = sc.nextInt();
                    sc.nextLine();

                    while(true) {
                        if (opcaoConta == 1) {
                            System.out.print("Digite o valor a sacar da conta Corrente: R$ ");
                            double valorSaque = sc.nextDouble();
                            contaCorrente.sacar(valorSaque);
                        } else if (opcaoConta == 2) {
                            System.out.print("Digite o valor a sacar da conta Poupança: R$ ");
                            double valorSaque = sc.nextDouble();
                            contaPoupanca.sacar(valorSaque);
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = sc.nextInt();
                            sc.nextLine();
                        }
                        break;
                    }
                    break;

                case 4:
                    System.out.println("\nEscolha a conta para realizar a transferência:");
                    System.out.println("1. " + contaCorrente.tipoConta);
                    System.out.println("2. " + contaPoupanca.tipoConta);
                    opcaoConta = sc.nextInt();
                    sc.nextLine();

                    while(true) {
                        if (opcaoConta == 1) {
                            System.out.print("Digite o valor a transferir da conta Corrente: R$ ");
                            double valorTransferir = sc.nextDouble();
                            contaCorrente.transferenciaEntreContas(contaCorrente.tipoConta, valorTransferir, contaPoupanca, contaCorrente);
                        } else if (opcaoConta == 2) {
                            System.out.print("Digite o valor a transferir da conta Poupança: R$ ");
                            double valorTransferir = sc.nextDouble();
                            contaCorrente.transferenciaEntreContas(contaPoupanca.tipoConta, valorTransferir, contaPoupanca, contaCorrente);

                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = sc.nextInt();
                            sc.nextLine();
                        }
                        break;
                    }
                    break;
                case 0:
                    System.out.println("\nVocê escolheu sair do Banco. Obrigado por utilizar nossos serviços!");
                    System.out.println("Encerrando sessão...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite uma opção entre 0 e 3.");
                    break;
            }
        }

        System.out.println("\nSessão encerrada com sucesso. Até logo!");
        sc.close();
    }
}