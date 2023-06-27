package entity;
import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {
     private Euro discountForUnit;
    public PriceDiscountPurchase(String purchaseName, Euro priceInEuro, int purchasedUnits, Euro discountForUnit){
        super(purchaseName,priceInEuro, purchasedUnits);
        this.discountForUnit = discountForUnit;
    }
// дописать сканнер
    public PriceDiscountPurchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
        discountForUnit = new Euro(scanner.nextInt());
    }

    public Euro getDiscountForUnit() {
        return discountForUnit;
    }
    public void setDiscountForUnit(Euro discountForUnit) {
        this.discountForUnit = discountForUnit;
    }

    // нормально ли работает? дописать?
    public Euro getCost(){
        return getPrice().sub(getDiscountForUnit()).mul(purchasedUnits);
    }

    //    public String toString(){
//        return super.toString() + ";" + discountForUnit;
//    }

    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + discountForUnit;
    }


}
