package structural.decorator;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class BirthdayCard extends CardDecorator {

    public BirthdayCard(MessageInterface card) {
        super(card);
    }

    public String sendBirthdayMessage(){
        return "Happy Birthday!!!";
    }

    @Override
    public String sendMessage() {
        return super.sendMessage() + sendBirthdayMessage();
    }
}
