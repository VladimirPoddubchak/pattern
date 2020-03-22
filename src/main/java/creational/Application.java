package creational;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public class Application {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Transport myPlane = factory.create("creational.Plane");
        Transport myTrain = factory.create("creational.Train");
        Transport myCar = factory.create("creational.Car");

        myCar.drive();
        myPlane.drive();
        myTrain.drive();

        System.out.println("===================================");

        IFactory planeFactory = new AbstractFactory().createFactory("creational.PlaneFactory");
        IPlane mig = planeFactory.createPlane("creational.Mig");
        planeFactory.createPlane("creational.AirBus").fly();

        System.out.println("===================================");
        FactoryMethod factoryMethod = FactoryMethod.create();

        System.out.println("===================================");
        PSingleton singleton1 = PSingleton.getInstance("1111");
        PSingleton singleton2 = PSingleton.getInstance("2222");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);

        System.out.println("===================================");



        double f = 0.1d;
        System.out.println(f);

        DbI dbAdapter = new Adapter();
        dbAdapter.create();
        dbAdapter.read();
        dbAdapter.update();
        dbAdapter.delete();
    }

}
