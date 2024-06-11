package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    String saveComment(Long userId, Long postId, Comment comment);

    List<Comment> getAllCommentsByPostId(Long postId);

    String deleteCommentById(Long commentId);
}