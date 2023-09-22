package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class SomaElementos {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        int somaLista = numeros.stream().reduce(0, Integer::sum);

        System.out.println("Lista de números: " + numeros);

        System.out.println("Soma dos números da lista: " + somaLista);

    }
}
