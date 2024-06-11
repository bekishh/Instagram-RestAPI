package peaksoft.instagramrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.instagramrestapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    String signUp(User user);

    User signIn(String email, String password);

    String updateUser(Long userId, User newUser);

    String deleteUser(Long userId);

    User userProfile(Long userId);
}
