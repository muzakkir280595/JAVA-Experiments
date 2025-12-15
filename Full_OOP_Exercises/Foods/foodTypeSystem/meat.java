package Full_OOP_Exercises.Foods.foodTypeSystem;

public class meat extends foodItem {
    private String cutType;

    public meat(String name, double caloriesPer100g, String cutType) {
        
        super(name, caloriesPer100g, false);
        this.cutType = cutType;
    }

    
    @Override
    public void describeFoodType() {
        System.out.println(getName() + " is a type of **Meat**.");
        System.out.println("It is a primary source of protein.");
    }

    
    public void cook() {
        System.out.println(getName() + " is being cooked using a high-heat method.");
    }
}
