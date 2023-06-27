package entity;

public class Euro {
    private int value;

    public Euro (int euro, int cents){
        this(euro * 100 + cents);
    }

    public Euro (Euro euro){
        this.value = euro.value;
    }

    public Euro(int value) {
        this.value = value;
    }

    public Euro add(Euro euro){
        value += euro.value;
        return this;
    }

    public Euro sub(Euro euro){
        value -= euro.value;
        return this;
    }

    public Euro mul(int k){
        value *= k;
        return this;
    }

    //добавить что-то?
    public Euro mul(double k){
        value = (int) (value * k);
        return this;
    }

     public int valueInCents(){
        return value;
    }

    public String toString() {
        return String.format("%d.%02d", value / 100, value % 100);
    }

    public boolean equals(Euro v){
        return v.valueInCents() == this.valueInCents();
    }

    public int compareTo(Euro euro){
        if (this.value > euro.valueInCents()){
            return 1;
        } else if (this.valueInCents() < euro.valueInCents()) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
