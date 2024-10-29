public class AcaiBowls {

    boolean isBerry;
    int sizeOunce;
    String flavor;

    public AcaiBowls(){

    }
    public void printInfo(){
        if (isBerry ==true){
            System.out.println("This " + flavor + " acai bowl with berries is " + sizeOunce + " ounces.");

        }
        else{ // isBerry== false
            System.out.println("This " + flavor + " regular acai bowl is " + sizeOunce + " ounces.");


        }

    }

}
