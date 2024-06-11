package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.Comment;
import peaksoft.instagramrestapi.entity.Like;
import peaksoft.instagramrestapi.entity.Post;
import peaksoft.instagramrestapi.entity.User;

public interface LikeRepository extends JpaRepository<Like, Long> {
    boolean existsByUserAndPost(User user, Post post);

    boolean existsByUserAndCommeLikeServicent(User user, Comment comment);
}
