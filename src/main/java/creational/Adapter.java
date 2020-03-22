package creational;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class Adapter extends DatabaseClient implements DbI{
    @Override
    public void create() {
        insert();
    }

    @Override
    public void read() {
        select();
    }

    @Override
    public void update() {
        edit();
    }

    @Override
    public void delete() {
        remove();
    }
}
interface DbI{
    void create();
    void read();
    void update();
    void delete();
}

class DatabaseClient{
    void insert(){ System.out.println("Inserting... ");}
    void edit(){ System.out.println("Editing... ");}
    void select(){ System.out.println("Selecting... ");}
    void remove(){ System.out.println("Removing... ");}
}