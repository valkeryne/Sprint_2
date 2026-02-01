package main;

import model.Apple;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import service.ShoppingCart;
import model.Food;

public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5, 100);// Мясо в количестве 5 кг по цене 100 рублей за кг;

        var redApple = new Apple(Colour.RED, 10, 50); // Яблоки красные в количестве 10 кг по цене 50 рублей;

        var greenApple = new Apple(Colour.GREEN, 8, 60);// Яблоки зелёные в количестве 8 кг по цене 60 рублей.

        Food[] items = {meat, redApple, greenApple}; // инициализация корзины с помощью созданного массива
        var shoppingCart = new ShoppingCart(items);

        System.out.printf("Общая сумма товаров без скидки %s\r\n" , shoppingCart.totalPriceNoDiscount());
        System.out.printf("Общая сумма товаров со скидкой %s\r\n" , shoppingCart.totalPriceWithDiscount());
        System.out.printf("Общая сумма всех вегетарианских продуктов без скидки %s\r\n" , shoppingCart.totalVeg());

    }

}
