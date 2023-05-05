public class CategoryEnum {
    public static void main(String[] args) {
        Category chosenCategory = Category.MEN;

        switch (chosenCategory) {
            case MEN: chosenCategory.price = 13.57; break;
            case WOMEN: chosenCategory.price = 20.45; break;
            case KID: chosenCategory.price = 45.6; break;
            case GRANDMA: chosenCategory.price = 56.67; break;
            case GRANDPA: chosenCategory.price = 3.56; break;
        }
        System.out.println(chosenCategory.price);
    }

    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA;
        double price;
    }
}
