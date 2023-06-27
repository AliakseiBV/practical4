package entity;

import java.util.Scanner;

public class Purchase {
    public String purchaseName;
    public Euro price;
    public int purchasedUnits;

    public Purchase(String purchaseName, Euro priceInEuro, int purchasedUnits) {
        this.purchaseName = purchaseName;
        this.price = priceInEuro;
        this.purchasedUnits = purchasedUnits;
    }
    public Purchase() {
        this.purchaseName = "Cabernet Sauvignon";
        this.price = new Euro (150);
        this.purchasedUnits = 1;
    }

// constructor of reading from an instance of the class Scanner.
    public Purchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public Euro getPrice() {
        return price;
    }

    public void setPrice(Euro price) {
        this.price = price;
    }

    public int getPurchasedUnits() {
        return purchasedUnits;
    }

    public void setPurchasedUnits(int purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }

    public Euro getCost(){
        return getPrice().mul(getPurchasedUnits());
    }

    public String toString(){
        return getClass().getSimpleName() + ";" +  purchaseName + ";" + price + ";" + purchasedUnits + ";" + getCost();
    }

    protected String fieldsToString() {
        return getClass().getSimpleName() + ";" + purchaseName + ";" + price + ";" + purchasedUnits;
    }

    public boolean equals(Purchase purchase){
        return this.purchaseName == purchase.purchaseName &&
                this.price == purchase.price;
    }


    public Purchase withMaxCost(Purchase somePurchase){
        if(this.getCost().compareTo(somePurchase.getCost()) == 1){
            return this;
        }
        else{
            return somePurchase;
        }
    }



}
