package nivelIntermediario.desafio4;

public class Main {
    static void main(String[] args) {
        NinjaBasico Izumo = new NinjaBasico();
        Izumo.nome = "Izumo Kamizuki";
        Izumo.mostrarInformacoes();
        Izumo.executarHabilidade();
        System.out.println();

        NinjaAvancado Sasuke = new NinjaAvancado();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.habilidade = TipoHabilidade.Katon;
        Sasuke.especialidade = TipoHabilidade.Genjutsu;
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();
        System.out.println();

        NinjaAvancado MightGuy = new NinjaAvancado();
        MightGuy.nome = "MightGuy";
        MightGuy.idade = 31;
        MightGuy.habilidade = TipoHabilidade.Taijutsu;
        MightGuy.especialidade = TipoHabilidade.Taijutsu;
        MightGuy.mostrarInformacoes();
        MightGuy.executarHabilidade();
        System.out.println();

        NinjaAvancado Naruto = new NinjaAvancado();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.habilidade = TipoHabilidade.Rasengan;
        Naruto.especialidade = TipoHabilidade.Ninjutsu;
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
        System.out.println();

        NinjaAvancado Pain = new NinjaAvancado();
        Pain.nome = "Pain";
        Pain.idade = 35;
        Pain.habilidade = TipoHabilidade.Rinnegan;
        Pain.especialidade = TipoHabilidade.Rinnegan;
        Pain.mostrarInformacoes();
        Pain.executarHabilidade();
        System.out.println();

    }
}
