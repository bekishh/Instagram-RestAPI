package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.Comment;
import peaksoft.instagramrestapi.entity.Follower;
import peaksoft.instagramrestapi.entity.User;

import java.util.List;

public interface FollowerRepository extends JpaRepository<Follower, Long> {
    List<User> search(String word);

    User subscribe(Long userId, Long followerId);

    List<User> getAllSubscribersByUserId();

    List<User> getAllSubscriptionsByUserId();
}
