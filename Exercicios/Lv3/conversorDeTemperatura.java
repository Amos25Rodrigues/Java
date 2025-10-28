package Exercicios.Lv3;
import java.util.Scanner;

public class conversorDeTemperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Insira um valor: ");
            double n1 = sc.nextDouble();

            while (true) { 
                System.out.print("Selecione 1 se quer Celsius -> Fahrenheit\nSelecione 2 se quer Fahrenheit -> Celsius\n-----------------------------------------\n> ");
                int op = sc.nextInt();

                sc.nextLine();
                           
                if (op == 1){
                    conversorCelsiusFahrenheit(n1);
                    break;
                } else if (op == 2){
                    conversorFahrenheitCelsius(n1);
                    break;
                } else {
                    System.out.println("Opção incorreta!");             
                }
            }

            System.out.println("Reiniciar conversor? (s/n)");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")){
                break;
            } 
            
        }
        sc.close();
    }

    public static void conversorCelsiusFahrenheit(double n1) {
        double resultado = n1 * 9/5 + 32;
        System.out.printf("%.2f °C = %.2f °F\n", n1, resultado);
    }

        public static void conversorFahrenheitCelsius(double n1) {
        double resultado = (n1 - 32) * 5/9;
        System.out.printf("%.2f °F = %.2f °C\n", n1, resultado);
    }
}
