package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Attack on titan ", 160);
        Book book2 = new Book("Java for bveginners ", 455);
        Book book3 = new Book("Learning Java ", 998);
        Book book4 = new Book("Clean code ", 2);
        Book[] libBook = new Book[4];
        libBook[0] = book1;
        libBook[1] = book2;
        libBook[2] = book3;
        libBook[3] = book4;
        for (int i = 0; i < libBook.length; i++) {
            System.out.println(libBook[i].getName() + libBook[i].getPages() + "p");
        }
        Book res = new Book("", 0);
        res = book1;
        libBook[0] = libBook[3];
        libBook[3] = res;
        for (int i = 0; i < libBook.length; i++) {
            System.out.println(libBook[i].getName() + libBook[i].getPages() + "p");
        }
        for (int i = 0; i < libBook.length; i++) {
            if (libBook[i].getName().equals(libBook[0].getName())) {
                System.out.println(libBook[i].getName() + libBook[i].getPages() + "p");
            }
        }
    }
}
