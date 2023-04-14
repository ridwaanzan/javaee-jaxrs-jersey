package org.latihan.jaxrs.application;

import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig {
    public Application() {
        packages("org.latihan.jaxrs.application.band");
        packages("org.latihan.jaxrs.application.car");
    }
}
