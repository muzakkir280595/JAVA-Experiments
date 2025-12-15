package Full_OOP_Exercises.Foods.foodTypeSystem;

public class vegetable extends foodItem implements mainComponent {
    private String color;

    public vegetable(String name, double caloriesPer100g, String color) {
        super(name, caloriesPer100g, true);
        this.color = color;
    }

    
    @Override
    public void describeFoodType() {
        System.out.println(getName() + " is a type of **Vegetable**.");
        System.out.println("It's known for its fiber content.");
    }

    @Override
    public void prepareMainDish() {
        System.out.println(getName() + " is being prepared for the main dish. " + PREP_NOTE);
    }
}
