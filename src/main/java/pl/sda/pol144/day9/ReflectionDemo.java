package pl.sda.pol144.day9;

import pl.sda.pol144.day8.Customer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //Object obj = new LombokPerson("Ewa", "Kowal", null);
        Object obj = new Customer(1, "xxx", LocalDate.now());

        System.out.println("Lista pól");
        final Class<?> clazz = obj.getClass();
        final Field[] fields = clazz.getDeclaredFields();
        for(var field:fields){
            System.out.println(field.getName());
        }

        System.out.println("Lista metod");
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for(var method: declaredMethods){
            System.out.println(method.getName());
        }
        /*
            Przykład "włamania" do klasy za pomocą refkleksji, zmiana wartości pola prywatnego!
         */
        Customer customer = new Customer(1, "", null);
        System.out.println("Początkowy obiekt");
        System.out.println(customer);
        final Class<? extends Customer> customerClass = customer.getClass();
        final Field fieldName = customerClass.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(customer, "Karol");
        System.out.println("Obiekt o ustawieniu prywatnego pola name, które nie ma settera");
        System.out.println(customer);


    }
}
