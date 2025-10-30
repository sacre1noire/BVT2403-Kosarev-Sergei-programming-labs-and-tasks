package Lab_2;

public class Bike extends TS{
    private int topSpeed;
    private double engine_capacity;
    private double weight;
    public Bike(){
        super();
        this.engine_capacity=0.0;
        this.topSpeed=60;
        this.weight=50.0;
    }
    public Bike(String type_of_vehicle,String mark, String model,int engine_number,
                int engine_hours,int topSpeed, double weight,double engine_capacity){
        super(type_of_vehicle,mark,model,engine_number,engine_hours);
        this.topSpeed=topSpeed;
        this.engine_capacity=engine_capacity;
        this.weight=weight;
    }
    @Override
    public void maintenance() {System.out.println("Вашему мотоциклу требуется техническое обслужевание");}

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(", Максимальная скорость "+topSpeed+", Объем двигателя "+
                engine_capacity+"куб. "+", Вес мотоцикла "+weight);
    }
    public int getTopSpeed(){return topSpeed;}
    public void setTopSpeed(int topSpeed){this.topSpeed=topSpeed;}
}
