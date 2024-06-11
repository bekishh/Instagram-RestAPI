package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.userDto.UserRequest;
import peaksoft.instagramrestapi.dto.userDto.UserResponse;

public interface UserService {
    SimpleResponse signUp(UserRequest userRequest);

    SimpleResponse signIn(UserRequest userRequest);

    SimpleResponse updateUser(Long userId, UserRequest userRequest);

    SimpleResponse deleteUser(Long userId);

    UserResponse userProfile(Long userId);
}
