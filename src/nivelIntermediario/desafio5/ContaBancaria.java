package nivelIntermediario.desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {

        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public double ConsultarSaldo() {
        return saldo;
    }

    public void transferenciaEntreContas(TipoConta tipoConta, double valorTransferencia, ContaPoupanca contaPoupanca, ContaCorrente contaCorrente){
        if(tipoConta.equals(TipoConta.POUPANCA)){
            contaPoupanca.saldo -= valorTransferencia;
            contaCorrente.saldo += valorTransferencia;

            System.out.println("Transferência efetuada com sucesso.");
        }
        else{
            contaPoupanca.saldo += valorTransferencia;
            contaCorrente.saldo -= valorTransferencia;

            System.out.println("Transferência efetuada com sucesso.");
        }
    }
}
