package peaksoft.instagramrestapi.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.entity.UserInfo;
import peaksoft.instagramrestapi.entity.userInfoDto.UserInfoRequest;
import peaksoft.instagramrestapi.repository.UserInfoRepository;
import peaksoft.instagramrestapi.service.UserInfoService;

@Service
@Transactional
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {
    private final UserInfoRepository userInfoRepository;

    @Override
    public SimpleResponse saveUserInfo(UserInfoRequest userInfoRequest) {
        return null;
    }

    @Override
    public UserInfo findUserInfoByUserId(Long userId) {
        return null;
    }

    @Override
    public SimpleResponse updateUserInfo(Long userInfoId, UserInfoRequest newUserInfoRequest) {
        return null;
    }

    @Override
    public SimpleResponse changeImage(Long userId, String newImage) {
        return null;
    }

    @Override
    public SimpleResponse deleteImage(Long userId) {
        return null;
    }
}
