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
        assert meat.getDiscount() == Discount.DEFAULT_DISCOUNT;

        var redApple = new Apple(Colour.RED, 10, 50); // Яблоки красные в количестве 10 кг по цене 50 рублей;
        assert redApple.getDiscount() == Discount.RED_DISCOUNT;

        var greenApple = new Apple(Colour.GREEN, 8, 60);// Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        assert greenApple.getDiscount() == Discount.DEFAULT_DISCOUNT;

        Food[] items = {meat, redApple, greenApple}; // инициализация корзины с помощью созданного массива
        var shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.totalPriceNoDiscount());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.totalPriceWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки " + shoppingCart.totalVeg());

    }

}
