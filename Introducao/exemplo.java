package introducao;
public class Exemplo {
    int cont = 1;

    public void metodo(){
        while (cont < 11){
            System.out.println(cont);
            cont++;
        }
    }

    public static void main(String[] args) {
        Exemplo e = new Exemplo();
        e.metodo();
    }
}