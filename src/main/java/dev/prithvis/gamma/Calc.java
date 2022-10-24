package dev.prithvis.gamma;

public class Calc {
    private int increment;
    public Calc(){
        this.increment=1;
    }
    public Calc(int increment){
        this.increment=increment;
    }
    public int returnWithIncrement(int number){
        return number+this.increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getIncrement() {
        return increment;
    }
}
