package practice.challenges;

import practice.GerarListaInt;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.IntStream;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        List<Integer> numerosPrimos = numeros.stream()
                        .filter(num -> {
                            if (Math.abs(num) < 2) {
                                return false;
                            }

                            for (int i = 2; i < Math.abs(num); i++) {
                                if (Math.abs(num) % i == 0) {
                                    return false;
                                }
                            }
                            return true;
                        }).toList();

        Optional<Integer> maiorNumeroPrimo = numerosPrimos.stream().max(Comparator.naturalOrder());

        System.out.println("Lista de números: " + numeros);

        System.out.println("Lista de números primos: " + numerosPrimos);

        System.out.println("Maior número primo: " + maiorNumeroPrimo.orElseThrow(() -> new NoSuchElementException("Não há números primos")));
    }
}
