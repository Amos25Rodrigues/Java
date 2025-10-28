package Exercicios.Lv1;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("digite um numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos dois numeros é: " + soma);

        sc.close();
    }
}
