package ru.university.lab3.words;

import java.util.HashMap;
import java.util.Map;

public class Task4{

    public void run() {
        String text = "The quick brown fox jumps over the lazy dog. " +
                "The dog barks, and the fox runs away. THE END.";  //текст сгенерен ИИшкой если что

        // Разбиваем по всем не-буквам (пробелы, запятые, точки)
        String[] rawWords = text.split("[^a-zA-Z]+");

        Map<String, Integer> frequency = new HashMap<>();
        for (String word : rawWords) {
            if (word.isEmpty()) continue;
            // Приводим к нижнему регистру — тогда "The" и "the" считаются одним словом
            String key = word.toLowerCase();
            Integer count = frequency.get(key);
            if (count == null) {
                frequency.put(key, 1);
            } else {
                frequency.put(key, count + 1);
            }
        }

        System.out.println(" Частота слов ");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}