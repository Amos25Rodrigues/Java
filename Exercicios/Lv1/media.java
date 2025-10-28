package Exercicios.Lv1;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = sc.nextInt();
        System.out.print("Nota 2: ");
        float n2 = sc.nextInt();
        System.out.print("Nota 3: ");
        float n3 = sc.nextInt();
        
        float res = (n1 + n2 + n3) / 3;

        System.out.println("Média: " + res);
        
        sc.close();
    }
}
