package mealplangenerator;
import java.util.ArrayList;
import java.util.*;
class Meal<T extends MealPlan> {
    private List<T> meals;

    public Meal() {
        meals = new ArrayList<>();
    }

    // Method to add a meal to the meal plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Method to get all meals
    public List<T> getAllMeals() {
        return meals;
    }

    // Generic method to generate a personalized meal plan
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("Personalized Meal Plan:");
        for (T meal : meals) {
            System.out.println(meal);
        }
    }
}