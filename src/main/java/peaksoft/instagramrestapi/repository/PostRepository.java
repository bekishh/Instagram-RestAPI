package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    String savePost(Long userId, Post post);

    Post getUserPostById(Long postId);

    List<Post> getAllUserPosts(Long userId);

    String updatePost(Long postId, String newTitle, String newDescription);

    String deletePost(Long postId);
}
