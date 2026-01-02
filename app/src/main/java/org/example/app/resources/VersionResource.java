package org.example.app.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/version")
@Produces(MediaType.APPLICATION_JSON)
public class VersionResource {
    
    @GET
    public String getVersion() {
        return "0.1.0";
    }
}
