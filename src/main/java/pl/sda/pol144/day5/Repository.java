package pl.sda.pol144.day5;

public interface Repository<T, K> {
    K save(T item);

    T find(K key);
}
