public class CarCenter {
    public static void main(String[] args) {
        //Oprettelse af objekt
        MercedesBenz myMercedesBenz = new MercedesBenz("Silver", 9, 200,300);
        System.out.println(myMercedesBenz);
        System.out.println();
        //Oprettelse af objekt
        BMW myBMW = new BMW("Black", 9,192, 280);
        System.out.println(myBMW);
        System.out.println();
        //Oprettelse af objekt
        Audi myAudi = new Audi("Red", 9,200, 280);
        System.out.println(myAudi);

    }
}
