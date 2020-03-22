package creational;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public class AbstractFactory {
    IFactory createFactory(String factoryType){
        switch (factoryType){
            case "creational.CarFactory": return  new CarFactory();
            case "creational.PlaneFactory": return new PlaneFactory();
            default: return null;
        }
    }
}
interface IFactory{
    ICar createCar(String type);
    IPlane createPlane(String type);
}

class CarFactory implements IFactory{
    @Override
    public ICar createCar(String type) {
        switch (type){
            case "creational.Truck": return new Truck();
            case "creational.SportCar": return new SportCar();
            default: return null;
        }
    }
    @Override
    public IPlane createPlane(String type) {
        return null;
    }
}

class PlaneFactory implements IFactory{
    @Override
    public IPlane createPlane(String type) {
        switch (type){
            case "creational.AirBus": return new AirBus();
            case "creational.Mig": return new Mig();
            default: return null;
        }
    }
    @Override
    public ICar createCar(String type) {
        return null;
    }
}

interface ICar{
    void drive();
}


class Truck implements ICar{
    @Override
    public void drive() {
        System.out.println("You drive a truck");
    }
}
class SportCar implements ICar{
    @Override
    public void drive() {
        System.out.println("You drive a sportcar");
    }
}

interface IPlane{
    void fly();
}
class AirBus implements IPlane{
    @Override
    public void fly() {
        System.out.println("You fly on creational.AirBus");
    }
}
class Mig implements IPlane{
    @Override
    public void fly() {
        System.out.println("You fly on creational.Mig");
    }
}