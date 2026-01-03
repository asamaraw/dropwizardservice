package org.example.app.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.app.metrics.ApplicationMetrics;
import com.codahale.metrics.Timer;

@Path("/api/version")
@Produces(MediaType.APPLICATION_JSON)
public class VersionResource {
    
    private final ApplicationMetrics metrics;
    
    public VersionResource(ApplicationMetrics metrics) {
        this.metrics = metrics;
    }
    
    @GET
    public String getVersion() {
        // Track request rate
        metrics.getVersionRequestMeter().mark();
        
        // Track total requests
        metrics.getTotalRequestsCounter().inc();
        
        // Measure response time
        try (Timer.Context context = metrics.getVersionRequestTimer().time()) {
            // Increment version-specific counter
            metrics.getVersionRequestsCounter().inc();
            
            return "0.1.0";
        }
    }
}
