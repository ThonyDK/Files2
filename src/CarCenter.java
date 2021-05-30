public class CarCenter {
    public static void main(String[] args) {
        //Oprettelse af objekt
        MercedesBenz myMercedesBenz = new MercedesBenz("Mercedes-Benz A-Class", "Silver", 9, 200, 300);
        System.out.println(myMercedesBenz);
        System.out.println();
        //Oprettelse af objekt
        BMW myBMW = new BMW("BMW 3-serie", "Black", 9, 192, 280);
        System.out.println(myBMW);
        System.out.println();
        //Oprettelse af objekt
        Audi myAudi = new Audi("Audi A3", "Red,", 9, 190, 280);
        System.out.println(myAudi);

    }
}
