package entity;
import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase {

    private double discountPercentForAll;
    private final int AMOUNT_TO_GET_DISCOUNT = 5;

    public PercentDiscountPurchase(String purchaseName, Euro priceInEuro, int purchasedUnits, double discountPercentForAll){
        super(purchaseName, priceInEuro, purchasedUnits);
        this.discountPercentForAll = discountPercentForAll;
    }

    public double getDiscountPercentForAll() {
        return discountPercentForAll;
    }

    // дописать сканнер
    public PercentDiscountPurchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
        discountPercentForAll = scanner.nextDouble();
    }

//    public String toString(){
//        return super.toString() + ";" + getCost();
//    }

    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + discountPercentForAll;
    }


    // value - value * (percent/100) = value * (1 - percent / 100)
    @Override
    public Euro getCost() {
        if(purchasedUnits > AMOUNT_TO_GET_DISCOUNT){
            Euro bigValue = getPrice().mul(purchasedUnits);
            double discount = getDiscountPercentForAll()/100;
            Euro percentToEuro = bigValue.mul(discount);
         return bigValue.sub(percentToEuro);
        }
        else{
            return super.getCost();
        }
    }
}


