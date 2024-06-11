package peaksoft.instagramrestapi.dto.userDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
}
