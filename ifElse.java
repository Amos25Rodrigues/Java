public class ifElse {

        public static void main(String[] args) {
                
        byte b = 10;
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 3.14159265359;
        char meuSexo = 'M';
        String str = "Amós";
        boolean bool = true ;

        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println();
    
        /*CONDICIONAIS*/
        if (bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (b < 99) {
            System.out.println("É menor que 99");
        }

        if (str == "Amós") {
            System.out.println("Amós");
        } else if (str == "Saymon") {
            System.out.println("Saymon");
        }
        
        if (meuSexo == 'M') {
            System.out.println("É Homem");
        } else if (meuSexo == 'F') {
            System.out.println("É Mulher");
        } else {
            System.out.println("Não Binário");
        }

    }
    
    
    
}
