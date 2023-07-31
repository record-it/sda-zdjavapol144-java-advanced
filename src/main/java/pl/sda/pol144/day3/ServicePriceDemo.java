package pl.sda.pol144.day3;

class CleaningService implements ServicePrice{
    int hours;
    double pricePerHour;

    public CleaningService(int hours, double pricePerHour) {
        this.hours = hours;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double price() {
        return hours * pricePerHour;
    }
}
public class ServicePriceDemo {
    public static void main(String[] args) {
        ServicePrice[] prices = new ServicePrice[5];
        prices[0] = new CleaningService(5, 50);
        // poniżej obiekt klasu anonimowej, który oblicza to samo co CleaningService
        prices[1] = new ServicePrice() {
            @Override
            public double price() {
                return 5 * 50;
            }
        };
        prices[2] = new ServicePrice() {
            @Override
            public double price() {
                return 100 + 3 * 4 * 45;
            }
        };

        // zaimplementuj klasę anonimową, która obliczy cenę na podstawie powierzchni 34,
        // której koszt za 1m2 wynosi 4.5
        prices[3] = new ServicePrice() {
            @Override
            public double price() {
                return 34 * 4.5;
            }
        };

        double sum = 0;
        for(var item: prices){
            if (item != null) {
                sum += item.price();
            }
        }
        System.out.println("Suma kosztów usług: " + sum);

    }
}
