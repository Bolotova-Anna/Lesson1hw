package ru.geekbrains.api.Lesson1.hw;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while(str.contains("  ")) {
            String str1 = str.replace("  ", " ");
            str=str1;
        }
        String res = getRes(str);
        System.out.println("res = " + res);
    }

    /**
     * @param str исходная строка, вводимая с терминала
     * @return возвращенная перевернутая строка
     * @apiNote задача на переворачивание строки
     */
    private static String getRes(String str) {
        String[] words = str.split(" ");
        String res = "";
        for (int i = 0; i < words.length / 2; i++) {
            String some = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = some;
        }
        for (int j = 0; j < words.length; j++) {
            res += " " + words[j];
        }
        return res;
    }

}
