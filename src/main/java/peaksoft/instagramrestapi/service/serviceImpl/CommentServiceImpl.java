package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.commentDto.CommentRequest;
import peaksoft.instagramrestapi.dto.commentDto.CommentResponse;
import peaksoft.instagramrestapi.repository.CommentRepository;
import peaksoft.instagramrestapi.service.CommentService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public SimpleResponse saveComment(Long userId, Long postId, CommentRequest commentRequest) {
        return null;
    }

    @Override
    public List<CommentResponse> getAllCommentsByPostId(Long postId) {
        return List.of();
    }

    @Override
    public SimpleResponse updateComment(Long postId, Long commentId) {
        return null;
    }

    @Override
    public SimpleResponse deleteCommentById(Long commentId) {
        return null;
    }
}
