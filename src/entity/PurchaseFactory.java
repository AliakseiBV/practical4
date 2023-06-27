package entity;
import java.util.Scanner;
public class PurchaseFactory {
    private enum PurchaseKind {
        GENERAL_PURCHASE,
        PRICE_DISCOUNT_PURCHASE,
        PERCENT_DISCOUNT_PURCHASE,
    }

    public static Purchase getPurchaseFromFactory(Scanner scanner) {
        String id = scanner.next();
        PurchaseKind kind = PurchaseKind.valueOf(id);
        switch (kind) {
            case GENERAL_PURCHASE:
                return new Purchase(scanner);
            case PRICE_DISCOUNT_PURCHASE:
                return new PriceDiscountPurchase(scanner);
            case PERCENT_DISCOUNT_PURCHASE:
                return new PercentDiscountPurchase(scanner);
            default:
                throw new IllegalArgumentException();
        }
    }
}