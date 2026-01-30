package exercicios.lv2;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {

            System.out.print("Digite um numero: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite outro um numero: ");
            double n2 = sc.nextDouble();

            sc.nextLine();        
            
            while (true) {             
            
                System.out.println("Qual operação deseja fazer? ( +  -  *  / )");
                String op = sc.nextLine();

                if (op.equals("+")){
                    System.out.println(n1 + " " + op + " " + n2 + " = " + (n1 + n2));
                    break;
                } else if (op.equals("-")) {
                    System.out.println(n1 + " " + op + " " + n2 + " = " + (n1 - n2));
                    break;
                } else if (op.equals("*")){
                    System.out.println(n1 + " " + op + " " + n2 + " = " + (n1 * n2));
                    break;
                } else if (op.equals("/")){
                    System.out.println(n1 + " " + op + " " + n2 + " = " + (n1 / n2));
                    break;
                } else {
                    System.out.print("Operador inválido! Deseja retornar? (s/n)> ");
                    String retornar = sc.nextLine();
                    if (retornar.equalsIgnoreCase("n")){
                        break;
                    }                    
                }

            }

            System.out.print("Deseja refazer? (s/n)> ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")){
                break;
            }
        }

        sc.close();

    }
}
