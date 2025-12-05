package Lab_7.Task3;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product(50, "USB Flash Drive 64GB");
        Product product2 = new Product(75, "Wireless Mouse Receiver");
        Product product3 = new Product(15, "CPU Thermal Paste");
        Product product4 = new Product(65, "Ethernet Cable Coupler");
        Product product5 = new Product(10, "Cable Ties Set (20pcs)");
        Product product6 = new Product(45, "Small Microfiber Cloth");
        Product product7 = new Product(20, "Webcam Lens Cover");
        Product product8 = new Product(80, "Laptop Stand Feet (Set of 4)");
        Product product9 = new Product(30, "M.2 SSD Screw Set");
        Product product10 = new Product(55, "USB-C to USB-A Adapter");
        Product product11 = new Product(70, "Portable Mini Fan (USB)");
        Product product12 = new Product(40, "MicroSD Card 128GB");
        Product product13 = new Product(25, "Keyboard Keycap Puller");
        Product product14 = new Product(60, "Audio Jack Splitter");
        Product product15 = new Product(35, "HDMI Port Dust Plugs");

        ArrayList<Product> warehouselist = new ArrayList<>();

        warehouselist.add(product1);
        warehouselist.add(product2);
        warehouselist.add(product3);
        warehouselist.add(product4);
        warehouselist.add(product5);
        warehouselist.add(product6);
        warehouselist.add(product7);
        warehouselist.add(product8);
        warehouselist.add(product9);
        warehouselist.add(product10);
        warehouselist.add(product11);
        warehouselist.add(product12);
        warehouselist.add(product13);
        warehouselist.add(product14);
        warehouselist.add(product15);
        Warehouse warehouse = new Warehouse(warehouselist);

        RecursiveTransfer.reset();

        System.out.println(" Начало переноса товаров \n");

        ForkJoinPool pool = new ForkJoinPool(3);
        RecursiveTransfer mainTask = new RecursiveTransfer(0, warehouse.getSize(), warehouse);
        pool.invoke(mainTask);

        System.out.println("\n Все товары перенесены ");
        pool.shutdown();
    }
}
