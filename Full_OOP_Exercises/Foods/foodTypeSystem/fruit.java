package Full_OOP_Exercises.Foods.foodTypeSystem;

public class fruit extends foodItem{

    private boolean isSweet;

    public fruit(String name, double caloriesPer100g, boolean isSweet) {
        
        super(name, caloriesPer100g, true);
        this.isSweet = isSweet;
    }

    @Override
    public void describeFoodType() {
        System.out.println(getName() + " is a type of **Fruit**.");
        System.out.println("It's typically consumed as a snack or dessert.");
    }

    public void printSweetness() {
        System.out.println("Sweetness: " + (isSweet ? "High" : "Low"));
    }

}
