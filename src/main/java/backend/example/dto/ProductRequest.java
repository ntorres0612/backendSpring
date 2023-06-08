package backend.example.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("shortDescription")
    private String shortDescription;

}