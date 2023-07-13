package pl.sda.pol144.day1;

public class ComposeElectricScooter extends Vehicle{
    private final Battery battery;

    public ComposeElectricScooter(Battery battery) {
        this.battery = battery;
    }

    public void recharge(){
        battery.recharge();
    }

    public int getBatteryCapacity(){
        return battery.capacity;
    }

    public Battery getBattery(){
        return battery;
    }
}
