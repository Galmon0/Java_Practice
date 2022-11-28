package dz2;

class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX(){return x;}

    public double getY(){return y;}

    public void setX(double x){this.x = x;}

    public void setY(double y){this.y = y;}

    public void setXY(double x,double y){this.x = x; this.y = y;}

    public void move(double xDisp, double yDisp){x += xDisp; y += yDisp;}

    public  String toString(){
        return "Ball{" +
                "x = " + x +
                ", y = " + y +'\'' +
                '}';
    }
}

class TestBall {
    public TestBall() {
        Ball k1 = new Ball(0.0, 0.0);
        System.out.println(k1.getX());
        k1.setXY(2.0, 2.5);
        System.out.println(k1.toString());
        k1.move(5.0, 3.0);
        System.out.println(k1.toString());
    }
}
public class second{
    public static void main(String[] args) {
        new TestBall();
    }
}