package org.example;

/**
 * Класс для хранения целых чисел в виде односвязного списка.
 * Поддерживает добавление, извлечение и удаление элементов.
 *
 * @author Фомин Илья
 */
public class ContainerOfIntegers {
    /** Первый узел списка. */
    private Node head;

    /** Размер контейнера. */
    private int size;

    /**
     * Внутренний класс, представляющий узел списка.
     */
    private static class Node {
        /** Значение узла. */
        int data;

        /** Ссылка на следующий узел. */
        Node next;

        /**
         * Конструктор внутреннего класса.
         * Создает новый узел.
         *
         * @param data целое число для хранения в узле
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Конструктор класса.
     * Создает пустой контейнер.
     */
    public ContainerOfIntegers() {
        head = null;
        size = -1;
    }

    /**
     * Проверяет валидность индекса.
     *
     * @param index проверяемый индекс
     * @throws IndexOutOfBoundsException если индекс отрицательный или больше размера контейнера
     */
    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound exception\nsize: " + size + ", index: " + index);
        }
    }

    /**
     * Возвращает размер контейнера
     *
     * @return размер контейнера
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Добавляет число в начало списка.
     *
     * @param data целое число для добавления
     */
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Добавляет число в указанную позицию.
     *
     * @param data целое число для добавления
     * @param index позиция, куда вставляется элемент
     */
    public void addByIndex(int data, int index) {
        validateIndex(index);

        // добавляет в голову
        if (index == 0) {
            this.add(data);
        }
        else {
            int currInd = 1;
            Node curr = head;
            while (currInd != index) {
                curr = curr.next;
                currInd++;
            }

            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;
        }

        size++;
    }

    /**
     * Возвращение значение элемента по индексу.
     *
     * @param index позиция элемента
     * @return значение элемента
     */
    public int getData(int index) {
        validateIndex(index);

        int currInd = 0;
        Node curr = head;
        while (currInd != index) {
            curr = curr.next;
            currInd++;
        }

        return curr.data;
    }

    /**
     * Удаляет элемент по индексу.
     *
     * @param index позиция удаляемого элемента
     */
    public void remove(int index) {
        validateIndex(index);

        // удаляет с головы
        if (index == 0) {
            head = head.next;
        }
        // удаляет с середины или конца
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
