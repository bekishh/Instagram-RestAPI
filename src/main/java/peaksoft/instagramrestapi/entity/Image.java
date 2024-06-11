package peaksoft.instagramrestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image extends BaseId {
    private String imageURL;

    @ManyToOne
    private Post post;

    public Image(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageURL='" + imageURL + '\'' +
                ", post=" + post +
                '}';
    }
}
