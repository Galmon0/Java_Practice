package Dz1;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mass = new int[10];
        int summ = 0;
        int chet = 0;
        int min = 99999;
        int max = -99999;
        do {
            mass[chet] = sc.nextInt();
            summ += mass[chet];
            if (mass[chet]>max) {
                max = mass[chet];
            }
            if (mass[chet]<min){
                min = mass[chet];
            }
            chet++;
        }
        while (chet != 9);
        System.out.println(summ);
        System.out.println(min);
        System.out.println(max);
    }

}
