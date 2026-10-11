package ru.university.lab3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public void run() {
        // 1. Массив N случайных чисел от 0 до 100
        int n = 15;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(101); // [0..100]
        }
        System.out.println("1. Массив: " + java.util.Arrays.toString(arr));

        // 2. На основе массива — List
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }
        System.out.println("2. List: " + list);

        // 3. Сортировка по возрастанию
        Collections.sort(list);
        System.out.println("3. По возрастанию: " + list);

        // 4. Сортировка в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("4. По убыванию: " + list);

        // 5. Перемешать
        Collections.shuffle(list);
        System.out.println("5. Перемешанный: " + list);

        // 6. Циклический сдвиг на 1 элемент влево
        Collections.rotate(list, -1);
        System.out.println("6. Сдвиг на 1: " + list);

        // 7. Только уникальные элементы
        Set<Integer> unique = new HashSet<>(list);
        System.out.println("7. Уникальные: " + unique);

        // 8. Только дублирующиеся
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer x : list) {
            if (!seen.add(x)) {
                duplicates.add(x);
            }
        }
        System.out.println("8. Дубликаты: " + duplicates);

        // 9. Из списка получить массив
        Integer[] fromList = list.toArray(new Integer[0]);
        System.out.println("9. Массив из списка: " + java.util.Arrays.toString(fromList));

        // 10. Подсчёт вхождений каждого числа
        System.out.println("10. Частота:");
        for (Integer x : unique) {
            int count = Collections.frequency(list, x);
            System.out.println("    " + x + " → " + count);
        }
    }
}