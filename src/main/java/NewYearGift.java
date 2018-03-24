/**
 * Created by 1 on 22.03.2018.
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

abstract class Gift {
    String name;
    int weight, price, quantity;

    public Gift(String name, int weight, int price, int quantity) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }
}

class Sweets extends Gift {
    public Sweets(String name, int weight, int price, int quantity) {
        super(name, weight, price, quantity);
    }
}

class Chocolate extends Gift {
    public Chocolate(String name, int weight, int price, int quantity) {
        super(name, weight, price, quantity);
    }
}

class Jellybean extends Gift {
    public Jellybean(String name, int weight, int price, int quantity) {
        super(name, weight, price, quantity);
    }
}

class Kinder extends Gift {
    public Kinder(String name, int weight, int price, int quantity) {
        super(name, weight, price, quantity);
    }
}

class Sweets_domino extends Gift {
    public Sweets_domino(String name, int weight, int price, int quantity) {
        super(name, weight, price, quantity);
    }
}

public class NewYearGift {
    public static void main(String[] args) {
        System.out.println("Новогодний подарок СКАЗКА" + '\n' + "Состав:");
        Sweets sweets = new Sweets("Шоколадная конфета Аленка", 20, 50, 8);
        Chocolate chocolate = new Chocolate("Шоколад Milka", 150, 150, 2);
        Jellybean jellybean = new Jellybean("Jellybean", 150, 230, 1);
        Kinder kinder = new Kinder("Киндер Сюрприз", 50, 95, 2);
        Sweets_domino sweets_domino = new Sweets_domino("Конфета Домино", 22, 53, 15);
        System.out.println(sweets.name + " " + sweets.weight + "г" + " " + "цена:" + sweets.price + "руб" + " " + sweets.quantity + "шт");
        System.out.println(chocolate.name + " " + chocolate.weight + "г" + " " + "цена:" + chocolate.price + "руб" + " " + chocolate.quantity + "шт");
        System.out.println(jellybean.name + " " + jellybean.weight + "г" + " " + "цена:" + jellybean.price + "руб" + " " + jellybean.quantity + "шт");
        System.out.println(kinder.name + " " + kinder.weight + "г" + " " + "цена:" + kinder.price + "руб" + " " + kinder.quantity + "шт");
        System.out.println(sweets_domino.name + " " + sweets_domino.weight + "г" + " " + "цена:" + sweets_domino.price + "руб" + " " + sweets_domino.quantity + "шт");
        int mas = sweets.weight * 8 + chocolate.weight * 2 + jellybean.weight + kinder.weight * 2 + sweets_domino.weight * 15;
        System.out.println("Масса: " + mas + "г");
        int total_price = sweets.price * 8 + chocolate.price * 2 + jellybean.weight + kinder.weight * 2 + sweets_domino.weight * 15;
        System.out.println("Общая цена: " + total_price + "руб");
    }
}