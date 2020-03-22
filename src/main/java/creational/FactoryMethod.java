package creational;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public class FactoryMethod {
    private FactoryMethod(){}

    public static FactoryMethod create(){
        System.out.println("creational.FactoryMethod is created");
        return new FactoryMethod();
    }
}
