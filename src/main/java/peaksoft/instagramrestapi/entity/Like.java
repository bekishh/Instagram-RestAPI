package peaksoft.instagramrestapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "likes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Like extends BaseId {
    private boolean isLike;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Comment comment;

    @OneToOne(mappedBy = "like")
    private User user;

    public Like(boolean isLike) {
        this.isLike = isLike;
    }

    @Override
    public String toString() {
        return "Like{" +
                "isLike=" + isLike +
                ", post=" + post +
                ", comment=" + comment +
                ", user=" + user +
                '}';
    }
}
