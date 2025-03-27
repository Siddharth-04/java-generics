package com.bridgelabz.mealplanner.src;

public class MealPlanner {
    public static void main(String[] args) {
        Meal<VeganMeal> smoothie = new Meal<>("Berry Smoothie", new VeganMeal());
        Meal<KetoMeal> steak = new Meal<>("Grilled Steak", new KetoMeal());
        Meal<VegetarianMeal> pasta = new Meal<>("Veggie Pasta", new VegetarianMeal());
        Meal<HighProteinMeal> eggs = new Meal<>("Boiled Eggs", new HighProteinMeal());

        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(smoothie);
        generator.addMeal(steak);
        generator.addMeal(pasta);
        generator.addMeal(eggs);

        System.out.println("Personalized Meal Plans:");
        generator.showMeals();
    }
}
//Personalized Meal Plans:
//Meal{name='Berry Smoothie', type=Vegan}
//Meal{name='Grilled Steak', type=Keto}
//Meal{name='Veggie Pasta', type=Vegetarian}
//Meal{name='Boiled Eggs', type=High-Protein}