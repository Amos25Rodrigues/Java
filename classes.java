public class classes {
    public static void main(String[] args){
        System.out.println("Hello World");
        Carro meuCarro = new Carro("Corolla");
        Carro meuCarro2 = new Carro("Civic");
        Carro meuCarro3 = new Carro("Fastback");
    }

}

class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro  " + this.modelo);
    }
}