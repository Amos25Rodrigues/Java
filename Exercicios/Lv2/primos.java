package Exercicios.Lv2;
import java.util.ArrayList;
import java.util.Scanner;

public class primos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> primos = new ArrayList<>();

        for (int n = 0; n < 100; n++) {
            for (int j = 2; j <= (n-1); j++) {
                if (n <= 1) {
                    break;
                } else if (n % j == 0) {
                    break;
                } else {
                    
                }
            }
        }

        sc.close();
    }
}
