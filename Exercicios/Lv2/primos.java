package Exercicios.Lv2;
import java.util.ArrayList;
import java.util.Scanner;

public class primos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> primos = new ArrayList<>();

        for (int n = 2; n < 100; n++) {
            boolean ehPrimo = true;
            //Confere se o numero é primo ou não
            for (int j = 2; j < Math.sqrt(n); j++) { //Esse Math.
                if (n % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            //Se for numero primo, ele add na arraylist
            if (ehPrimo) {
                primos.add(n);
            }
        }

        for (int i = 0; i < primos.size(); i++) {
            System.out.println(primos.get(i));
        }

        sc.close();
    }
}
