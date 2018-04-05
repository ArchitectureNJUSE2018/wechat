package cn.edu.nju;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class UserRelationRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("userRelationship:foo")
                .to("log:bar");
    }
}
