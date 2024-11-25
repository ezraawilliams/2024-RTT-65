package org.ezrawilliams.springinjectionautowiringexample.myservices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {

    @Override
    public String getFortune() {
        return "Database connection";
    }
}

