package liquor.graduation.making.entity;

import liquor.graduation.cocktail.entity.Cocktail;
import liquor.graduation.liquor.entity.Liquor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="liquor_cocktail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "liquor_id")
    private Liquor liquor;

    @ManyToOne
    @JoinColumn(name = "cocktail_id")
    private Cocktail cocktail;

}
