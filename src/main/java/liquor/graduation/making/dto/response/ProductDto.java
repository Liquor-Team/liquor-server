package liquor.graduation.making.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ProductDto {
    private String korName;
    private String engName;
    private String imgUrl;
    private String summary;
}
