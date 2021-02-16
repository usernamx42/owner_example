package io.github.yolzhas;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import javax.xml.ws.Service;

public class ServiceTest {

    @Test
    public void testService() {
        ServiceConfig config = ConfigFactory.newInstance()
                .create(ServiceConfig.class, System.getProperties());

        System.out.println(config.webUrl());
        System.out.println(config.apiUrl());
        System.out.println(config.dbUrl());
    }

}
