package pl.sda.pol144.day1;

public class Battery {
    public final int capacity;

    private int level;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public void recharge(){
        level = capacity;
    }

    public int consume(int energy){
        // TODO dopisać logikę
        level -= energy;
        return energy;
    }
    public int getLevel() {
        return level;
    }
}
