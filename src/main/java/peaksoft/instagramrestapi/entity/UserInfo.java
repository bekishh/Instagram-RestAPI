package peaksoft.instagramrestapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import peaksoft.instagramrestapi.enums.Gender;

@Entity
@Table(name = "user_infos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo extends BaseId {
    private String fullName;

    private String biography;
    private Gender gender;
    @Column(length = 5000)
    private String image;

    @OneToOne(mappedBy = "userInfo")
    private User user;

    public UserInfo(String fullName, String biography, Gender gender, String image) {
        this.fullName = fullName;
        this.biography = biography;
        this.gender = gender;
        this.image = image;
    }
}
