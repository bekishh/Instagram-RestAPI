package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.postDto.PostRequest;
import peaksoft.instagramrestapi.dto.postDto.PostResponse;
import peaksoft.instagramrestapi.repository.PostRepository;
import peaksoft.instagramrestapi.service.PostService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public SimpleResponse savePost(Long userId, PostRequest postRequest) {
        return null;
    }

    @Override
    public PostResponse getUserPostById(Long postId) {
        return null;
    }

    @Override
    public List<PostResponse> getAllUserPosts(Long userId) {
        return List.of();
    }

    @Override
    public SimpleResponse updatePost(Long postId, String newTitle, String newDescription) {
        return null;
    }

    @Override
    public SimpleResponse deletePost(Long postId) {
        return null;
    }
}
