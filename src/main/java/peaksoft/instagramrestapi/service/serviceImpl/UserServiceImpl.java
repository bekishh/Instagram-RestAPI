package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.dto.userDto.UserRequest;
import peaksoft.instagramrestapi.dto.userDto.UserResponse;
import peaksoft.instagramrestapi.entity.User;
import peaksoft.instagramrestapi.repository.UserRepository;
import peaksoft.instagramrestapi.service.UserService;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public SimpleResponse signUp(UserRequest userRequest) {
        return null;
    }

    @Override
    public SimpleResponse signIn(UserRequest userRequest) {
        return null;
    }

    @Override
    public SimpleResponse updateUser(Long userId, UserRequest userRequest) {
        return null;
    }

    @Override
    public SimpleResponse deleteUser(Long userId) {
        return null;
    }

    @Override
    public UserResponse userProfile(Long userId) {
        return null;
    }
}
