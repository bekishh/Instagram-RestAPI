package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.Image;
import peaksoft.instagramrestapi.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    String saveUserInfo(UserInfo userInfo);

    UserInfo findUserInfoByUserId(Long userId);

    String updateUserInfo(Long userInfoId, UserInfo newUserInfo);

    String changeImage(Long userId, Image newImage);

    String deleteImage(Long userId);
}
