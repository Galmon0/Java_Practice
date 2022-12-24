package Dz28;

import java.util.Map;
import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        Map<Double, String> passport = new HashMap<Double,String>();
        passport.put(0.111, "Ламонов С.А.");
        passport.put(0.2192, "Газуев А.Е.");
        passport.put(0.232, "Шурышкин П.Ш.");
        System.out.println(passport);
        System.out.println(passport.get(0.2192));
        System.out.println(passport.entrySet());
        System.out.println(passport.keySet());
        System.out.println(passport.values());
    }
}