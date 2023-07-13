package pl.sda.pol144.day2.interfaces;
// TODO klasa do poprawy, dorobić logikę dla przepełnienia tablicy!
public class ArrayHistory implements History{
    private String[] content = new String[100];
    private int last = -1;
    @Override
    public void insert(String item) {
        content[++last] = item;
    }

    @Override
    public void findAll() {
        for(var item: content){
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
