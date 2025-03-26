package org.example;

public class ContainerOfIntegers {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ContainerOfIntegers() {
        head = null;
        size = 0;
    }

    // добавление в начало списка
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node newInt = new Node(data);
            newInt.next = head;
            head = newInt;
            size++;
        }
    }

    // извлечение элемента по индексу
    public int getData(int index) {
        // выбрасывает ошибку если индекс меньше 0 или больше размера контейнера
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound exception\nsize: " + size + ", index: " + index);
        }

        int currInd = 0;
        Node curr = head;
        while (currInd != index) {
            curr = curr.next;
            currInd++;
        }

        return curr.data;
    }

    // удаление элемента
    public void remove(int index) {
        // выбрасывает ошибку если индекс меньше 0 или больше размера контейнера
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound exception\nsize: " + size + ", index: " + index);
        }

        // удаление головы
        if (index == 0) {
            head.next = head.next.next;
        }
        // удаление середины или конца
        else {
            int currInd = 1;
            Node curr = head.next, prev = head;
            while (currInd != index) {
                prev = curr;
                curr = curr.next;
                currInd++;
            }

            prev.next = curr.next;
        }
        size--;
    }
}
