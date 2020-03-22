package structural.builder;

/**
 * Created by @author Vladimir Poddubchak @date 03.03.2020.
 */

public class CardBuilder {
    private CardType type;
    private String name;
    private long id;
    private int discount;
    private String company;
    private String address;
    private String phone;
    private String eMail;

    public CardType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String geteMail() {
        return eMail;
    }

    private CardBuilder(Builder builder){
        this.type = builder.type;
        this.name = builder.name;
        this.id = builder.id;
        this.discount = builder.discount;
        this.company = builder.company;
        this.address = builder.address;
        this.phone = builder.phone;
        this.eMail = builder.eMail;


    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Type: "+type+"\n");
        str.append((name==null?"":"Name: "+name+"\n"));
        str.append((id==0?"":"Id: "+id+"\n"));
        str.append((company==null?"":"Company: "+company+"\n"));
        str.append((address==null?"":"Address: "+address+"\n"));
        str.append((phone==null?"":"Phone:"+phone+"\n"));
        str.append((eMail==null?"":"eMail:"+eMail+"\n"));
        str.append((discount==0?"":"Discount:"+discount+"\n"));
        return str.toString();
    }

    static class Builder{
        private CardType type;
        private String name;
        private long id;
        private int discount;
        private String company;
        private String address;
        private String phone;
        private String eMail;

        public Builder(CardType type) {
            this.type = type;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder seteMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public CardBuilder build(){
            return new CardBuilder(this);
        }
    }
}




