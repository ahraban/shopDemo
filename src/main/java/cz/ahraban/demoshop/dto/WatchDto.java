package cz.ahraban.demoshop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@JsonIgnoreProperties(ignoreUnknown = true)
public class WatchDto {
    public String title;
    public String price;
    public String description;
    public String fountain;
}
