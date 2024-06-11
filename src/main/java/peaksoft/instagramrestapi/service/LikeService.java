package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.SimpleResponse;

public interface LikeService {
    SimpleResponse likePost(Long postId, Long userId);

    SimpleResponse unlikePost(Long postId, Long userId);

    SimpleResponse likeComment(Long commentId, Long userId, Long postId);

    SimpleResponse unlikeComment(Long commentId, Long userId, Long postId);
}
