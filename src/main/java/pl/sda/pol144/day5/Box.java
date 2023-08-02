package pl.sda.pol144.day5;

public class Box<T> {
    private T content;

    public void setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public Box(T content) {
        this.content = content;
    }

    public boolean isEmpty(){
        return content == null;
    }
}
