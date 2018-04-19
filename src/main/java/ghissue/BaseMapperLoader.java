package ghissue;

import org.osgl.inject.BeanSpec;
import org.osgl.inject.GenericTypedBeanLoader;
import org.osgl.util.C;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class BaseMapperLoader implements GenericTypedBeanLoader<BaseMapper> {

    private Map<Type, BaseMapper> mappers = C.Map(
            PackItem.class, new ItemMapper()
    );

    @Override
    public BaseMapper load(BeanSpec spec) {
        List<Type> typeList = spec.typeParams();
        int sz = typeList.size();
        if (sz > 0) {
            Type paramType = typeList.get(0);
            return mappers.get(paramType);
        }
        return null;
    }
}
