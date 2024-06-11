package peaksoft.instagramrestapi.dto.userDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.instagramrestapi.entity.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private UserInfo userInfo;

//    private List<Post> posts;
}
