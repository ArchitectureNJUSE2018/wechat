package cn.edu.nju;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PaymentRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("pay:foo")
                .to("log:bar");
    }
}
