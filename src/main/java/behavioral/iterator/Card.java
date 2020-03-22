package behavioral.iterator;

/**
 * Created by @author Vladimir Poddubchak @date 17.03.2020.
 */

public class Card implements MyCollectionInterface{
    private int cardId;
    private String[] datas;

    public Card(int cardId, String[] datas) {
        this.cardId = cardId;
        this.datas = datas;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String[] getDatas() {
        return datas;
    }

    public void setDatas(String[] datas) {
        this.datas = datas;
    }

    @Override
    public MyIteratorInterface getIterator() {
        return new DatasIterator();
    }

    private class DatasIterator implements MyIteratorInterface{
        int index;

        @Override
        public boolean hasNext() {
            return (index<datas.length?true:false);
        }

        @Override
        public Object next() {
            return datas[index++];
        }
    }


}
