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
    @Column(name="id")
    private Long id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name="eng_name")
    private String englishName;

    @Column(name="kor_name")
    private String koreanName;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="hashtag")
    private String hashtagName;

    @Column(name="img_url", length = 1000)
    private String imgUrl;
}
