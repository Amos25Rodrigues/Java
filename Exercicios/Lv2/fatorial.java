package Exercicios.Lv2;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Forma que eu fiz
        System.out.print("Digite o numero que deseja ver o fatorial: ");;
        int n = sc.nextInt();
        int[] fat = new int[n];
        int n1 = n;
        
        for (int i = 0; i < n ; i++) {
            fat[i] = n1;
            n1--;
        }

        System.out.println("O Resultado de " + n + "! é:");

        for (int i = 0; i < n; i++) {
            System.out.print(fat[i]);
            if (i != n - 1) {
                System.out.print(" x ");
            } 
        }

        System.out.print(" = ");

        int res = 1;

        for (int i = 0; i < n; i++) {
            res *= fat[i];
        }

        System.out.println(res);

        // Forma simplificada
        /*System.out.print("Digite o número que deseja ver o fatorial: ");
        int n = sc.nextInt();

        int res = 1;
        System.out.print("O resultado de " + n + "! = ");

        for (int i = n; i >= 1; i--) {
            res *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }

        System.out.println(" = " + res);
        */

        sc.close();
    }    
}
