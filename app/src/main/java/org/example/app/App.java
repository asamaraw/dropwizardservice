package org.example.app;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.app.health.ApplicationHealthCheck;
import org.example.app.resources.VersionResource;

public class App extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-service";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        // Any application initialization goes here
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) {
        // Register resources
        environment.jersey().register(new VersionResource());
        
        // Register health checks
        environment.healthChecks().register("application", new ApplicationHealthCheck());
    }
}
