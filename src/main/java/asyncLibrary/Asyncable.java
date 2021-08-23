package asyncLibrary;

@FunctionalInterface
public interface Asyncable<T> {
    public T get();
}
