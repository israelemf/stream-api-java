package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class RemoverImpares {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();
        List<Integer> numerosImpares = numeros.stream().filter(numero -> numero % 2 == 1).toList();

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números ímpares: " + numerosImpares);

        numeros.removeIf(numero -> numero % 2 == 1);

        System.out.println("Lista sem ímpares: " + numeros);
    }
}
