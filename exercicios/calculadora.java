package exercicios;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = sc.nextInt();

        System.out.print("Digite mais um numero: ");
        double n2 = sc.nextInt();

        System.out.println("Qual operação deseja fazer? Ex; +,-,*,/");
        String operador = sc.nextLine();



        sc.close();
    }
}
