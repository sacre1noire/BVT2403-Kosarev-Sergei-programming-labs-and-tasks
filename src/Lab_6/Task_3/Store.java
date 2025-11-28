package Lab_6.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<String, Integer> inventory;

    public Store() {
        inventory = new HashMap<>();
    }

    // Добавить товар на склад
    public void addItem(String itemName, int quantity) {
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
    }

    // Проверить, хватает ли товара
    public boolean hasSufficientStock(String itemName, int quantity) {
        return inventory.getOrDefault(itemName, 0) >= quantity;
    }

    // Списать товар со склада
    public void removeItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            if (currentQuantity <= quantity) {
                inventory.remove(itemName);
            } else {
                inventory.put(itemName, currentQuantity - quantity);
            }
        }
    }

    //посмотреть, что сейчас на складе
    @Override
    public String toString() {
        return "Склад: " + inventory.toString();
    }
}