package Dz6;
interface Convertable {
    double convert();
}
class Kelvin implements Convertable{
    double temp1;
    double temp2;

    public Kelvin(double temp1) {
        this.temp1 = temp1;
        this.temp2 = temp2;
    }

    public double convert(){
        temp2 = temp1 + 273;
        return (temp2);
    }

    public double getTemp1() {
        return temp1;
    }

    public void setTemp1(double temp1) {
        this.temp1 = temp1;
    }

    public double getTemp2() {
        return temp2;
    }

    public void setTemp2(double temp2) {
        this.temp2 = temp2;
    }
}
class Faren implements Convertable{
    double temp1;
    double temp3;

    public Faren(double temp1) {
        this.temp1 = temp1;
        this.temp3 = temp3;
    }

    public double convert(){
        temp3 = temp1*9/5+32;
        return temp3;
    }

    public double getTemp1() {
        return temp1;
    }

    public void setTemp1(double temp1) {
        this.temp1 = temp1;
    }

    public double getTemp3() {
        return temp3;
    }

    public void setTemp3(double temp3) {
        this.temp3 = temp3;
    }
}
class Tester{
    public static void main(String[] args) {
        Kelvin k1 = new Kelvin(200);
        Faren f1 = new Faren(50);
        System.out.println("Температура по Цельсию "+k1.temp1+" = "+k1.convert()+" по Кельвину");
        System.out.println("Температура по Цельсию "+f1.temp1+" = "+f1.convert()+" по Фаренгейту");
    }
}
