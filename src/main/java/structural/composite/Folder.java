package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class Folder implements MessageInterface {
    private String folderName;
    private List<Card> cards= new ArrayList<>();
    private List<Folder> folders = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addCard(Card card){
        cards.add(card);
        System.out.println("Card id:" + card.getId() + "added for "+ folderName);
    }
    public void removeCard(Card card){
        cards.remove(card);
        System.out.println("Card id:" + card.getId() +" removed from folder "+ folderName);
    }

    public void addFolder(Folder folder){
        folders.add(folder);
        System.out.println("Folder "+folder.folderName + " added to folder" +folderName);
    }
    public void removeFolder(Folder folder){
        folders.remove(folder);
        System.out.println("Folder "+folder.folderName + " removed from folder" +folderName);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("FolderName is:"+folderName);
        System.out.println("Folders in: " +folders.size());
        System.out.println("Cards in: " +cards.size());

        for(Card card: cards){card.sendMessage(msg);}
        for(Folder folder: folders){folder.sendMessage(msg);}


    }
}
