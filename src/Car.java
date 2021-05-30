public abstract class Car {
    //Atributes
    String brand;
    String color;
    int nrOfGear;

    //The car constructor takes color and nrOfGear as a parameter.
    public Car(String brand, String color, int nrOfGear){
        this.brand = brand;
        this.color = color;
        this.nrOfGear = nrOfGear;

    }
    //Abstract metode.
    abstract String carPackage();



    public String toString() {
        return "Brand: " +
                "\nColor of the car: " + color +
                "\nNumber of gears: " + nrOfGear;
    }
}
