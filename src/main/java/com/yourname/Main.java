package com.yourname;

public class Main {

    public static void main(String[] args){

        int i = 214748364;
        short k = 10;
        double d = 12.5;
        long a = 949683394;
        byte g = 64;
        char ch = 'G';
        int sum, sub;

        d = i;
        a = g;
        a = ch;
        g = (byte) i;
        i = (int) d;
        d = (double) a;

        // Арифметические операторы.

        int i1 = 2147483647;
        i1++;
        System.out.println(i1);

        int i2 = -2147483648;
        i2--;
        System.out.println(i2);

        sum = 20 + 5;
        sub = 15 - 10;
        System.out.println(sum);
        System.out.println(sub);

        double d1 = 5.5 / 2;
        System.out.println(d1);

        double d2 = 5.5 * 3;
        System.out.println(d2);

        byte b1 = 32;
        b1 += 1;
        System.out.println(b1);

        short s1 = 2;
        s1 -= 3;
        System.out.println(s1);

        int i5 = 5;
        float f3 = 2.6f;
        float result = i5 / f3;
        System.out.print("result : " + result);

        int s2 = -32000;
        int s2abs = Math.abs(s2);
        System.out.println(s2abs);

        System.out.println(i);
        System.out.println(d);
        System.out.println(a);
        System.out.println(g);
        System.out.println(ch);

    }

}