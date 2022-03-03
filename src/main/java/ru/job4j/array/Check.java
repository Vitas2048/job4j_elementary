package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int countf = 0;
        int countt = 0;
       for (int i = 0; i <= data.length - 1; i++) {
           if (data[i]) {
               countt++;
           } else {
               countf++;
           }
       }
       if ((countf != data.length) && (countt != data.length)) {
           result = false;
       }
        return result;
    }
}