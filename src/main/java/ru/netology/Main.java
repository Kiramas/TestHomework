package ru.netology;

public class Main {
    public static void main(String[] args) {


        MagicBox<String> magicBox1 = new MagicBox<>(3);
        MagicBox<Integer> magicBox2 = new MagicBox<>(3);

        magicBox1.add("Раз");
        magicBox1.add("Два");
        magicBox1.add("Три");
        System.out.println("Коробка для строк " + magicBox1.pick());

        magicBox2.add(1000);
        magicBox2.add(2000);
        magicBox2.add(3000);
        System.out.println("Коробка для для чисел " + magicBox2.pick());
    }
}
