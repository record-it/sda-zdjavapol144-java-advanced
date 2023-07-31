package pl.sda.pol144.day3;

public class OuterClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(5);
        OuterClass.NestedInnerClass nested = new OuterClass.NestedInnerClass("xyz");
        outer.printName(nested);
        nested.printCounter(outer);

    }
}
