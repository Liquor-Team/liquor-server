package liquor.graduation.cocktail.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CocktailDto {
    private String korName;
    private String engName;
    private String imgUrl;
    private String summary;
    private String recipe;
    private String description;
}
