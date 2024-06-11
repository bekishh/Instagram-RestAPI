package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.postDto.PostRequest;
import peaksoft.instagramrestapi.dto.postDto.PostResponse;

import java.util.List;

public interface PostService {
    SimpleResponse savePost(Long userId, PostRequest postRequest);

    PostResponse getUserPostById(Long postId);

    List<PostResponse> getAllUserPosts(Long userId);

    SimpleResponse updatePost(Long postId, String newTitle, String newDescription);

    SimpleResponse deletePost(Long postId);
}
