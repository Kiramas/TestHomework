package ru.netology;

import java.util.Random;

public class MagicBox<T> {
    protected int maxItems;
    protected T[] items = (T[]) new Object[maxItems];
    protected Random random = new Random();

    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int emptyСells = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                emptyСells++;
            }
        }
        if (emptyСells < items.length) {
            throw new RuntimeException("Коробка не полна");
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    public int getSize() {
        return maxItems;
    }
}