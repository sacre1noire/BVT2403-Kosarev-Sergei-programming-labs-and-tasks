package Lab_2;

public class Drift_car extends Car {
    private int horsepower;
    private int max_angle_of_ride;
    private String class_of_legality;

    public Drift_car() {
        super();
        this.class_of_legality = "illegal";
    }

    public Drift_car(String type_of_vehicle, String mark, String model, int engine_number, int engine_hours,
                     String type_of_engine, String type_of_gearbox, int count_of_owners, boolean turbo,
                     int horsepower, int max_angle_of_ride, String class_of_legality) {
        super(type_of_vehicle, mark, model, engine_number, engine_hours,
                type_of_engine, type_of_gearbox, count_of_owners, turbo);
        this.horsepower = horsepower;
        this.max_angle_of_ride = max_angle_of_ride;
        this.class_of_legality = class_of_legality;
    }

    public void rev_it() { System.out.println("Stu-tu-tu!"); }

    public void police() {
        if (class_of_legality.equalsIgnoreCase("illegal")) {
            System.out.println("Берегись, 12.5.1");
        }
    }

    @Override
    public void maintenance() {
        System.out.println("Пора выстукивать кузов кувалдой");
    }

    public void setHorsepower(int horsepower) {
        if (horsepower < 200)
            throw new IllegalArgumentException("На 200 силах даже в стрит не поедешь!");
        this.horsepower = horsepower;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Л.с.: " + horsepower +
                ", Максимальный угол: " + max_angle_of_ride +
                ", Класс легальности: " + class_of_legality);
    }


}
