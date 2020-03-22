package creational;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public class Factory {
    Transport create(String type){
       switch (type){
           case "creational.Plane": return new Plane();
           case "creational.Train": return new Train();
           case "creational.Car": return new Car();
           default: return null;
       }
    }
}

interface Transport{
    void drive();
}

class Plane implements Transport{
    public void drive() {
        System.out.println("You drive a plane");
    }
}
class Train implements Transport{
    public void drive() {
        System.out.println("You drive a plane");
    }
}
class Car implements Transport{
    public void drive() {
        System.out.println("You drive a car");
    }
}