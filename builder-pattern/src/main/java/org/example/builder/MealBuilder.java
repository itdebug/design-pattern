package org.example.builder;

import org.example.builder.burger.ChickenBurger;
import org.example.builder.burger.VegBurger;
import org.example.builder.drink.Coke;
import org.example.builder.drink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
