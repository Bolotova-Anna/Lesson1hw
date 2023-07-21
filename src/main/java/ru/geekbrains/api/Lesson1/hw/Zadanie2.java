package ru.geekbrains.api.Lesson1.hw;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("начинаем вводить последовательность: ");
        int sum = getSum(scaner);
        System.out.println("sum = " + sum);
    }

    /**
     * @param scaner
     * @return возвращаем сумму положительных чисел
     * @apiNote найти сумму положительных чисел, после которых следует отрицательное число
     */
    private static int getSum(Scanner scaner) {
        int a = scaner.nextInt();
        int sum = 0;
        while (a > 0 || a < 0) {
            int b = scaner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        return sum;
    }
}
