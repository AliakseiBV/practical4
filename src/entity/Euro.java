package entity;

public class Euro {
    private int valueInCents;
    public Euro(){
        this.valueInCents = 100;
    }
    public Euro(int valueInCents) {
        this.valueInCents = valueInCents;
    }


    private static String centsToEuro(int amount) {
        return String.format("%d.%02d", amount / 100, amount % 100);
    }

    public String toString(){
        return centsToEuro(valueInCents);
    }

    public int getValueInCents() {
        return valueInCents;
    }

    public String equalsTo(Euro v){
        if (v.getValueInCents() == this.valueInCents){
            return "true";
        }
        else{
            return "false";
        }
    }

    public int compareTo(Euro euro){
        if (this.valueInCents > euro.valueInCents){
            return 1;
        } else if (this.valueInCents < euro.valueInCents) {
            return -1;
        }
        else{
            return 0;
        }
    }





}
