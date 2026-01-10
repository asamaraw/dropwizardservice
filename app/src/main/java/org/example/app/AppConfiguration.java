package org.example.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AppConfiguration extends Configuration {
    
    @Valid
    @NotNull
    @JsonProperty("app")
    private AppConfig app = new AppConfig();
    
    public AppConfig getApp() {
        return app;
    }
    
    public void setApp(AppConfig app) {
        this.app = app;
    }
    
    public static class AppConfig {
        @NotBlank
        @JsonProperty
        private String revision = "1.0.0";
        
        public String getRevision() {
            return revision;
        }
        
        public void setRevision(String revision) {
            this.revision = revision;
        }
    }
}
