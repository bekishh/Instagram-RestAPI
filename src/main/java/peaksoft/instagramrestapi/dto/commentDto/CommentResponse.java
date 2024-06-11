package peaksoft.instagramrestapi.dto.commentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.instagramrestapi.entity.Post;
import peaksoft.instagramrestapi.entity.User;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponse {
    private String comment;
    private LocalDate createdAt;
    private User user;
    private Post post;
}
