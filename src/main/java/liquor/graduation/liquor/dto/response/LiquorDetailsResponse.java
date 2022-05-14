package liquor.graduation.liquor.dto.response;

import liquor.graduation.liquor.entity.Liquor;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LiquorDetailsResponse {
    private String englishName;
    private String koreanName;
    private String description;
    private String hashtag;
    private String img_url;

    public static LiquorDetailsResponse of(Liquor liquor) {
        return LiquorDetailsResponse.builder()
                .englishName(liquor.getEnglishName())
                .koreanName(liquor.getKoreanName())
                .description(liquor.getDescription())
                .hashtag(liquor.getHashtagName())
                .img_url(liquor.getImgUrl())
                .build();
    }
}
