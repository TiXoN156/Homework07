package com.company;

public class Main {

    public static void main(String[] args) {
        Object[] arrOfObjects = new Object[4];

        arrOfObjects[0] = new Cat();
        arrOfObjects[1] = new Device();
        arrOfObjects[2] = new Account();
        arrOfObjects[3] = new Employee();

        // Вывод начального массива объектов ссылочного типа для контроля
        for (int i = 0; i < arrOfObjects.length; i++) {
            System.out.println(arrOfObjects[i].toString());
        }

        SwapTwoArrayElements swapTwoArrayElements = new SwapTwoArrayElements();
        swapTwoArrayElements.swapTwoArrayElements(arrOfObjects, 1, 3);

        // Вывод массива объектов ссылочного типа со свапнутыми элементами
        for (int i = 0; i < arrOfObjects.length; i++) {
            System.out.println(arrOfObjects[i].toString());
        }
    }

}
