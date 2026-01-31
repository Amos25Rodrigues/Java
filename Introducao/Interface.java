package introducao;

public class Interface {
    public static void main(String[] args) {
        ContaBancaria contaPoupanca = new ContaPoupanca();
        ContaBancaria contaCorrente = new ContaCorrente();
        contaPoupanca.depositar(1000);
        contaCorrente.depositar(500);

        contaPoupanca.transferencia(contaCorrente, Transferencia.transferirPix(200));

        //Aqui é a sacada da interface, posso usar o mesmo método de printar para diferentes tipos de conta
        print(contaPoupanca);
        print(contaCorrente);    

    }
    //método que recebe a interface como parâmetro e pode receber qualquer implementação dela como argumento
    static void print(ContaBancaria conta) {
        System.out.println("Saldo " + conta.toString() + ": R$ " + conta.getSaldo());
    }


}

interface ContaBancaria {

    double getSaldo();

    double transferencia(ContaBancaria conta, double valor);

    void depositar(double saldo);

    void sacar(double saldo);

}

class ContaPoupanca implements ContaBancaria {
    private double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double transferencia(ContaBancaria conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
        return valor;
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }
}

class ContaCorrente implements ContaBancaria {
    private double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double transferencia(ContaBancaria conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
        return valor;
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }
}



class Transferencia {
    
    public static double transferirPix(double valor) {
        System.out.println("Transferência via Pix no valor de: R$" + valor);
        return valor;
    }

    public static double transferirTED(double valor) {
        System.out.println("Transferência via TED no valor de: R$" + valor);
        return valor;
    }

    public static double transferirBoleto(double valor) {
        System.out.println("Transferência via Boleto no valor de: R$" + valor);
        return valor;
    }
}
