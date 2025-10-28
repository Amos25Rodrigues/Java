package Introdução;
public class casting {
    public static void main(String[] args) {

        //casting explicito
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        //casting implicito
        int meuInt = 10;
        double meuDoble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);

        System.out.println(minhaString);
        System.out.println(meuDoble);
        System.out.println(resultadoInt);
    }
}
