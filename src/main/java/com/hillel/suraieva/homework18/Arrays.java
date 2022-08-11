package com.hillel.suraieva.homework18;

public class Arrays {

    public static int findNumber(int[] array, int look) {
        int number = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (look == array[i]) number = i;
            }

        }
        return number;
    }

    public static boolean isSort(int[] array) {
        boolean sort = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) sort = false;
        }
        return sort;
    }

}
