package behavioral.command;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class EditCommand extends Command {

    public EditCommand(CardEditor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.editCard();
    }
}
