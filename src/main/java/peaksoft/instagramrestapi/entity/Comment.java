package peaksoft.instagramrestapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseId {
    private String comment;

    private LocalDate createdAt;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    private List<Like> likes;

    public Comment(String comment, LocalDate createdAt) {
        this.comment = comment;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "\nComment{" +
                "comment='" + comment + '\'' +
                ", createdAt=" + createdAt +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}


