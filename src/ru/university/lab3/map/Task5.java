package ru.university.lab3.map;

import java.util.*;

public class Task5{

    public <K, V> Map<V, List<K>> swap(Map<K, V> source) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : source.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // Если такого значения ещё нет — создаём пустой список
            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>());
            }
            // Добавляем текущий ключ в список ключей этого значения
            result.get(value).add(key);
        }
        return result;
    }

    public void run() {
        // Пример 1: значения уникальны
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        System.out.println("До:  " + map1);
        System.out.println("После: " + swap(map1));

        // Пример 2: значения повторяются — проверяем, что ничего не потеряли
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("a", 1);
        map2.put("b", 1);
        map2.put("c", 2);
        map2.put("d", 2);
        map2.put("e", 3);
        System.out.println("\nДо:  " + map2);
        System.out.println("После: " + swap(map2));
    }
}