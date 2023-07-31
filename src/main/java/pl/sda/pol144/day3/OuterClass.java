package pl.sda.pol144.day3;

public class OuterClass {
    private int counter;

    public OuterClass(int counter) {
        this.counter = counter;
    }

    static class NestedInnerClass{
        private String name;

        public NestedInnerClass(String name) {
            this.name = name;
        }

        public void printCounter(OuterClass outer){
            System.out.println(outer.counter);
        }
    }

    public void printName(NestedInnerClass inner){
        System.out.println(inner.name);
    }
}
