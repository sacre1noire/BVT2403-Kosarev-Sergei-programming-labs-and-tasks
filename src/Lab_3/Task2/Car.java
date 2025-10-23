package Lab_3.Task2;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction){
        this.brand=brand;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getYear() {return yearOfProduction;}

    @Override
    public String toString() {
        return brand + " " + model + " (" + yearOfProduction + ")";
    }
}
