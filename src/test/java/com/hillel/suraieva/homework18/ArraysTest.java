package com.hillel.suraieva.homework18;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    int[] array = {1, 2, 3, 4, 5, 6};
    int look = 4;

    //тестирует на правильном ли месте стоит заданный эллемент
    @Test
    public void number() {
        Assertions.assertEquals(3, Arrays.findNumber(array, look));
    }

    //тестирует отсортирован ли массив
    @Test
    public void sort() {
        Assertions.assertTrue(Arrays.isSort(array));
    }
}
