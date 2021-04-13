public abstract class Car {
    //Atributes
    String color;
    int nrOfGear;

    //The car constructor takes color and nrOfGear as a parameter.
    public Car(String color, int nrOfGear){
        this.color = color;
        this.nrOfGear = nrOfGear;

    }
    //Abstract metode.
    abstract String carPackage();


    @Override
    public String toString() {
        return "Color of the car: " + color + "\nNumber of gears: " + nrOfGear;
    }
}
