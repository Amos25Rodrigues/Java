package introducao;

public class Metodos {
    public static void main(String[] args){
        int a = 2; int b = 5; 
        int res = soma(11, 3);
        System.out.println("11 + 3 = " + res);
        multi(a,b);
    }

    static int soma(int a, int b){
        return(a+b);
    }

    static void multi(int a, int b){
        int res = a * b;

        System.out.println(a + " x " + b + " = " + res);
    }
}

