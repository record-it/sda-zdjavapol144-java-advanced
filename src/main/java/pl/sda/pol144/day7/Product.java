package pl.sda.pol144.day7;

public class Product {
    String name;

    Tax tax;

    double price;       // powinno być BigDecimal

    public Product(String name, Tax tax, double price) {
        this.name = name;
        this.tax = tax;
        this.price = price;
    }

    public double bruttoPrice(){    // powinno zwracać BigDecimal
        return price + tax.apply(price);
    }
}
