package practice.challenges;

import practice.GerarListaInt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumerosPrimos {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        List<Integer> numerosPrimos = numeros.stream()
                .filter(NumerosPrimos::numeroPrimo).toList();

        System.out.println("Lista de números: " + numeros);

        System.out.println("Números primos: " + numerosPrimos);
    }

    private static boolean numeroPrimo(int numero) {
        numero = Math.abs(numero);

        // Verifica se o número é menor ou igual a 1 ou se é um número par que não seja 2.
        if (numero <= 1 || (numero % 2 == 0 && numero != 2)) {
            return false;
        }

        // Realiza um loop de 2 até a raiz quadrada do número, quando for divisível por algum número nesse intervalo, não é primo.
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        // Caso passe do loop acima, o número é primo.
        return true;
    }
}
