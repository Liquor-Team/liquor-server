package liquor.graduation.cocktail.service;

import liquor.graduation.cocktail.dto.CocktailDto;
import liquor.graduation.cocktail.dto.CocktailResponseDto;
import liquor.graduation.cocktail.entity.Cocktail;
import liquor.graduation.cocktail.repository.CocktailRepository;
import liquor.graduation.making.dto.request.MakingRequestDto;
import liquor.graduation.making.dto.response.MakingResponseDto;
import liquor.graduation.making.dto.response.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    public CocktailResponseDto getAllCocktailList() {
        List<Cocktail> cocktailList = cocktailRepository.findAll();
        List<CocktailDto> cocktails = new ArrayList<>();
        for(Cocktail cocktail : cocktailList) {
            CocktailDto cocktailDto = CocktailDto.builder()
                    .engName(cocktail.getEnglishName())
                    .korName(cocktail.getKoreanName())
                    .summary(cocktail.getSummary())
                    .imgUrl(cocktail.getImgUrl())
                    .description(cocktail.getDescription())
                    .recipe(cocktail.getRecipe())
                    .build();
            cocktails.add(cocktailDto);
        }
        return new CocktailResponseDto(cocktails);
    }
}
