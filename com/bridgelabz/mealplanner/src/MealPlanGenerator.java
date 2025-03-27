package com.bridgelabz.mealplanner.src;

import java.util.ArrayList;
import java.util.List;

class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    // Generic method to add a meal
    public <T extends MealPlan> void addMeal(Meal<T> meal) {
        meals.add(meal);
    }

    // Display all meals
    public void showMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }
}