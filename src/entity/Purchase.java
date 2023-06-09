package entity;

public class Purchase {
    public String purchaseName;
    public double priceInEuro;
    // добавить метод 'euro to cents' в Euro?
    // так как есть пока только 'cents to euro'
    public int purchasedUnits;

    public Purchase(String purchaseName, double priceInEuro, int purchasedUnits) {
        this.purchaseName = purchaseName;
        this.priceInEuro = priceInEuro;
        this.purchasedUnits = purchasedUnits;
    }
    public Purchase() {
        this.purchaseName = "Suluguni";
        this.priceInEuro = 2.00;
        this.purchasedUnits = 1;
    }
// constructor of reading from an instance of the class Scanner.
//    public readingFromScanner(String purchaseName, double priceInEuro, int purchasedUnits) {
//        this.purchaseName = ;
//        this.priceInEuro = ;
//        this.purchasedUnits = ;
//    }


    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public int getPurchasedUnits() {
        return purchasedUnits;
    }

    public void setPurchasedUnits(int purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }

//    public Euro getCost(){
//        return
//    }


//    public String toString(){
//        return
//    }

    public boolean equals(Purchase purchase){
        if (this.purchaseName == purchase.purchaseName &&
                this.priceInEuro == purchase.priceInEuro){
            return true;
        }else{
            return false;
        }
    }

}
