package Lab_2;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Легковой", "Toyota", "Camry", 12345, 500, "Бензин", "Автомат", 2, true);
        Car car2 = new Car("Легковой", "BMW", "M5", 54321, 300, "Бензин", "Автомат", 3, true);
        Drift_car driftCar1 = new Drift_car("Легковой", "Nissan", "Silvia", 22222, 400, "Бензин", "Механика", 5, true, 450, 65, "illegal");
        TS bike1 = new Bike("Мотоцикл", "Yamaha", "R1", 11111, 100, 300, 200.0, 1.0);
        TS lorry1 = new Lorry("Грузовой", "Volvo", "FH16", 33333, 800, 20000, 4, 600.0);


        System.out.println("=== Информация о ТС ===");
        car1.getInfo();
        car2.getInfo();
        driftCar1.getInfo();

        System.out.println();         //пустая строка для красоты
        System.out.println("=== ПОЛИМОРФИЗМ ===");
        TS[] vehicles = {car1, car2, driftCar1};

        for (TS vehicle : vehicles) {
            vehicle.getInfo();        // метод ведёт себя по-разному
            vehicle.maintenance();    // переопределённый метод
            System.out.println();     // пустая строка для красоты
        }

        driftCar1.rev_it();
        driftCar1.police();



        System.out.println("\nСоздано автомобилей: " + Car.getCarCount());
    }
}
