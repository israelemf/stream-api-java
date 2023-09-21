package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class SomaNumerosPares {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();
        List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();
        int somaNumerosPares = numeros.stream().filter(numero -> numero % 2 == 0).reduce(0, Integer::sum);

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Soma dos números pares: " + somaNumerosPares);
    }
}
