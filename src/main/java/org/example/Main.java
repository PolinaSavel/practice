package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Fruit> fruitList = new CustomArrayList<>();

        // Добавление фруктов
        fruitList.add(0, new Fruit("Яблоко", 1.2));
        fruitList.add(1, new Fruit("Банан", 1.1));
        fruitList.add(2, new Fruit("Груша", 1.5));
        fruitList.add(3, new Fruit("Виноград", 0.5));

        System.out.println("Изначальный список фруктов:");
        System.out.println(fruitList);

        // Сортировка по весу
        fruitList.sort(Comparator.comparingDouble(Fruit::getWeight));
        System.out.println("Отсортированный список фруктов по весу:");
        System.out.println(fruitList);

        // Добавление овощей
        Collection<Vegetable> vegetables = Arrays.asList(
                new Vegetable("Морковь", 3.2),
                new Vegetable("Картофель", 5.4),
                new Vegetable("Свекла", 1.0));

        fruitList.addAll(vegetables);
        System.out.println("Список после добавления овощей:");
        System.out.println(fruitList);
    }
}
