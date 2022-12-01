package Dz8;

public class second {
    public static String second_1_n(int n){
        if (n == 1){
            return ("1");
        }
        return second_1_n(n-1) + " " + n;
    }

    public static void main(String[] args) {
        System.out.println(second_1_n(10));
    }
}
