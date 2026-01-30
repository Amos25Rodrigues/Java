package introducao;
import java.util.ArrayList; 

public class Loops {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Amós");
        nomes.add("Ranna");
        nomes.add("Milson");
        nomes.add("Joelma");
        nomes.add("Saymon");
        nomes.add("Lucas");
        
        //LOOPS - Laços de Repetição(For, While ou Para)
        
        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        int cont = 1;
        while(cont < 11 ){
            System.out.println("Estou no while " + cont);
            cont++;
        }

    }
}
