package Exercicios.Lv3;
import java.util.Scanner;

public class funcaoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.print(fatorial(n));

        sc.close();
    }

    public static int fatorial(int n){
        int res = 1;
        for (int i = n; i >= 1; i--) {
            res *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
        }
        return res;
    }
}
