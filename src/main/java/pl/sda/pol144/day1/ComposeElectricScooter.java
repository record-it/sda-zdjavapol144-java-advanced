package pl.sda.pol144.day1;

public class ComposeElectricScooter {
    private final Battery battery;

    public ComposeElectricScooter(Battery battery) {
        this.battery = battery;
    }

    public void recharge(){
        battery.recharge();
    }


}
