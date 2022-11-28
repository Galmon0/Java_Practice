package dz3;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class first {
    public static void main(String[] args) {
        double [] mass = new double [100];
        for (int i = 0; i<50;i++){
            mass[i] = Math.random()*(100+1);
        }
        Random random = new Random();
        for (int i = 50; i<100;i++){
            mass[i] = random.nextDouble(100+1);
        }
        System.out.println(Arrays.toString(mass));
        double tmp;
        for (int i = 0; i<100; i++){
            for (int j = 0; j<100-1-i; j++){
                if (mass[j]>mass[j+1]){
                    tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
