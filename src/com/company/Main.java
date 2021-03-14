//task1
//Подсчитать и вывести сумму чека по 4 позициям:
//Зеленое яблоко 186г / 25.90
//Красное яблоко 146г / 26.90
//Банан 186г / 32.80
//Лимон 246г / 34.90
package com.company;

import com.company.model.Fruit;

public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 186, 25.90);
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);
        fruits[0] = greenApple;
        fruits[1] = redApple;
        fruits[2] = banana;
        fruits[3] = lemon;

        System.out.println("greenApple price:" + greenApple.calculatePrice());
        System.out.println("redApple price:" + redApple.calculatePrice());
        System.out.println("Banana price:" + banana.calculatePrice());
        System.out.println("Lemon price:" + lemon.calculatePrice());
        System.out.printf("Fruits price:%.2f", (greenApple.calculatePrice() + redApple.calculatePrice()
                + banana.calculatePrice() + lemon.calculatePrice()));
    }
}
