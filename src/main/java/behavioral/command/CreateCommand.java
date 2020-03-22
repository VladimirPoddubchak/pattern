package behavioral.command;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class CreateCommand extends Command {

    public CreateCommand(CardEditor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.newCard();
    }
}
