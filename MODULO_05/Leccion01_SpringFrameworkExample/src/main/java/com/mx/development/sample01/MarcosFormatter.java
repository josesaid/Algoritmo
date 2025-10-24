package com.mx.development.sample01;

import org.springframework.stereotype.Component;

/**
 * @author josesaidolanogarcia
 */
@FormatterType("Marcos")
@Component
public class MarcosFormatter implements Formatter{

    @Override
    public String format() {
        return "<i>Hola Soy el formatter Marcos</i>";
    }

}
