package ru.university.lab3.primes;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Генерирует N простых чисел.
 * Реализует Iterable, чтобы можно было перебирать через for-each / Iterator.
 */
public class PrimeGenerator implements Iterable<Integer> {

    private final int count; // сколько простых чисел вернуть

    public PrimeGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimeIterator();
    }

    /**
     * Внутренний класс-итератор.
     * Перебирает числа, проверяет на простоту, хранит счётчик выданных.
     */
    private class PrimeIterator implements Iterator<Integer> {
        private int found = 0;      // сколько простых уже выдали
        private int current = 2;    // с какого числа искать

        @Override
        public boolean hasNext() {
            return found < count;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            while (!isPrime(current)) {
                current++;
            }
            int result = current;
            current++;
            found++;
            return result;
        }

        private boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}