package cn.edu.nju;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MomentRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("moment:foo")
                .to("log:bar");
    }
}
