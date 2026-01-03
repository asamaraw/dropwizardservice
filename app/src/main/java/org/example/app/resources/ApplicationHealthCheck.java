package org.example.app.health;

import com.codahale.metrics.health.HealthCheck;

public class ApplicationHealthCheck extends HealthCheck {
    
    @Override
    protected Result check() throws Exception {
        // Basic health check - you can add more sophisticated checks here
        // For example: database connectivity, external service availability, etc.
        return Result.healthy("Application is running");
    }
}


