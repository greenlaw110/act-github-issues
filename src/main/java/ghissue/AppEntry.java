package ghissue;

import act.Act;
import act.util.JsonView;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Named;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction
    public void home() {
    }

    @PostAction
    @JsonView
    public String[] post(@Named("idList") String[] ids) {
        return ids;
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
