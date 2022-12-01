package Dz8;

public class fifth {
    public static int fifth_summ(int n){
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + fifth_summ(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(fifth_summ(295));
    }
}
