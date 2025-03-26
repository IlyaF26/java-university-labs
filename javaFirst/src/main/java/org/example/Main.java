package org.example;

public class Main {
    public static void main(String[] args) {
        ContainerOfIntegers container = new ContainerOfIntegers();
        for (int i = 0; i < 10; i++) {
            container.add((i));
        }

        container.remove(5);

        System.out.println(container.getData(5));

        for (int i = 0; i < 9; i++) {
            System.out.print(container.getData(i) + " ");
        }
    }
}