package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.userDto.UserResponse;
import peaksoft.instagramrestapi.entity.User;

import java.util.List;

public interface FollowerService {
    List<UserResponse> search(String word);

    UserResponse subscribe(Long userId, Long followerId);

    List<UserResponse> getAllSubscribersByUserId(Long userId);

    List<UserResponse> getAllSubscriptionsByUserId(Long userId);
}
