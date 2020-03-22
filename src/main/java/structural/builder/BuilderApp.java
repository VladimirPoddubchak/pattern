package structural.builder;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class BuilderApp {
    public static void main(String[] args) {
        CardBuilder privateCard = new CardBuilder.Builder(CardType.PRIVATE)
                .setName("Name")
                .setAddress("Address")
                .setPhone("Phone")
                .seteMail("EMail")
                .build();

        CardBuilder discountCard = new CardBuilder.Builder(CardType.DISCOUNT)
                .setId(11111)
                .setDiscount(25)
                .setCompany("Company")
                .setAddress("Address")
                .setPhone("Phone")
                .seteMail("EMail")
                .build();

        System.out.println(privateCard.toString());
        System.out.println(discountCard.toString());
    }
}
