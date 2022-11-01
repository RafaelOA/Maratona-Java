package academy.devdojo.maratonajava.introducao;

import com.sankhya.util.SOAPUtils;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //tipos primitivos -- guardam em memoria um valor simples -- int, double, char, float, byte, boolean, long, short
        int age = 10;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        long numeroGrande = 1000000;
        byte idadeByte = 10;
        short idadeShort = 15;
        char nomeChar = 87;
        boolean verdadeiro = true;
        boolean falso = false;


        String nome = "textão da porra, meu";

        System.out.println(verdadeiro);
        System.out.println(nomeChar);
        System.out.println(nome);
        System.out.println("A idade é: "+age+" anos");
    }
}
