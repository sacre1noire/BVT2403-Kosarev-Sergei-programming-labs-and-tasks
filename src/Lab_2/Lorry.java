package Lab_2;

public class Lorry extends TS{
    private int loadCapacity;
    private int numberOfAxles;
    private double fuelTankCapacity;
    public Lorry(){
        super();
        this.fuelTankCapacity=0.0;
    }
    public Lorry(String type_of_vehicle,String mark, String model,int engine_number,int engine_hours,
                 int loadCapacity, int numberOfAxles, double fuelTankCapacity){
        super(type_of_vehicle, mark, model, engine_number, engine_hours);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.fuelTankCapacity = fuelTankCapacity;
    }
    @Override
    public void maintenance(){
        System.out.println("Вашему грузовику требуется техническое обслуживание");
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Максимальная загрузка "+loadCapacity+" кг"+", Количество осей "+numberOfAxles+
                ", Объем бака "+fuelTankCapacity);
    }

    public int getLoadCapacity(){return loadCapacity;}
    public void setLoadCapacity(int load){if (load <0) throw new
            IllegalArgumentException("Недопустимое значение максимальной загрузки"); this.loadCapacity=load;}
    public int getNumberOfAxles(){return numberOfAxles;}
}
