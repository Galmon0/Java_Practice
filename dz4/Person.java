package dz4;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void move(){
        System.out.println("Такой-то "+fullName+" ходит");
    }
    public void talk(){
        System.out.println("Такой-то "+fullName+" говорит");
    }
}
