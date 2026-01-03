package org.example.app;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.app.metrics.ApplicationMetrics;
import org.example.app.resources.ApplicationHealthCheck;
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
        // Initialize metrics
        ApplicationMetrics metrics = new ApplicationMetrics(environment.metrics());
        
        // Register resources with metrics
        environment.jersey().register(new VersionResource(metrics));
        
        // Register health checks
        environment.healthChecks().register("application", new ApplicationHealthCheck());
    }
}
