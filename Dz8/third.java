package Dz8;

public class third {
    public static String third_A_B(int a, int b){
        if (a ==b){
            return Integer.toString(a);
        }
        if (a<b){
            return a + " " + third_A_B(a + 1, b);
        }
        if (a>b) {
            return a + " " + third_A_B(a - 1, b);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(third_A_B(15,10));
    }
}
