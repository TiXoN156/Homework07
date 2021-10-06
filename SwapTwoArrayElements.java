package com.company;

public class SwapTwoArrayElements<T> {
    private T[] array;

    public SwapTwoArrayElements(T[] array) {
        this.array = array;
    }

    public SwapTwoArrayElements() {
    }

    public void swapTwoArrayElements(T[] array, int firstElement, int secondElement){
        T temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
