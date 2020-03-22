package behavioral.command;

import structural.flyweight.Card;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public abstract class Command {
    public CardEditor editor;

    public Command(CardEditor editor) {
        this.editor = editor;
    }

    public abstract void execute();
}
