package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i1 = 0;
        for (int i = 0; i < post.length; i++) {
            i1 = i;
            if (post[post.length - i - 1] != word[word.length - i - 1]) {
                result = false;
                break;
            }
            }
        if (i1 > 0) {
            result = true;
        }
        return result;
    }
}