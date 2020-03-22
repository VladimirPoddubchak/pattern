package creational;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public  class PSingleton {
    private PSingleton(String value){
        this.value = value;
    }
    private static PSingleton instance;
    public String value;
    synchronized public static PSingleton getInstance(String value){
        if (instance == null){
            instance = new PSingleton(value);
        }
        return instance;
    }
}
