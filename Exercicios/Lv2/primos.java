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
            for (int j = 2; j < Math.sqrt(n); j++) { /*Esse Math.sqrt é uma função da classe math no 
            java que retorna a raiz quadrada de um numero, 
            só é preciso testar divisores até a raiz quadrada do número.*/
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

        for (int p : primos) System.out.println(p);/*for-each (ou enhanced for) é uma forma mais simples de percorrer listas e arrays em Java. o Java entende que p vai receber cada elemento da lista primos, um por um, sem precisar lidar com índices (i).*/

        sc.close();
    }
}
