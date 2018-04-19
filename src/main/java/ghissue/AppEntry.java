package ghissue;

import act.Act;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Inject;

@SuppressWarnings("unused")
public class AppEntry {

    @Inject
    private ItemService service;

    @PostAction("print")
    public String print(PackItem item) {
        return service.toString(item);
    }

    @PostAction("serialize")
    public PackItem serialize(String s) {
        return service.fromString(s);
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
