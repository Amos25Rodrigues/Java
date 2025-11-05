package Exercicios.Lv3;
import java.util.Scanner;

public class funcaoSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite um numero: ");
        int n2 = sc.nextInt();

        System.out.print(soma(n1,n2));

        sc.close();
    }

    public static int soma(int a, int b){
        return a + b;
    }
}
