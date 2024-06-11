package peaksoft.instagramrestapi.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "followers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Follower extends BaseId {
    @ElementCollection
    private List<Long> subscribers;

    @ElementCollection
    private List<Long> subscriptions;

    @OneToOne(mappedBy = "follower")
    private User user;

    @Override
    public String toString() {
        return "\nFollower{" +
                "subscribers=" + subscribers +
                ", subscriptions=" + subscriptions +
                ", user=" + user +
                '}';
    }
}
