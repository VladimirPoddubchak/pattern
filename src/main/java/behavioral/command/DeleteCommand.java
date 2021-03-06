package behavioral.command;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class DeleteCommand extends Command {

    public DeleteCommand(CardEditor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.deleteCard();
    }
}
