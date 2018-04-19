package ghissue;

public interface BaseMapper<T> {
    T fromString(String s);
    String toString(T t);
}
