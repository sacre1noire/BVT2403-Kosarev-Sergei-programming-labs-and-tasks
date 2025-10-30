package Lab_2;
public abstract class TS {
    private String type_of_vehicle;
    private String mark;
    private String model;
    private int engine_number;
    private int engine_hours;
    public TS() {this("Unknown","Unknown","Unknown",0,0);}
    public TS(String type_of_vehicle,String mark, String model,int engine_number,int engine_hours){
        this.type_of_vehicle=type_of_vehicle;
        this.mark = mark;
        this.model = model;
        this.engine_number=engine_number;
        this.engine_hours = engine_hours;
    }
    public abstract void maintenance();
    public void getInfo() {
        System.out.println("Тип ТС: " + type_of_vehicle +
                ", Марка: " + mark +
                ", Модель: " + model +
                ", Номер двигателя: " + engine_number +
                ", Моточасы двигателя: " + engine_hours);
    }
    public String getMark(){return mark;}
    public void setMark(String mark){if (mark == null || mark.isBlank())
        throw new IllegalArgumentException("mark required"); this.mark = mark;}
    public String getModel(){return model;}
}

