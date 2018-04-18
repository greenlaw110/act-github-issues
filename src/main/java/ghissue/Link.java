package ghissue;

import org.osgl.util.C;
import org.osgl.util.S;

import java.util.List;

public class Link {
    private String url;
    private String description;

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public Link(String url, String desc) {
        this.url = S.requireNotBlank(url);
        this.description = S.requireNotBlank(desc);
    }

    public static List<Link> generateTestData() {
        return C.list(new Link("https://google.com", "谷歌"), new Link("https://baidu.com", "百度"));
    }
}
