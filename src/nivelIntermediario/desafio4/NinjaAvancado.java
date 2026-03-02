package nivelIntermediario.desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;
    TipoHabilidade especialidade; //Habilidade especial do ninja

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou um Ninja Avançado, irei executar a minha especialidade: " + especialidade);
    }

}
