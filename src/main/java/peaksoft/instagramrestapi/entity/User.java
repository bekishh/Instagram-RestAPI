package peaksoft.instagramrestapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseId {
    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToOne
    private Like like;

    @OneToOne(cascade = CascadeType.ALL)
    private Follower follower;

    @OneToOne(cascade = CascadeType.ALL)
    private UserInfo userInfo;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(String email, String phoneNumber, String fullName, String username, String password) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userInfo = new UserInfo();
        this.userInfo.setFullName(fullName);
        this.username = username;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}


