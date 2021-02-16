package io.github.yolzhas;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:default.properties"
})

public interface ServiceConfig extends Config {

    @Key("service.name")
    String testing();

    @DefaultValue("http://web.${service.name}.company.com")
    @Key("service.web.url")
    String webUrl();

    @DefaultValue("http://db.${service.name}.company.com")
    @Key("service.db.url")
    String dbUrl();

    @DefaultValue("http://api.${service.name}.company.com")
    @Key("service.api.url")
    String apiUrl();
}
