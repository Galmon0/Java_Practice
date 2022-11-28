package dz3;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число >=1");
        int num = sc.nextInt();
        while (num < 1) {
            num = sc.nextInt();
        }
        int[] mass = new int[num];
        for (int i = 0; i < num; i++) {
            mass[i] = (int) (Math.random() * (num + 1));
        }
        System.out.println(Arrays.toString(mass));
        if (num % 2 == 0) {
            int[] mass2 = new int[(num / 2)];
            for (int i = 0; i < num / 2; i++) {
                mass2[i] = mass[i * 2];
            }
            System.out.println(Arrays.toString(mass2));
        }
        if (num % 2 == 1) {
            int[] mass2 = new int[(num / 2) + 1];
            for (int i = 0; i < num / 2 + 1; i++) {
                mass2[i] = mass[i * 2];
            }
            System.out.println(Arrays.toString(mass2));
        }
    }
}
