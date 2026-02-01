package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(String colour, int amount, double price) { // принимает количество, цену и цвет яблок — и устанавливает флаг isVegetarian
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return Objects.equals(colour, Colour.RED) ? Discount.RED_DISCOUNT : Discount.DEFAULT_DISCOUNT;
    }
}
