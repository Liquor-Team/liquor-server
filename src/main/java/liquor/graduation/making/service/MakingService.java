package liquor.graduation.making.service;

import liquor.graduation.cocktail.entity.Cocktail;
import liquor.graduation.liquor.entity.Liquor;
import liquor.graduation.liquor.repository.LiquorRepository;
import liquor.graduation.making.dto.request.MakingRequestDto;
import liquor.graduation.making.dto.response.MakingResponseDto;
import liquor.graduation.making.dto.response.ProductDto;
import liquor.graduation.making.entity.Product;
import liquor.graduation.making.respository.MakingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MakingService {

    /**
     * (1) Liquor의 Id를 받아야 한다.
     * (2) 그거 바탕으로 Product 리스트를 가져온다.
     * (3) 모든 Product 리스트마다 칵테일 정보를 받아온다.
     * (4) 그 정보들을 필요한 정보들만 정제해서 Dto에 담는다.
     */

    private final LiquorRepository liquorRepository;
    private final MakingRepository makingRepository;

    public MakingResponseDto getCocktailListByLiquorName(MakingRequestDto liquorName) {
        List<Liquor> liquors = liquorRepository.findByIdentifier(liquorName.getLiquor());

        //if(liquors.size() <= 0){}       // TODO 영어이름 질의 결과 존재하지 않을 때 에러 처리 필요.

        Long liquorId = liquors.get(0).getId();
        List<Product> productList = makingRepository.findByLiquorId(liquorId);
        List<ProductDto> productDtoList = new ArrayList<>();
        String category = productList.get(0).getCocktail().getHashtagBase();
        for(Product product : productList) {
            Cocktail cocktail = product.getCocktail();  // 칵테일
            ProductDto productDto = ProductDto.builder()
                            .engName(cocktail.getEnglishName())
                            .korName(cocktail.getKoreanName())
                            .imgUrl(cocktail.getImgUrl())
                            .build();
            productDtoList.add(productDto);
        }

        MakingResponseDto responseDto = MakingResponseDto.builder()
                .category(category)
                .productList(productDtoList)
                .build();
        return responseDto;
    }


}
