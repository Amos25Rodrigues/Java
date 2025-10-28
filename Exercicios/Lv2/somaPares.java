package Exercicios.Lv2;

public class somaPares {
    public static void main(String[] args) {
        int cont = 1;
        int indice = 0;
        int[] pares = new int[25]; 

        while (cont <= 50) {
            if (cont % 2 == 0) {
                pares[indice] = cont;
                indice++;
            }
            cont++;
        }

        int soma = 0;

        for (int i = 0; i < pares.length; i++) {
            soma += pares[i] ;
        }

        System.out.println("A soma de todos os pares = " + soma);

    }
}
