package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class ValoresImparesMultiplosDeTresCinco {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        List<Integer> imparesMultiplosDeTres = numeros.stream().filter(numero -> numero % 3 == 0).toList();
        List<Integer> imparesMultiplosDeCinco = numeros.stream().filter(numero -> numero % 5 == 0).toList();

        System.out.println("Lista de números: " + numeros);

        System.out.println("Números da lista múltiplos de 3: " + imparesMultiplosDeTres);
        System.out.println("Números da lista múltiplos de 5: " + imparesMultiplosDeCinco);
    }
}
