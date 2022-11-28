package dz3;
import java.lang.Math;
import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int [] mass = new int [4];
        for (int i = 0; i<4; i++){
            mass[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(mass));
        boolean flag = true;
        for (int i = 0; i<3; i++){
            if (mass[i+1]> mass[i]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else{
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
