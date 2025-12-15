package Full_OOP_Exercises.Foods.foodTypeSystem;

public abstract class foodItem {

    private String name;
    private double caloriesPer100g;
    private boolean isVegetarian;

    public foodItem(String name, double caloriesPer100g, boolean isVegetarian){
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
        this.isVegetarian = isVegetarian;
    }

    public abstract void describeFoodType();

    public void printNutritionInfo() {
        System.out.println("--- " + this.name + " ---");
        System.out.println("Calories (per 100g): " + this.caloriesPer100g);
        System.out.println("Is Vegetarian: " + (this.isVegetarian ? "Yes" : "No"));
    }

    public String getName() { return name; }
    public double getCaloriesPer100g() { return caloriesPer100g; }
    public boolean isVegetarian() { return isVegetarian; }

    public void setName(String name) { this.name = name; }

    public void setCaloriesPer100g(double caloriesPer100g) {
        if (caloriesPer100g >= 0) {
            this.caloriesPer100g = caloriesPer100g;
        }
    }
    
}
