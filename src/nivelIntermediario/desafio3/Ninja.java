package nivelIntermediario.desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome:                " + nome);
        System.out.println("Idade:               " + idade);
        System.out.println("Missão atual:        " + missao);
        System.out.println("Nível da missão:     " + nivelDificuldade);
        System.out.println("Status da missão:    " + statusMissao);
    }
}
