package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {
                if (i >= (array.length) / 2) {
                    break;
                }
                    } else {
                    if (i > (array.length - 1) / 2) {
                        break;
                    }
                }
                int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
