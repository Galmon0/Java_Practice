package dz4;

public abstract class Transport {
    public double distanse;

    public double speed;

    public double coefficient;

    public Transport(double distanse, double speed, double coefficient) {
        this.distanse = distanse;
        this.speed = speed;
        this.coefficient = coefficient;
    }

    public double getDistanse() {
        return distanse;
    }

    public void setDistanse(double distanse) {
        this.distanse = distanse;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double get_Cost_passenger(){
        double cost_passenger;
        cost_passenger = 10*coefficient;
        return cost_passenger;
    }
    public double get_Cost_cargo(){
        double cost_cargo;
        cost_cargo = coefficient;
        return cost_cargo;
    }
    public double get_Time(){
        double time;
        time = distanse/speed;
        return time;
    }
}

class Auto extends Transport{

    public Auto(double distanse, double speed, double coefficient) {
        super(distanse, speed, coefficient);
    }
}
class Airplane extends Transport{

    public Airplane(double distanse, double speed, double coefficient) {
        super(distanse, speed, coefficient);
    }
}
class Train extends Transport{

    public Train(double distanse, double speed, double coefficient) {
        super(distanse, speed, coefficient);
    }
}
class Ship extends Transport{

    public Ship(double distanse, double speed, double coefficient) {
        super(distanse, speed, coefficient);
    }
}
