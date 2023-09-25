package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class SomaQuadrados {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();
        List<Integer> numeroAoQuadrado = numeros.stream().map(numero -> numero * numero).toList();
        int somaDosQuadrados = numeroAoQuadrado.stream().reduce(0, Integer::sum);

        System.out.println("Lista de números: " + numeros);

        System.out.println("Números ao quadrado: " + numeroAoQuadrado);

        System.out.println("Soma dos números ao quadrado: " + somaDosQuadrados);
    }
}
