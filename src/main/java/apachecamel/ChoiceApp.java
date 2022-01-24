package apachecamel;

import apachecamel.dto.JSONDto;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChoiceApp {

    static Logger logger = LoggerFactory.getLogger(ChoiceApp.class);

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.addRoutesBuilder(getChoiceRouteBuilder());
        main.run(args);
    }

    public static RouteBuilder getChoiceRouteBuilder() {
        return new RouteBuilder() {
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
                        .choice()
                            .when(simple("${file:ext} ends with 'json'"))//
                                .log("Choice A: ${body}")//
                                .choice()//
                                    .when(simple("${file:ext} ends with 'json'"))//
                                        .log("Choice B: ${body}")//
                                         .process(exchange -> exchange.getIn().setBody("Chosen option B"))
                                    .endChoice()//
                                    .log("Choice B another log: ${body}")//
                                    .when(simple("${file:ext} ends with 'json'"))//
                                        .log("Choice C: ${body}")//
                                    .endChoice()//
//                                .end()//
                            .endChoice()//
                            .when(simple("${file:ext} ends with 'json'"))//
                                .log("Choice D: ${body}")//
                            .endChoice()//
                            .otherwise()//
                                .log("otherwise: ${body}")//
                            .endChoice()//
                        .end()
                    .to("mock:result");

            }
        };
    }

}
