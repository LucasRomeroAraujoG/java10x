package nivelIntermediario.desafio5;

public interface Conta {
    double ConsultarSaldo();

    abstract void depositar(double valor);
    abstract void sacar(double saque);
}
