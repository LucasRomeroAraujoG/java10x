package nivelIntermediario.desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    public void mostrarHabilidadeEspecial() {
        if (habilidadeEspecial == null) {
            System.out.println("Habilidade especial:  Não cadastrada");
        } else {
            System.out.println("Habilidade especial:  " + habilidadeEspecial);
        }
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }

    public void cadastrarHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
