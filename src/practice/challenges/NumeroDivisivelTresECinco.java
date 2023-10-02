package practice.challenges;

import practice.GerarListaInt;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class NumeroDivisivelTresECinco {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        List<Integer> divisiveisPorTresCinco = numeros.stream().filter(numero -> numero % 3 == 0 && numero % 5 == 0).toList();
        Optional<Integer> somaDivisivelTresCinco = numeros.stream().filter(numero -> numero % 3 == 0 && numero % 5 == 0).reduce(Integer::sum);

        System.out.println("Lista de números: " + numeros);
        System.out.println("Lista de números divisiveis por três e cinco: " + divisiveisPorTresCinco);
        System.out.println("Soma dos números divisiveis por três e cinco: " + somaDivisivelTresCinco.orElseThrow(() -> new NoSuchElementException("Não existe elementos para a soma.")));
    }
}
