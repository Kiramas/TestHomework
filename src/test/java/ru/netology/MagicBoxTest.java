package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MagicBoxTest {
    @Test
    public void testLength() {
        MagicBox<Integer> number = new MagicBox<>(5);
        int expected = 5;
        Assertions.assertEquals(expected, number.getSize());
    }

    @Test
    public void testAdd() {
        MagicBox<Integer> numb = new MagicBox<>(1);
        numb.add(5);
        int expected = 5;
        Assertions.assertEquals(expected, numb.pick());
    }

    @Test
    public void testObjectsType() {
        MagicBox<Integer> numb = new MagicBox<>(1);
        numb.add(5);
        Class numbClass = numb.getClass();
        String expected = "class java.lang.Integer";
        Assertions.assertEquals(expected, numb.pick().getClass().toString());
    }
}