package exercicios.lv2;
import java.util.Scanner;

public class lerMaiorMenor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite: ");
            num[i] = sc.nextInt();
        }

        int M = num[0];
        int m = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > M) {
                M = num[i];
            }

        }        

        for (int i = 0; i < num.length; i++) {
            if (num[i] < m) {
                m = num[i];
            }
        }

        System.out.println("Maior número: " + M);
        System.out.println("Menor número: " + m);

        sc.close();
    }
}
