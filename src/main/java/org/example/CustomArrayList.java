package org.example;

import java.util.*;

public class CustomArrayList<E> {
    private List<E> list;

    public CustomArrayList() {
        this.list = new ArrayList<>();
    }

    public void add(int index, E element) {
        list.add(index, element);  //Добавляет элемент по индексу.
    }

    public void addAll(Collection<Vegetable> c) {
        list.addAll((Collection<? extends E>) c);   //Добавляет все элементы из коллекции.
    }

    public void clear() {
        list.clear();   //Очищает список.
    }

    public E get(int index) {
        return list.get(index);  //Получает элемент по индексу.
    }

    public boolean isEmpty() {
        return list.isEmpty();   //Проверяет, пуст ли список.
    }

    public E remove(int index) {
        return list.remove(index);   //Удаляет элемент по индексу.
    }

    public boolean remove(Object o) {
        return list.remove(o);   //Удаляет указанный элемент.

    }

    public void sort(Comparator<? super E> c) {       //Сортирует список, используя алгоритм QuickSort.
        quickSort(list, 0, list.size() - 1, c);
    }

    private void quickSort(List<? super E> list, int low, int high, Comparator<? super E> c) {
        if (low < high) {
            int pi = partition(list, low, high, c);
            quickSort(list, low, pi - 1, c);
            quickSort(list, pi + 1, high, c);
        }
    }
    private int partition(List<? super E> list, int low, int high, Comparator<? super E> c) {
        E pivot = (E) list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (c.compare((E) list.get(j), pivot) <= 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

