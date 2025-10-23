package Lab_3.Task1;

public class Main {
    public static void main(String[] args) {
        // Создаём хэш-таблицу с ключами String и значениями Integer
        HashTable<String, Integer> table = new HashTable<>(10);

        //  Добавляем элементы
        table.put("apple", 5);
        table.put("banana", 3);
        table.put("orange", 7);

        System.out.println("Размер таблицы после добавления: " + table.getSize());

        //  Получаем значения
        System.out.println("Значение ключа 'apple': " + table.get("apple"));
        System.out.println("Значение ключа 'banana': " + table.get("banana"));

        //  Обновляем существующий ключ
        table.put("apple", 6);
        System.out.println("Значение ключа 'apple' после обновления: " + table.get("apple"));

        //  Проверяем, есть ли ключ
        System.out.println("Значение ключа 'pear' (нет в таблице): " + table.get("pear"));

        //  Удаляем элемент
        table.remove("banana");
        System.out.println("Размер таблицы после удаления 'banana': " + table.getSize());

        //  Проверяем пустая ли таблица
        System.out.println("Таблица пуста? " + table.isEmpty());

        //  Добавляем ещё один элемент
        table.put("pear", 2);
        System.out.println("Размер таблицы после добавления 'pear': " + table.getSize());
        System.out.println("Значение ключа 'pear': " + table.get("pear"));
    }
}
