package exercicios.lv2;
import java.util.Scanner;

public class inversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            if (i == 0) {
                System.out.print("Digite um nome: ");
                nomes[i] = sc.nextLine();
            } else {
                System.out.print("Digite mais um nome: ");
                nomes[i] = sc.nextLine();
            }
        }

        for (int i = nomes.length - 1 ; i >= 0 ; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
