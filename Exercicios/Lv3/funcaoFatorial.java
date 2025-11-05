package Exercicios.Lv3;
import java.util.Scanner;

public class funcaoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        

        sc.close();
    }

    public static int fatorial(int n){
        for (int i = n; i >= 1; i--) {
            n *= i;
            System.out.println(i);
            if (i > 1) System.out.println(" x ");
            }
        return 0;
    }
}
