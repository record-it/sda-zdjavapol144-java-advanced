package pl.sda.pol144.day2.interfaces;

public class StringHistory implements History{
    private final static String DELIMITER = "|";
    private String content = "";
    @Override
    public void insert(String item) {
        content += DELIMITER + item;
    }

    @Override
    public void findAll() {
        String[] items = content.split("\\|");
        for (var item: items){
            System.out.println(item);
        }
    }
}
