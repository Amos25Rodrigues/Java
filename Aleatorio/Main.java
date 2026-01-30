package Aleatorio;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("--------------------------------\nSeu nome: ");
        p.setNome(sc.nextLine());
        //System.out.println("Seu nome é " + p.getNome() + "!");

        System.out.print("Seu email: ");
        p.setEmail(sc.nextLine());

        System.out.print("Seu telefone: ");
        p.setTelefone(sc.nextLine());

        //System.out.println("--------------------------------\nSeu nome: " + p.getNome() + "\nSeu email: " + p.getEmail() + "\nSeu telefone: " + p.getTelefone() + "\n--------------------------------");

        sc.close();
    }

}