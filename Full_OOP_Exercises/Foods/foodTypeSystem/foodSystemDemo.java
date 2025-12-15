package Full_OOP_Exercises.Foods.foodTypeSystem;

public class foodSystemDemo {
    public static void main(String[] args) {
        System.out.println("====== Food System Demonstration ======\n");


        foodItem[] myPantry = new foodItem[3];
        myPantry[0] = new fruit("Apple", 52.0, true);
        myPantry[1] = new meat("Beef Loin", 250.0, "Steak");
        myPantry[2] = new vegetable("Carrot", 41.0, "Orange");

        for (foodItem item : myPantry) {
		
            item.printNutritionInfo();
            item.describeFoodType();

            if (item instanceof meat) {
                ((meat) item).cook();
            } else if (item instanceof mainComponent) {
                ((mainComponent) item).prepareMainDish();
            }

            System.out.println("----------------------------------------");
        }
    }
}
