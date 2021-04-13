public class Audi extends Car{
    //Attributes
    int Horsepower;
    int nrOfNewtonmeter;


    //Constructor
    public Audi(String color, int nrOfGear, int Horsepower, int nrOfNewtonmeter) {
        super(color,nrOfGear);
        this.Horsepower = Horsepower;
        this.nrOfNewtonmeter = nrOfNewtonmeter;

    }
    @Override
    String carPackage() {
        return ("\nThe car has S-line-package installet");
    }
    //toString metode
    public String toString() {
        return "Color of the car: " + color +
                "\nNumber of gears: " + nrOfGear +
                "\nHorsepower: " + Horsepower +
                "\nNewtonmeter: " + nrOfNewtonmeter +
                carPackage();
    }
}
