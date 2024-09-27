package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int tempMax = a;
        if (b > tempMax) tempMax = b;
        if (c > tempMax) tempMax = c;
        if (d > tempMax) tempMax = d;
        return tempMax;
    }

}