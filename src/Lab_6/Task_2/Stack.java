package Lab_6.Task_2;

import java.util.EmptyStackException;

public class Stack <T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        if (data.length>size) {
            data[size] = element;
            size += 1;
        } else throw new StackOverflowError();
    }

    public T pop() {
        if (size > 0) {
            T element = data[size - 1];
            size -= 1;
            return element;
        }
        else throw new EmptyStackException();
    }

    public T peek() {
        if(size>0){
            T element = data[size-1];
            return element;
        }
        else throw new EmptyStackException();
    }
}
