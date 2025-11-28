package Lab_6.Task_3;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем склад и завозим товары
        Store myStore = new Store();
        myStore.addItem("Телефон", 5);
        myStore.addItem("Ноутбук", 2);
        myStore.addItem("Наушники", 10);

        System.out.println("1. " + myStore); // Покажем склад до продаж

        // 2. Создаем журнал продаж, привязанный к складу
        SalesLog log = new SalesLog(myStore);

        System.out.println("\nВыполняется продажа");
        // 3. Совершаем продажи
        log.addSale("Телефон", 50000, 2);
        log.addSale("Наушники", 3000, 5);
        log.addSale("Телефон", 50000, 4);
        log.addSale("Наушники", 3000, 2);

        // 4. Выводим отчеты
        log.displaySales();

        System.out.println("\nИтоги");
        System.out.println(" Общая сумма: " + log.calculateTotalSales());
        System.out.println(" Популярный товар: " + log.findMostPopularItem());

        System.out.println("\n2. " + myStore); // Покажем склад после продаж
    }
}