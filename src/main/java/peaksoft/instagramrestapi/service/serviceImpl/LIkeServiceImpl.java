package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.repository.LikeRepository;
import peaksoft.instagramrestapi.service.LikeService;

@Service
@Transactional
@RequiredArgsConstructor
public class LIkeServiceImpl implements LikeService {
    private final LikeRepository likeRepository;

    @Override
    public SimpleResponse likePost(Long postId, Long userId) {
        return null;
    }

    @Override
    public SimpleResponse unlikePost(Long postId, Long userId) {
        return null;
    }

    @Override
    public SimpleResponse likeComment(Long commentId, Long userId, Long postId) {
        return null;
    }

    @Override
    public SimpleResponse unlikeComment(Long commentId, Long userId, Long postId) {
        return null;
    }
}
