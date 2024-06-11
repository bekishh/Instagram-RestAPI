package peaksoft.instagramrestapi.service;

import peaksoft.instagramrestapi.dto.SimpleResponse;
import peaksoft.instagramrestapi.entity.UserInfo;
import peaksoft.instagramrestapi.entity.userInfoDto.UserInfoRequest;

public interface UserInfoService {
    SimpleResponse saveUserInfo(UserInfoRequest userInfoRequest);

    UserInfo findUserInfoByUserId(Long userId);

    SimpleResponse updateUserInfo(Long userInfoId, UserInfoRequest newUserInfoRequest);

    SimpleResponse changeImage(Long userId, String newImage);

    SimpleResponse deleteImage(Long userId);
}
