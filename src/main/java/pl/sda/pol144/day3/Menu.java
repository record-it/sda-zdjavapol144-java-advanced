package pl.sda.pol144.day3;

public class Menu {
    public record MenuItem(String label, Runnable action){};
    private MenuItem[] items;

    public Menu(MenuItem[] items) {
        this.items = items;
    }

    public void print(){
        for(int i = 0; i < items.length; i++){
            if (items[i] != null){
                System.out.println(i + ". " + items[i].label);
            }
        }
    }

    public void run(int option){
        if (items[option] != null) {
            items[option].action().run();
        }
    }
}
