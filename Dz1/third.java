package Dz1;

public class third {
    public static void main(String[] args) {
        int [] mass = {1,5,7,3,5,11,2,9,35,10};
        int summ =0 ;
        double avarage = 0;
        for (int i=0; i<mass.length; i++){
            summ +=mass[i];
        }
        avarage = summ/ mass.length;
        System.out.println(summ);
        System.out.println(avarage);
    }
}
