package introducao;
import java.util.ArrayList;

public class Vetores {
    public static void main(String[] args) {
        
        /*VETORES (OU ARRAYS)*/
        int[] colecaoDeInteiros = {0, 1, 2, 3, 4, 5};
            System.out.println(colecaoDeInteiros[5]);
        int[] meusNumeros = new int[10];
        meusNumeros[0] = 10;
        meusNumeros[1] = 20;
        meusNumeros[2] = 30;
        meusNumeros[3] = 40;
        meusNumeros[4] = 50;
        meusNumeros[5] = 60;
        meusNumeros[6] = 70;
        meusNumeros[7] = 80;
        meusNumeros[8] = 90;
        meusNumeros[9] = 10;
            System.out.println(meusNumeros[0]);

        /*ARRAYLIST (ARRAY DINAMICO SEM LIMITE DE ADICIONAR ELEMENTOS)*/
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Amós");
        nomes.add("Saymon");
        nomes.add("Joelma");
        nomes.add("Lucas");
        nomes.add("Milson");

        System.out.println(nomes.get(4));

        nomes.remove("Amós");
        nomes.remove(3);
        
        /*ARRAYLIST DE VARIOS TIPOS*/
        ArrayList<Object> misturado = new ArrayList<>();

        misturado.add(10);            // int -> autoboxed para Integer
        misturado.add(3.14);          // double -> Double
        misturado.add('A');           // char -> Character
        misturado.add(true);          // boolean -> Boolean
        misturado.add("Texto");       // String

        System.out.println(misturado.get(4));

        /*
        ⚠️ Cuidados com ArrayList<Object>:
        Você perde a tipagem forte, ou seja, tem que fazer casting se quiser usar os valores com seus tipos originais depois.

        Pode causar erros de tempo de execução se não tomar cuidado.
        */
                
        //Se você sabe exatamente os campos que precisa (por exemplo: um número, uma letra, e uma frase), crie uma classe personalizada:

        Dados d1 = new Dados(10, 'A', "Exemplo 1");
        Dados d2 = new Dados(10, 'B', "Exemplo 2");

        System.out.println(d1);
        System.out.println(d2);
    }

    //CRIANDO UMA CLASSE PERSONALIZADA
    public static class Dados {
        int numero;
        char letra;
        String texto;

        public Dados(int numero, char letra, String texto) {
            this.numero = numero;
            this.letra = letra;
            this.texto = texto;
            
        }

        @Override
        public String toString() {
            return "Número: " + numero + ", Letra: " + letra + ", Texto: " + texto;
        }

    }
}
