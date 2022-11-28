package dz2;

import java.util.Arrays;

public class eighth {
    public static void main(String[] args) {
        String [] slova = {"pesny","cubok","kak","cola","pc","mac","kfc"};
        String tmp;
        int lenghtt = slova.length;
        for (int i=0;i< lenghtt/2;i++){
            tmp = slova[i];
            slova[i] = slova [lenghtt-i-1];
            slova[lenghtt-i-1] = tmp;
        }
        System.out.println(Arrays.toString(slova));
    }
}
