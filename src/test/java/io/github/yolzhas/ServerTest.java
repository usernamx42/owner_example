package io.github.yolzhas;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ServerTest {

    @Test
    public void testServer() {
        ServerConfig config = ConfigFactory.newInstance()
                .create(ServerConfig.class);

    for (Server server : config.getServer()) {
      System.out.println(server.host + " ; " + server.port);
    }
    }

}
