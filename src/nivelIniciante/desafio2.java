package nivelIniciante;
import java.util.Scanner;

public class desafio2{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int ninjasCadastrados = 0;
        String[] ninjas = new String[1];


        while(opcao != 3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            while(true){
                if(sc.hasNextInt()){
                    int validarOpcao = sc.nextInt();
                    sc.nextLine();
                    if(validarOpcao >= 1 && validarOpcao <= 3){
                        opcao = validarOpcao;
                        break;
                    }
                }
                else{
                    sc.next();
                }
                System.out.print("Opção inválida. Digite novamente: ");
            }

            switch(opcao){
                case 1:
                    if(ninjasCadastrados == 1){
                        System.out.println("Você não pode cadastrar mais ninjas! Número máximo de ninjas atingido!");
                        break;
                    }
                    System.out.println("Digite o nome de um ninja");
                    ninjas[ninjasCadastrados] = sc.nextLine();
                    ninjasCadastrados++;
                    break;
                case 2:
                    if(ninjas[0] == null){
                        System.out.println("\nNão existem ninjas cadastrados!");
                        break;
                    }
                    for(int i = 0; i < ninjas.length;i++){
                        System.out.printf("Ninja %d = %s\n", i+1, ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu sair. Obrigado por usar o programa!");
                    break;

            }
        }
        sc.close();
    }
}