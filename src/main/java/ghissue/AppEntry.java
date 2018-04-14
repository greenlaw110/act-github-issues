package ghissue;

import act.Act;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.util.S;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction
    public void home() {
    }

    @PostAction("{type}")
    public String route1(String type) {
        return type;
    }

    @PostAction("{type}/test")
    public String route2(String type) {
        return S.concat(type, "/list");
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
