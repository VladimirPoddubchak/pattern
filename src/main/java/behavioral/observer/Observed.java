package behavioral.observer;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
}
