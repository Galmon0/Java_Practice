package dz4;

public class Tester2 {
    public static void main(String[] args) {
        Auto auto = new Auto(1000,100,5);
        Airplane airplane = new Airplane(1000,500,10);
        Train train = new Train(1000,50,3);
        Ship ship = new Ship(1000, 25,1);
        System.out.println("Время пути : "+ auto.get_Time()+" Часов"+'\n'+"Стоимость перевозки пассажира : "+auto.get_Cost_passenger()+" т. Рублей"+'\n'+"Стоимость перевозки груза : "+auto.get_Cost_cargo()+" т. Рублей за кг");
        System.out.println("Время пути : "+ airplane.get_Time()+" Часов"+'\n'+"Стоимость перевозки пассажира : "+airplane.get_Cost_passenger()+" т. Рублей"+'\n'+"Стоимость перевозки груза : "+airplane.get_Cost_cargo()+" т. Рублей за кг");
        System.out.println("Время пути : "+ train.get_Time()+" Часов"+'\n'+"Стоимость перевозки пассажира : "+train.get_Cost_passenger()+" т. Рублей"+'\n'+"Стоимость перевозки груза : "+train.get_Cost_cargo()+" т. Рублей за кг");
        System.out.println("Время пути : "+ ship.get_Time()+" Часов"+'\n'+"Стоимость перевозки пассажира : "+ship.get_Cost_passenger()+" т. Рублей"+'\n'+"Стоимость перевозки груза : "+ship.get_Cost_cargo()+" т. Рублей за кг");
    }
}
