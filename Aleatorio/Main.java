package aleatorio;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String resposta;
        while (true) {
            System.out.print("Deseja criar um usuário? (s/n): ");
            resposta = sc.nextLine();

            if (resposta.equals("s")) {
                System.out.println("Criando usuário...");
            } else if (resposta.equals("n")) {
                System.out.println("Operação cancelada.");
                break;
            } else {
                System.out.println("Resposta inválida.");
            }

            sc.close();
        }
        
    }

}