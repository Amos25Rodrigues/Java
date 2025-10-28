package Exercicios.Lv1;
import java.util.Scanner;

public class paresEImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
        }
        sc.close();
    }
    
}
