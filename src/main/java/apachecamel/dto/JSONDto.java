package apachecamel.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JSONDto {

    private String name;

    public JSONDto() {
    }

    public String getName() {
        return name;
    }
}