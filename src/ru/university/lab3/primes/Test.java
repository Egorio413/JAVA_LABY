package ru.university.lab3.primes;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public void run() {
        int n = 10;
        System.out.println(" Первые " + n + " простых чисел ");

        PrimeGenerator generator = new PrimeGenerator(n);

        // Прямой порядок: for-each вызывает iterator() и идёт по нему
        List<Integer> primes = new ArrayList<>();
        for (int p : generator) {
            primes.add(p);
        }
        System.out.println("Прямой порядок: " + primes);

        // Обратный порядок: идём с конца списка
        System.out.print("Обратный порядок: [");
        for (int i = primes.size() - 1; i >= 0; i--) {
            System.out.print(primes.get(i));
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}