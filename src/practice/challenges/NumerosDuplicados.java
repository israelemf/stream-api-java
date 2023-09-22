package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class NumerosDuplicados {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        long countListaOriginal = numeros.size();
        long countListaDistinta = numeros.stream().distinct().count();

        System.out.println("Lista de números: " + numeros);

        System.out.println(countListaOriginal != countListaDistinta ? "Os números da lista não são distintos" : "Os números da lista são distintos");
    }
}
