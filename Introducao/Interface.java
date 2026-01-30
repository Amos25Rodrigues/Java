package introducao;

public class Interface {
    public static void main(String[] args) {
        ContaBancaria contaPoupanca = new ContaPoupanca();
        ContaBancaria contaCorrente = new ContaCorrente();

        contaPoupanca.depositar(500.0);
        System.out.println("Saldo Conta Poupança: R$" + contaPoupanca.getSaldo());
        
        contaPoupanca.transferencia(TransferenciaPix.transferir(100.0));

        System.out.println("Saldo Conta Poupança após transferência Pix: R$" + contaPoupanca.getSaldo());

    }

    public static void print(ContaBancaria conta) {
        System.out.println("Saldo: R$" + conta.getSaldo());
        
    }
}

interface ContaBancaria {

    double getSaldo();

    double transferencia(double valor);

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
    public double transferencia(double valor) {
        this.saldo -= valor;
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
    public double transferencia(double valor) {
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

class TransferenciaPix {
    
    public static double transferir(double valor) {
        System.out.println("Transferência via Pix no valor de: R$" + valor);
        return valor;
    }
}

class TransferenciaTED {
    
    public static double transferir(double valor) {
        System.out.println("Transferência via TED no valor de: R$" + valor);
        return valor;
    }
}

class TransferenciaBoleto {
    
    public static double transferir(double valor) {
        System.out.println("Transferência via Boleto no valor de: R$" + valor);
        return valor;
    }
}