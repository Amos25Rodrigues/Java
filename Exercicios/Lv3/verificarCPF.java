package Exercicios.Lv3;
import java.util.Scanner;

public class verificarCPF {

    public static boolean ValidadeCPF(String cpf) {
        String d = cpf;

         try {
            int[] nums = new int[11];
            for (int i = 0; i < 11; i++) nums[i] = Character.getNumericValue(d.charAt(i));

            
            return false;
         } catch (Exception e) {
            return false;
         }         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um CPF (apenas numeros): ");
        String cpf = sc.nextLine();
        
        

        sc.close();
    }

}
