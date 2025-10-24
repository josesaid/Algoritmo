package com.mx.development.sample01;

import org.springframework.stereotype.Component;

/**
 * @author josesaidolanogarcia
 */
@FormatterType("Daleyma")
@Component
public class DaleymaFormatter implements Formatter{
    @Override
    public String format() {
        return "Hola, soy el formatter Daleyma";
    }

}
