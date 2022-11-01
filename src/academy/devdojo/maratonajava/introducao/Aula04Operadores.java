package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero02+numero01);

        //&& é o and
        // || é o or
        // ! é o not


        int idade = 35;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario > 3381;


        System.out.println("isDentrodaLeiMaiorQueTrinta " + isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta " + isDentrodaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float  valorPlaystation = 5000F;


        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel = " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 3;
        System.out.println(bonus);

        //iterator
        int contador = 0;
        contador += 1; //contador = contador+1
        contador ++; //contador = contador+1
        contador --; //contador = contador-1
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2);
        System.out.println(++contador2);

    }

}


