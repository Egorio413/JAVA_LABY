package ru.university.lab3.human;

import java.util.*;

public class HumanDemo_Task3 {

    public void run() {
        // 1. Список объектов Human
        List<Human> humans = new ArrayList<>(List.of(
                new Human("Иван", "Иванов", 30),
                new Human("Пётр", "Петров", 25),
                new Human("Кто то", "Ктотов", 28),
                new Human("Илья", "Ильин", 35),
                new Human("Иван", "Иванов", 30)
        ));
        System.out.println("1. Исходный список:");
        humans.forEach(System.out::println);

        // 2. HashSet — порядок не гарантируется
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\n2. HashSet:");
        hashSet.forEach(System.out::println);

        // 3. LinkedHashSet — сохраняет порядок добавления
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\n3. LinkedHashSet:");
        linkedHashSet.forEach(System.out::println);

        // 4. TreeSet — сортировка по compareTo (естественный порядок)
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\n4. TreeSet (естественный порядок):");
        treeSet.forEach(System.out::println);

        // 5. TreeSet с компаратором по фамилии
        Set<Human> byLastName = new TreeSet<>(new HumanComparator());
        byLastName.addAll(humans);
        System.out.println("\n5. TreeSet (по фамилии):");
        byLastName.forEach(System.out::println);

        // 6. TreeSet с анонимным компаратором по возрасту
        Set<Human> byAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        byAge.addAll(humans);
        System.out.println("\n6. TreeSet (по возрасту):");
        byAge.forEach(System.out::println);

    }
}