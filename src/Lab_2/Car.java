package Lab_2;

public class Car extends TS {
    private String type_of_engine;
    private String type_of_gearbox;
    private int count_of_owners;
    private boolean turbo;


    private static int carCount = 0;

    public Car() {
        super();
        this.type_of_engine = "Unknown";
        this.type_of_gearbox = "Unknown";
        carCount++; // увеличиваем счётчик при создании
    }

    public Car(String type_of_vehicle, String mark, String model, int engine_number, int engine_hours,
               String type_of_engine, String type_of_gearbox, int count_of_owners, boolean turbo) {
        super(type_of_vehicle, mark, model, engine_number, engine_hours);
        this.type_of_engine = type_of_engine;
        this.type_of_gearbox = type_of_gearbox;
        this.count_of_owners = count_of_owners;
        this.turbo = turbo;
        carCount++; // увеличиваем счётчик при создании
    }

    public static int getCarCount() {
        return carCount;
    }

    @Override
    public void maintenance() {
        System.out.println("Вашему ТС требуется техническое обслуживание");
    }

    public void ifturbo() {
        if (turbo) {
            System.out.println("Отличный выбор :)");
        }
    }

    public void owners() {
        if (count_of_owners >= 8) {
            System.out.println("Не нужна тебе такая машина, брат");
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Тип двигателя: " + type_of_engine +
                ", КПП: " + type_of_gearbox +
                ", Владельцев: " + count_of_owners +
                ", Турбо: " + (turbo ? "Да" : "Нет"));
    }

    public String getType_of_engine() { return type_of_engine; }
    public void setType_of_engine(String type_of_engine) {
        if (type_of_engine == null || type_of_engine.isBlank())
            throw new IllegalArgumentException("type_of_engine required");
        this.type_of_engine = type_of_engine;
    }

    public int getCount_of_owners() { return count_of_owners; }
    public void setTurbo(boolean turbo) { this.turbo = turbo; }
}
