package behavioral.command;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class CommandApp {
    public static void main(String[] args) {
        CardEditor editor = new CardEditor();
        Command create =new CreateCommand(editor);
        Command edit =new EditCommand(editor);
        Command save =new SaveCommand(editor);
        Command delete =new DeleteCommand(editor);


        create.execute();
        edit.execute();
        save.execute();
        delete.execute();
    }
}
