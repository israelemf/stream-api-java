package practice.challenges;

import practice.GerarListaInt;

import java.util.Arrays;
import java.util.List;

public class NumerosIguais {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        boolean numerosIguais = numeros.stream().distinct().count() == 1;

        System.out.println("Lista de números: " + numeros);

        System.out.println(numerosIguais ? "Os números da lista são iguais" : "Os números da lista não são iguais");


    }
}
