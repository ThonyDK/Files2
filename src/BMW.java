public class BMW extends Car{
    //Attributes
    int Horsepower;
    int nrOfNewtonmeter;


    //Constructor
    public BMW(String brand, String color, int nrOfGear, int Horsepower, int nrOfNewtonmeter) {
        super(brand, color,nrOfGear);
        this.Horsepower = Horsepower;
        this.nrOfNewtonmeter = nrOfNewtonmeter;

    }
    String carPackage() {
        return ("\nThe car has M-Package installet");
    }
    //toString metode
    public String toString() {
        return  "Brand: " + brand +
                "\nColor of the car: " + color +
                "\nNumber of gear: " + nrOfGear +
                "\nHorsepower: " + Horsepower +
                "\nNewtonmeter: " + nrOfNewtonmeter +
                carPackage();
    }
}
