package introducao;

public class Interface {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    static String realizarTransferencia(ContaBancaria conta, String metodo) {
        return conta.transferencia(metodo);
}

interface ContaBancaria {

    double getSaldo();

    String transferencia(String metodo);

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
    public String transferencia(String metodo) {
        return metodo;
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
    public String transferencia(String metodo) {
        return metodo;
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
    
    public static void transferir(double valor) {
        System.out.println("Transferência via Pix no valor de: R$" + valor);
    }
}

class TransferenciaTED {
    
    public static void transferir(double valor) {
        System.out.println("Transferência via TED no valor de: R$" + valor);
    }
}

class TransferenciaBoleto {
    
    public static void transferir(double valor) {
        System.out.println("Transferência via Boleto no valor de: R$" + valor);
    }
}

}