package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.commentDto.CommentRequest;
import peaksoft.instagramrestapi.dto.commentDto.CommentResponse;
import peaksoft.instagramrestapi.entity.Comment;

import java.util.List;

public interface CommentService {
    SimpleResponse saveComment(Long userId, Long postId, CommentRequest commentRequest);

    List<CommentResponse> getAllCommentsByPostId(Long postId);

    SimpleResponse updateComment(Long postId, Long commentId);

    SimpleResponse deleteCommentById(Long commentId);
}
