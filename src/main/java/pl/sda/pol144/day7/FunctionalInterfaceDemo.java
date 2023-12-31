package pl.sda.pol144.day7;

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        Operation dodawanie = new Operation(){

            @Override
            public double apply(double a, double b) {
                return a + b;
            }
        };

        System.out.println("Dodawanie : " + dodawanie.apply(4, 5));

        Operation dodawanieLambda = (x, y) -> x + y;
        Operation odejmowanieLambda = (x, y) -> x - y;
        dodawanie = (a, b) -> a * b;
        System.out.println(obliczDziałanie(dodawanieLambda, 5, 3));

        OperationGeneric<Double> add = (a, b) -> a + b;
        OperationGeneric<Integer> addInteger = (a, b) -> a + b;
    }

    public static double obliczDziałanie(Operation op, double a, double b){
        return op.apply(a, b);
    }
}
