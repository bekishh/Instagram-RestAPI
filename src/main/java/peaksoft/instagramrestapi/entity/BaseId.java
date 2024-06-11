package peaksoft.instagramrestapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseId {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
    @SequenceGenerator(
            name = "id_gen",
            sequenceName = "id_seq",
            allocationSize = 1
    )
    private Long id;
}
