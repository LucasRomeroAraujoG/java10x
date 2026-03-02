package nivelIntermediario.desafio5;

public class ContaCorrente extends ContaBancaria {

    ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito precisa ser maior que zero. Tente novamente.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
        }
    }

    public void sacar(double saque) {
        if (saque <= 0) {
            System.out.println("O valor do saque precisa ser maior que zero. Tente novamente.");
        } else if (saldo < saque) {
            System.out.println("Saldo insuficiente para realizar o saque. Saldo atual: R$ " + saldo);
        } else {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
        }
    }
}