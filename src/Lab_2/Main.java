package Lab_2;

public class Main {
    public static void main(String[] args) {

        // Создаём объекты
        Car car1 = new Car("Легковой", "Toyota", "Camry", 12345, 500, "Бензин", "Автомат", 2, true);
        Car car2 = new Car("Легковой", "BMW", "M5", 54321, 300, "Бензин", "Автомат", 3, true);
        Drift_car driftCar1 = new Drift_car("Легковой", "Nissan", "Silvia", 22222, 400, "Бензин", "Механика", 5, true, 450, 65, "illegal");
        Bike bike1 = new Bike("Мотоцикл", "Yamaha", "R1", 11111, 100, 300, 200.0, 1.0);
        Lorry lorry1 = new Lorry("Грузовой", "Volvo", "FH16", 33333, 800, 20000, 4, 600.0);

        // Массив для полиморфизма
        TS[] vehicles = {car1, car2, driftCar1, bike1, lorry1};

        System.out.println("=== ПОЛИМОРФИЗМ: все ТС ===");
        for (TS vehicle : vehicles) {
            vehicle.getInfo();       // общий метод для всех
            vehicle.maintenance();   // переопределённый метод
            System.out.println();
        }

        //Методы Car
        car1.ifTurbo();
        car2.owners();

        //Методы Drift_car
        driftCar1.rev_it();
        driftCar1.police();

        //Методы Bike
        System.out.println("Макс скорость мотоцикла: " + bike1.getTopSpeed() + " км/ч");
        bike1.setTopSpeed(320);
        System.out.println("Новая макс скорость мотоцикла: " + bike1.getTopSpeed());

        //Методы Lorry
        System.out.println("Грузоподъемность грузовика: " + lorry1.getLoadCapacity() + " кг");
        lorry1.setLoadCapacity(25000);
        System.out.println("Новая грузоподъемность грузовика: " + lorry1.getLoadCapacity() + " кг");

        //Счётчик Car
        System.out.println("\nСоздано автомобилей (Car и Drift_car): " + Car.getCarCount());
    }
}
