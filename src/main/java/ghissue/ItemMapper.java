package ghissue;

import com.alibaba.fastjson.JSON;

public class ItemMapper implements BaseMapper<PackItem> {
    @Override
    public PackItem fromString(String s) {
        return JSON.parseObject(s, PackItem.class);
    }

    @Override
    public String toString(PackItem packItem) {
        return JSON.toJSONString(packItem);
    }
}
