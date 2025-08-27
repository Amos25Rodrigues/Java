package exercicios;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("------Tabuada------\n-Digite um numero-\n-------------------\n-> ");
        int n1 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n1 + " = " + (i * n1));
        }
    }
}
