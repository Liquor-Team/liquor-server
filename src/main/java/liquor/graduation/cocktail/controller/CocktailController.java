package liquor.graduation.cocktail.controller;

import liquor.graduation.cocktail.dto.CocktailResponseDto;
import liquor.graduation.cocktail.service.CocktailService;
import liquor.graduation.making.dto.request.MakingRequestDto;
import liquor.graduation.making.dto.response.MakingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CocktailController {

    private final CocktailService cocktailService;

    @GetMapping("/cocktail")
    public ResponseEntity<CocktailResponseDto> getCocktails() {
        CocktailResponseDto responseDto = cocktailService.getAllCocktailList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
