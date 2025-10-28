package Introdução;
public class exemplo {
    int cont = 1;

    public void metodo(){
        while (cont < 11){
            System.out.println(cont);
            cont++;
        }
    }

    public static void main(String[] args) {
        exemplo e = new exemplo();
        e.metodo();
    }
}