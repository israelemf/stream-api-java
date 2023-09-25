package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GerarListaInt {
    private List<Integer> numeros = new ArrayList<>();

    public List<Integer> getNumeros() {
        for (int i = 1; i <= 15; i++) {
            numeros.add(ThreadLocalRandom.current().nextInt(0, 50));
        }
        return numeros;
    }
}
