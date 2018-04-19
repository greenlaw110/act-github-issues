package ghissue;

import act.Act;
import com.tuyang.beanutils.BeanCopyUtils;
import javassist.ClassPool;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.E;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction("bean-util")
    public FromBean beanUtilTest() {
        ClassPool.getDefault();
        FromBean from = new FromBean();
        from.setId(11L);
        FromBean to = new FromBean();
        Thread currentThread = Thread.currentThread();
        ClassLoader previousClassLoader = currentThread.getContextClassLoader();
        currentThread.setContextClassLoader(Act.app().classLoader());
        try {
            BeanCopyUtils.copyBean(from, to);
        } finally {
            currentThread.setContextClassLoader(previousClassLoader);
        }
        return to;
    }

    @GetAction("beetl")
    public void beetlTest() {
        E.tbd();
    }


    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
