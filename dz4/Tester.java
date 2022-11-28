package dz4;

public class Tester {
    public static void main(String[] args) {
        Person k1 = new Person("Лазарев Анатолий", 22);
        Person k2 = new Person();
        k1.move();
        k1.talk();
        k2.move();
        k2.talk();
    }
}
