package liquor.graduation.liquor.dto.response;

import liquor.graduation.liquor.entity.Liquor;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LiquorDetailsResponse {
    private String name;
    private String description;
    private String hashtag;
    private String img_url;


    public static LiquorDetailsResponse of(Liquor liquor) {
        return LiquorDetailsResponse.builder()
                .name(liquor.getName())
                .description(liquor.getDescription())
                .hashtag(liquor.getHashtagName())
                .img_url(liquor.getImgUrl())
                .build();
    }
}
