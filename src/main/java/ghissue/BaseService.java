package ghissue;

import javax.inject.Inject;

public class BaseService<T> {

    @Inject
    private BaseMapper<T> mapper;

    public String toString(T t) {
        return mapper.toString(t);
    }

    public T fromString(String s) {
        return mapper.fromString(s);
    }

}
