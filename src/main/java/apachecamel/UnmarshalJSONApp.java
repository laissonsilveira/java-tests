package apachecamel;

import apachecamel.dto.JSONDto;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnmarshalJSONApp {

    static Logger logger = LoggerFactory.getLogger(UnmarshalJSONApp.class);

    public static void main(String[] args) throws Exception {

        JacksonDataFormat format = new JacksonDataFormat();
        format.setUnmarshalType(JSONDto.class);

        Main main = new Main();
        main.addRoutesBuilder(new RouteBuilder() {
            @Override
            public void configure() {
                onException(Exception.class)
                        .process(exchange -> {
                            Throwable caught = exchange.getProperty(Exchange.EXCEPTION_CAUGHT,
                                    Throwable.class);
                            logger.error("FATAL ERROR - ", caught);
                        })
                        .handled(true);

                from("file://src/in?noop=true")
                        .log("JSON -> ${body}")
                        .unmarshal(format)
                        .log("OBJ -> ${body}");

            }
        });
        main.run(args);
    }
}


