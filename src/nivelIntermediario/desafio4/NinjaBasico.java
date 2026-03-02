package nivelIntermediario.desafio4;

public class NinjaBasico implements Ninja{
    String nome;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: "+ nome);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Eu sou um ninja básico e este é meu ataque base.");
    }
}
