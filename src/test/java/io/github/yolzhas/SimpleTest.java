package io.github.yolzhas;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void testLoadPolicy() {
        WebDriverConfig config = ConfigFactory.newInstance().create(WebDriverConfig.class);
        System.out.println(config.password());
    }
}
