package practice.challenges;

import practice.GerarListaInt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ParesEImpares {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();
        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(num -> num % 2 != 0).toList();

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
