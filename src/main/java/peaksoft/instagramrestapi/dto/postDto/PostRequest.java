package peaksoft.instagramrestapi.dto.postDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.instagramrestapi.entity.Image;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private String title;
    private String description;
    private List<Image> images;
}
