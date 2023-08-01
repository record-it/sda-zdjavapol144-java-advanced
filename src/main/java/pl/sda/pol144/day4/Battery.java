package pl.sda.pol144.day4;
//
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
        if (energy < 0){
            throw new IllegalArgumentException("Energia musi być większa do 0!");
        }
        if (energy > level){
            int temp = level;
            level = 0;
            return temp;
        }
        level -= energy;
        return energy;
    }

    public int getLevel() {
        return level;
    }
}

