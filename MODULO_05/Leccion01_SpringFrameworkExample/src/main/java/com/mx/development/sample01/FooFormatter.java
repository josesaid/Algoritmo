package com.mx.development.sample01;

import org.springframework.stereotype.Component;

/**
 * @author josesaidolanogarcia
 */
@FormatterType("Foo")
@Component
public class FooFormatter implements Formatter {

    @Override
    public String format() {
        return "<h2>Foo</h2>";
    }

}
