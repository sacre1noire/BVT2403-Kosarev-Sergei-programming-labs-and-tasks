package Lab_3.Task1;

import java.util.LinkedList;


public class HashTable<K,V>{
    private int capacity;
    private int size;
    private LinkedList <Entry<K,V>>[] table;
    @SuppressWarnings("unchecked")
    public HashTable(int capacity){
        this.size=0;
        this.table= (LinkedList<Entry<K,V>>[]) new LinkedList[capacity] ;
        this.capacity=capacity;
    }
    private int hash(K key){
        return Math.abs(key.hashCode())% capacity;
    }
    private static class Entry<K,V>{
        private K key;
        private V value;

        public Entry(K key,V value){
            this.value=value;
            this.key=key;
        }
        public K getKey() {return key;}
        public V getValue() {return value;}

        public void setValue(V value){this.value=value;}
    }
    public void put(K key,V value){
        int index = hash(key);

        if (table[index] == null){
            table[index] = new LinkedList<>();
        }
        for (Entry<K,V> entry: table[index]){
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].add (new Entry<>(key,value));
        size++;
    }

    public V get (K key){
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        for (Entry<K,V> entry: table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
    return null;
    }

    public void remove(K key){
        int index = hash(key);
        if (table[index] == null){
            return;
        }
         for (Entry<K,V> entry : table[index]){
             if(entry.getKey().equals(key)){
                 table[index].remove(entry);
                 size--;
                 return;
             }
         }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }
}
