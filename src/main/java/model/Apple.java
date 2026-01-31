package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food implements Discountable {
    String colour;

    public Apple(String colour, int amount, double price) { // принимает количество, цену и цвет яблок — и устанавливает флаг isVegetarian
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(colour, Colour.RED)) { // для красных яблок предусмотрена скидка 60%
            return Discount.RED_DISCOUNT;
        } else {
            return Discount.DEFAULT_DISCOUNT;
        }
    }
}
