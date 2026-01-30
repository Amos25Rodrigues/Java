package introducao;

public class Heranca {

    public static void main(String[] args) {

        Animal spote = new Cachorro("Spote", 9, 7.0, "RSD");
        Animal apollo = new Gato("Apollo", 5, 4.5, "Cianês");
        
        apollo.emitirSom();
        spote.emitirSom();

        spote.mover();
        apollo.dormir();
    }
}

class Animal {

    protected String especie;
    protected String nome;
    protected int i;
    protected double p;
    protected String som;
    
    Animal(String nome, int idade, double peso) {
        this.nome = nome;
        i = idade;
        p = peso;

    }

    void dormir() {
        System.out.println(nome + " está dormindo");
    }

    void mover() {
        System.out.println(nome + " está andando");
    }

    void emitirSom(){
        System.out.println(nome + " está " + som);
    }

}

class Cachorro extends Animal {

    public String raca;

    Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        som = "Latindo!";
        especie = "Cachorro";
        this.raca = raca;
    }
    
}

class Gato extends Animal {

    public String corPelagem;
    
    Gato(String nome, int idade, double peso, String corPelagem) {
        super(nome, idade, peso);
        som = "Miando!";
        especie = "Gato";
        this.corPelagem = corPelagem;
    }

}
