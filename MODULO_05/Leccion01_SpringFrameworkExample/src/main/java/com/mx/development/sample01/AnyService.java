package com.mx.development.sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnyService {

    @Autowired
    @FormatterType("Marcos")
    private Formatter formatter;
    //Formatter bar = new BarFormatter();

    public String doSomething() {
        return formatter.format();
    }

}
