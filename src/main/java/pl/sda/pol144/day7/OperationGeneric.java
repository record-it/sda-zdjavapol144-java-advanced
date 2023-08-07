package pl.sda.pol144.day7;

/**
 * Przykład interfejsu funkcyjnego generycznego
 * @param <T>
 */
@FunctionalInterface
public interface OperationGeneric<T extends Number> {
    T apply(T a, T b);
}
