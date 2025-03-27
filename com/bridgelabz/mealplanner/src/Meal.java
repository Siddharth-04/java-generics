package com.bridgelabz.mealplanner.src;

class Meal<T extends MealPlan> {
    private String name;
    private T mealType;

    public Meal(String name, T mealType) {
        this.name = name;
        this.mealType = mealType;
    }

    public String getName() { return name; }
    public T getMealType() { return mealType; }

    @Override
    public String toString() {
        return "Meal{" + "name='" + name + "', type=" + mealType.getMealType() + '}';
    }
}
