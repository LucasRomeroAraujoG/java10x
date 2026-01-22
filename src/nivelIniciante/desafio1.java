package nivelIniciante;

public class desafio1 {
    public static void main(String[] args) {

        // ================= NINJA 1 =================
        String nomeN1 = "Naruto Uzumaki";
        int idadeN1 = 16;
        String missaoN1 = "Proteger a vila";
        char dificuldadeMissaoN1 = 'A';
        String nomeDaMissaoN1 = "Defesa de Konoha";
        String statusDaMissaoN1;

        System.out.println("============= NINJA 1 =============");
        System.out.println("Nome do Ninja: " + nomeN1);
        System.out.println("Idade do Ninja: " + idadeN1);
        System.out.println("Nome da missão: " + nomeDaMissaoN1);
        System.out.println("Missão: " + missaoN1);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoN1);

        if (idadeN1 < 15 && dificuldadeMissaoN1 != 'C' && dificuldadeMissaoN1 != 'D') {
            statusDaMissaoN1 = "Não concluída";
        } else {
            statusDaMissaoN1 = "Concluída";
        }

        System.out.println("Status da missão: " + statusDaMissaoN1);


        // ================= NINJA 2 =================
        String nomeN2 = "Sasuke Uchiha";
        int idadeN2 = 17;
        String missaoN2 = "Eliminar ameaça inimiga";
        char dificuldadeMissaoN2 = 'S';
        String nomeDaMissaoN2 = "Caçada ao Akatsuki";
        String statusDaMissaoN2;

        System.out.println("\n============= NINJA 2 =============");
        System.out.println("Nome do Ninja: " + nomeN2);
        System.out.println("Idade do Ninja: " + idadeN2);
        System.out.println("Nome da missão: " + nomeDaMissaoN2);
        System.out.println("Missão: " + missaoN2);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoN2);

        if (idadeN2 < 15 && dificuldadeMissaoN2 != 'C' && dificuldadeMissaoN2 != 'D') {
            statusDaMissaoN2 = "Não concluída";
        } else {
            statusDaMissaoN2 = "Concluída";
        }

        System.out.println("Status da missão: " + statusDaMissaoN2);


        // ================= NINJA 3 =================
        String nomeN3 = "Sakura Haruno";
        int idadeN3 = 14;
        String missaoN3 = "Resgate e suporte médico";
        char dificuldadeMissaoN3 = 'B';
        String nomeDaMissaoN3 = "Resgate na Fronteira";
        String statusDaMissaoN3;

        System.out.println("\n============= NINJA 3 =============");
        System.out.println("Nome do Ninja: " + nomeN3);
        System.out.println("Idade do Ninja: " + idadeN3);
        System.out.println("Nome da missão: " + nomeDaMissaoN3);
        System.out.println("Missão: " + missaoN3);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoN3);

        if (idadeN3 < 15 && dificuldadeMissaoN3 != 'C' && dificuldadeMissaoN3 != 'D') {
            statusDaMissaoN3 = "Não concluída";
        } else {
            statusDaMissaoN3 = "Concluída";
        }

        System.out.println("Status da missão: " + statusDaMissaoN3);
    }
}