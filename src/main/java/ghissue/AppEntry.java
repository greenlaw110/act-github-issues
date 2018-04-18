package ghissue;

import static act.controller.Controller.Util.render;

import act.Act;
import org.osgl.mvc.annotation.GetAction;

import java.util.List;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction
    public void home() {
        List<Link> links = Link.generateTestData();
        render(links);
    }

    public static void main(String[] args) throws Exception {
        Act.start("Backend Render List Demo");
    }

}
