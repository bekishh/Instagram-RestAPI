package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.userDto.UserResponse;
import peaksoft.instagramrestapi.repository.FollowerRepository;
import peaksoft.instagramrestapi.service.FollowerService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FollowerServiceImpl implements FollowerService {
    private final FollowerRepository followerRepository;

    @Override
    public List<UserResponse> search(String word) {
        return List.of();
    }

    @Override
    public UserResponse subscribe(Long userId, Long followerId) {
        return null;
    }

    @Override
    public List<UserResponse> getAllSubscribersByUserId(Long userId) {
        return List.of();
    }

    @Override
    public List<UserResponse> getAllSubscriptionsByUserId(Long userId) {
        return List.of();
    }
}
