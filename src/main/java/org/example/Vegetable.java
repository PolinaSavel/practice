package org.example;

public class Vegetable {
    private String name;
    private double weight;

    public Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (Вес: " + weight + " кг)";
    }


}