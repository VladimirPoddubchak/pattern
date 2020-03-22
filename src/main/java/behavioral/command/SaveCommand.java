package behavioral.command;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class SaveCommand extends Command {

    public SaveCommand(CardEditor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.saveCard();
    }
}
