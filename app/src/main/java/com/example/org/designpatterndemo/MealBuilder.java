package com.example.org.designpatterndemo;

import com.example.org.designpatterndemo.models.Coke;
import com.example.org.designpatterndemo.models.VegBurger;

/**
 * Created by swati on 9/12/16.
 */

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
