package behavioral.iterator;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class IteratorApp {
    public static void main(String[] args) {
        String[] datas = {"Name: Vlad","Mobile: +7(123)456-78-90","eMail: vlad123@mail.com"};
        Card card =new Card(1,datas);

        MyIteratorInterface iterator = card.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        };
    }
}
