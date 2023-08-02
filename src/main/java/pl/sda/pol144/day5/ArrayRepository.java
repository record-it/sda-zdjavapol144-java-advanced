package pl.sda.pol144.day5;

public class ArrayRepository<T> implements Repository<T, Integer>{
    private int last = -1;
    private T[] items;

    public ArrayRepository(T[] items) {
        this.items = items;
    }

    @Override
    public Integer save(T item) throws NoRoomInRespositoryException{
        if (last < items.length) {
            items[++last] = item;
            return last;
        } else {
            throw new NoRoomInRespositoryException();
        }
    }

    @Override
    public T find(Integer key) {
        if (key >= 0 && key <= last) {
            return items[key];
        } else {
            return null;
        }
    }
}
