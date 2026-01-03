package org.example.app.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

/**
 * Application metrics service for tracking various metrics.
 */
public class ApplicationMetrics {
    
    private final Counter versionRequestsCounter;
    private final Timer versionRequestTimer;
    private final Meter versionRequestMeter;
    private final Counter totalRequestsCounter;
    
    public ApplicationMetrics(MetricRegistry metricRegistry) {
        // Counter for tracking version endpoint requests
        this.versionRequestsCounter = metricRegistry.counter("version.requests");
        
        // Timer for measuring version endpoint response time
        this.versionRequestTimer = metricRegistry.timer("version.request.duration");
        
        // Meter for tracking request rate
        this.versionRequestMeter = metricRegistry.meter("version.request.rate");
        
        // Counter for total requests
        this.totalRequestsCounter = metricRegistry.counter("requests.total");
    }
    
    public Counter getVersionRequestsCounter() {
        return versionRequestsCounter;
    }
    
    public Timer getVersionRequestTimer() {
        return versionRequestTimer;
    }
    
    public Meter getVersionRequestMeter() {
        return versionRequestMeter;
    }
    
    public Counter getTotalRequestsCounter() {
        return totalRequestsCounter;
    }
}

