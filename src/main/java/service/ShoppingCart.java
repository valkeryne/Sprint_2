package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPriceNoDiscount() { // считаем общую сумму товаров без скидки
        double total = 0;
        for (Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    public double totalPriceWithDiscount() { // считаем общую сумму товаров со скидкой
        double total = 0;
        for (Food item : items) {
            double discount = (100.0 - item.getDiscount()) / 100 ;
            total += item.getPrice() * item.getAmount() * discount;
        }
        return total;
    }

    public double totalVeg() { // считаем сумму всех вегетарианских продуктов без скидки
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian())
                total += item.getPrice() * item.getAmount();
        }
        return total;
    }
}
