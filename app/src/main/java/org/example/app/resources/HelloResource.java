package org.example.app.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {
    
    @GET
    public HelloResponse getHello() {
        return new HelloResponse("Hello world!");
    }
    
    public static class HelloResponse {
        @JsonProperty
        private String message;
        
        public HelloResponse() {
            // Jackson requires a no-arg constructor
        }
        
        public HelloResponse(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
}

