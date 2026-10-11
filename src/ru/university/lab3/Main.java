package ru.university.lab3;

import ru.university.lab3.collections.Task1;
import ru.university.lab3.primes.Test;
import ru.university.lab3.human.HumanDemo_Task3;
import ru.university.lab3.words.Task4;
import ru.university.lab3.map.Task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("########## Задание 1 ##########");
        new Task1().run();

        System.out.println("\n########## Задание 2 ##########");
        new Test().run();

        System.out.println("\n########## Задание 3 ##########");
        new HumanDemo_Task3().run();

        System.out.println("\n########## Задание 4 ##########");
        new Task4().run();

        System.out.println("\n########## Задание 5 ##########");
        new Task5().run();
    }
}