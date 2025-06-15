package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity {
    public String type;
    public Repo;

    Activity(){}

    public String getType() {
        return type;
    }
}
