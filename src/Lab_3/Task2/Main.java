package Lab_3.Task2;

public class Main {
    public static void main(String[] args) {
        CarRegistry registry = new CarRegistry();

        registry.addCar("A123BC", new Car("Toyota", "Chaser", 1989));
        registry.addCar("B456CD", new Car("Nissan", "Silvia", 2000));
        registry.addCar("C789DE", new Car("Audi", "A6", 2019));

        registry.printAllCars();

        System.out.println("Размер: " + registry.size());
        registry.removeCar("B456CD");
        System.out.println("После удаления B456CD:");
        registry.printAllCars();
        System.out.println("Поиск автомобиля по номерам A123BC "+registry.getCar("A123BC"));
    }
}
