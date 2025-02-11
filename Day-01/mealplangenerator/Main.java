package mealplangenerator;

public class Main {
    public static void main(String[] args) {
        // Creating meal plan managers
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();

        // Adding meals
        vegetarianMeals.addMeal(new VegetarianMeal("Paneer Curry", 500));
        vegetarianMeals.addMeal(new VegetarianMeal("Vegetable Stir Fry", 400));

        veganMeals.addMeal(new VeganMeal("Quinoa Salad", 350));
        veganMeals.addMeal(new VeganMeal("Lentil Soup", 300));

        ketoMeals.addMeal(new KetoMeal("Grilled Chicken", 600));
        ketoMeals.addMeal(new KetoMeal("Avocado & Eggs", 450));

        // Generating meal plans dynamically
        System.out.println("\nVegetarian Meal Plan:");
        Meal.generateMealPlan(vegetarianMeals.getAllMeals());

        System.out.println("\nVegan Meal Plan:");
        Meal.generateMealPlan(veganMeals.getAllMeals());

        System.out.println("\nKeto Meal Plan:");
        Meal.generateMealPlan(ketoMeals.getAllMeals());
    }
}

