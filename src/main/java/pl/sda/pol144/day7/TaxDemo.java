package pl.sda.pol144.day7;

import java.util.ArrayList;
import java.util.List;

public class TaxDemo {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        // price * 0.23
        products.add(new Product("maka", (price) -> price * 0.23, 3.45));
        products.add(new Product("książka", p ->  p * 0.08, 123));
        double bruttoSum = 0;
        // obliczanie sumy brutto za pomocą klasycznej pętli for each
        for(var product: products){
            bruttoSum += product.bruttoPrice();
        }
        System.out.println("Suma brutto: " + bruttoSum);
        for(var product: products){
            if (product.name.equals("ksiażka") && product.price < 100){
                System.out.println("Jest: ");
            }
        }
        // obliczanie sumy brutto za pomocą strumienia
        products.stream().mapToDouble(product -> product.bruttoPrice()).sum();
    }
}
