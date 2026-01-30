package exercicios.lv1;
import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        } else {
            System.out.println("Os dois numeros são iguais");
        }

        sc.close();
    }
}
