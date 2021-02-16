package io.github.yolzhas;

import org.aeonbits.owner.Config;

import java.util.List;

public interface ServerConfig extends Config {

    @ConverterClass(ServerConverter.class)
    @DefaultValue("google.com:4444, viled.kz:4444")
    List<Server> getServer();
}
