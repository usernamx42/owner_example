package io.github.yolzhas;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testArray() {
       ArrayConfig config = ConfigFactory.newInstance()
               .create(ArrayConfig.class);

    for (String fruit: config.fruits()) {
        System.out.println(fruit);
    }
    }
}
