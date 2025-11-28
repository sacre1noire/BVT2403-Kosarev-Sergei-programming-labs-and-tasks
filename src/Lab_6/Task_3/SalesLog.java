package Lab_6.Task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesLog {
    private List<SoldItem> salesList;
    private Store store;

    // Конструктор принимает объект склада, с которым мы работаем
    public SalesLog(Store store) {
        this.salesList = new ArrayList<>();
        this.store = store;
    }

    // Главный метод: Продать товар
    public void addSale(String itemName, double price, int quantity) {
        // 1. Проверяем, есть ли товар на складе
        if (store.hasSufficientStock(itemName, quantity)) {

            // 2. Списываем товар со склада
            store.removeItem(itemName, quantity);

            // 3. Записываем каждую единицу товара в журнал продаж
            for (int i = 0; i < quantity; i++) {
                salesList.add(new SoldItem(itemName, price));
            }
            System.out.println("Продано: " + quantity + " шт. товара '" + itemName + "'");
        } else {
            System.out.println("Ошибка: Недостаточно товара '" + itemName + "' на складе!");
        }
    }

    // Вывести список продаж
    public void displaySales() {
        System.out.println("\n Список продаж:");
        for (SoldItem item : salesList) {
            System.out.println(item);
        }
    }

    // Посчитать  сумму
    public double calculateTotalSales() {
        double total = 0;
        for (SoldItem item : salesList) {
            total += item.getPrice();
        }
        return total;
    }

    // Найти самый популярный товар
    public String findMostPopularItem() {
        if (salesList.isEmpty()) return "Нет продаж";

        Map<String, Integer> frequencyMap = new HashMap<>();

        // Считаем повторения
        for (SoldItem item : salesList) {
            frequencyMap.put(item.getName(), frequencyMap.getOrDefault(item.getName(), 0) + 1);
        }

        // Ищем максимум
        String mostPopular = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopular = entry.getKey();
            }
        }

        return mostPopular + " (продано " + maxCount + " раз)";
    }
}