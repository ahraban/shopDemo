package cz.ahraban.demoshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="watchentity")
@XmlAccessorType(XmlAccessType.FIELD)
public class WatchEntity {
    private Long id;

    @NotBlank(message = "Title is mandatory")
    public String title;

    @NotBlank(message = "Price is mandatory")
    public String price;

    @NotBlank(message = "Description is mandatory")
    public String description;

    @NotBlank(message = "Fountain is mandatory")
    public String fountain;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFountain() {
        return fountain;
    }
    public void setFountain(String fountain) {
        this.fountain = fountain;
    }
}
