package pl.sda.pol144.day2.interfaces.example;

public class HistoryDemo {
    static History history = new ArrayHistory();
    public static void main(String[] args) {
        history.insert("ABC");
        history.insert("XYZ");
        history.printAll();
    }
}
