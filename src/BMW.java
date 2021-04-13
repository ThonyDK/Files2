public class BMW extends Car{
    //Attributes
    int Horsepower;
    int nrOfNewtonmeter;


    //Constructor
    public BMW(String color, int nrOfGear, int Horsepower, int nrOfNewtonmeter) {
        super(color,nrOfGear);
        this.Horsepower = Horsepower;
        this.nrOfNewtonmeter = nrOfNewtonmeter;

    }
    @Override
    String carPackage() {
        return ("\nThe car has M-Package installet");
    }
    //toString metode
    public String toString() {
        return "Color of the car: " + color +
                "\nNumber of gear: " + nrOfGear +
                "\nHorsepower: " + Horsepower +
                "\nNewtonmeter: " + nrOfNewtonmeter +
                carPackage();
    }
}
