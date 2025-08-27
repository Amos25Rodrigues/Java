public class classes {
    public static void main(String[] args){
        System.out.println("Hello World");
        Carro meuCarro = new Carro("Corolla");
        Carro meuCarro1 = new Carro("Civic");
        Carro meuCarro2 = new Carro("Fastback");

        String result = meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();

        System.out.println(result);
    }

}

class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String acelerar(){
            System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }
}