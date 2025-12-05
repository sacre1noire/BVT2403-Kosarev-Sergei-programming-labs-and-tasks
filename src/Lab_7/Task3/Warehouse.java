package Lab_7.Task3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private ArrayList<Product> realStock;
    private ArrayList<Product> readOnlyList;

    public Warehouse(ArrayList<Product> list){
        this.realStock = list;
        this.readOnlyList = new ArrayList<>(list);
    }

    public void addProduct(Product product){
        realStock.add(product);
    }

    public List<Product> getProducts(int start, int end){
        return readOnlyList.subList(start, end);
    }

    public synchronized void removeProduct(Product product){
        realStock.remove(product);
    }

    public int getSize(){
        return readOnlyList.size();
    }
}