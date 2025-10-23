package Lab_3.Task2;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {
    private Map<String, Car> cars;

    public CarRegistry() {
        cars = new HashMap<>();
    }

    public void addCar(String plate, Car car) {
        cars.put(plate, car); // кладём машину в карту
    }

    public Car getCar(String plate) {
        return cars.get(plate);
    }

    public void removeCar(String plate) {
        cars.remove(plate);
    }

    public void printAllCars() {
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public int size() {
        return cars.size();
    }

    public boolean isEmpty() {
        return cars.isEmpty();
    }
}
