package liquor.graduation.liquor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="liquor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Liquor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="liquor_id")
    private Long id;

    @Column(name="name_eng")
    private String englishName;

    @Column(name="name_kor")
    private String koreanName;

    @Column
    @Lob
    private String description;

    @Column(name="hashtag_base")
    private String hashtagName;

    @Column(name="img_url", length = 1000)
    private String imgUrl;
}
