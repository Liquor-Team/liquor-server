package liquor.graduation.cocktail.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cocktail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="identifier")
    private String identifier;

    @Column(name="kor_name")
    private String koreanName;

    @Column(name="eng_name")
    private String englishName;

    @Column(name="summary")
    private String summary;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="recipe")
    @Lob
    private String recipe;

    @Column(name="hashtag_base")
    private String hashtagBase;

    @Column(name="hashtag_color")
    private String hashtagColor;

    @Column(name="img_url", length = 1000)
    private String imgUrl;
}
