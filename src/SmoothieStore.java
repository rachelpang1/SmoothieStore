public class SmoothieStore {

    String location;
    int squareFeet;
    boolean isOpen;

    public static void main(String[] args) {
        SmoothieStore myStore;
        myStore = new SmoothieStore(); //construct
        myStore.location = "Newbury";
        myStore.isOpen = true;
        myStore.squareFeet = 700;

        System.out.println("My " + myStore.squareFeet + "sqft smoothie store is in " + myStore.location);

    }

    public SmoothieStore(){ //constructor method
        SmoothieDrinks Smoothie1; // declare IceCream1
        Smoothie1 =new SmoothieDrinks(); //construct IceCream1
        Smoothie1.flavor = "nutella";
        Smoothie1.nIngredients = 4;
        Smoothie1.mlInCup = 250; //no quotes - quotes only for strings
        Smoothie1.printInfo();

        SmoothieDrinks Smoothie2; // declare IceCream1
        Smoothie2 =new SmoothieDrinks(); //construct IceCream1
        Smoothie2.flavor = "mango";
        Smoothie2.nIngredients = 5;
        Smoothie2.mlInCup = 350; //no quotes - quotes only for strings
        Smoothie2.printInfo();

        AcaiBowls AcaiBowl1; // declare IceCream1
        AcaiBowl1 =new AcaiBowls(); //construct IceCream1
        AcaiBowl1.flavor = "strawberry";
        AcaiBowl1.isBerry = true;
        AcaiBowl1.sizeOunce = 12; //no quotes - quotes only for strings
        AcaiBowl1.printInfo();


    }
}
