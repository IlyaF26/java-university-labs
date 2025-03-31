package org.example;

public class Main {
    public static void main(String[] args) {
        ContainerOfIntegers container = new ContainerOfIntegers();
        container.add(57);
        System.out.println(container.getSize());
        for (int i = 9; i >= 0; i--) {
            container.add((i));
        }

        System.out.println(container.getSize());

        container.remove(1);

        System.out.println(container.getData(5));

        for (int i = 0; i < container.getSize(); i++) {
            System.out.print(container.getData(i) + " ");
        }

        container.addByIndex(1, 1);

        System.out.println();

        for (int i = 0; i < container.getSize(); i++) {
            System.out.print(container.getData(i) + " ");
        }
    }
}