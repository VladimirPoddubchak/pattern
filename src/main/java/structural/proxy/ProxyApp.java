package structural.proxy;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class ProxyApp {
    public static void main(String[] args) throws InterruptedException {
        int cardsNumber = 50;
        int testCycles = 100;


        RemoteCatalog remoteCatalog = new RemoteCatalog();
        remoteCatalog.init(cardsNumber);
        System.out.println("Remote catalog test time:" + test(remoteCatalog,cardsNumber,testCycles));


        ProxyCatalog proxyCatalog = new ProxyCatalog();
        System.out.println("Remote catalog test time:" + test(proxyCatalog,cardsNumber,testCycles));

    }
    private static long test(Catalog catalog, int size, int cycles){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<cycles;i++){
            catalog.getCard((int)(Math.random()*(size)));
        }
        long finishTime = System.currentTimeMillis();
        return finishTime-startTime;
    }
}
