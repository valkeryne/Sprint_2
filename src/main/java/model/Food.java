package model;

import model.constants.Discount;

public abstract class Food {
    protected int amount; //amount — количество продукта в килограммах (целое число);
    protected double price; //price — цена за единицу (вещественное число);
    protected boolean isVegetarian; //isVegetarian — флаг, который показывает, вегетарианский ли продукт.
    //Поля должны быть доступны только из классов-потомков.

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getDiscount() {
        return Discount.DEFAULT_DISCOUNT;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }
}
