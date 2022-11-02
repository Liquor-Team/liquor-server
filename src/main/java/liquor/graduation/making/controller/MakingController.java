package liquor.graduation.making.controller;

import liquor.graduation.making.dto.request.MakingRequestDto;
import liquor.graduation.making.dto.response.MakingResponseDto;
import liquor.graduation.making.service.MakingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MakingController {

    private final MakingService makingService;

    @GetMapping("/making/{product}")
    public ResponseEntity<MakingResponseDto> getLiquorDetails(@PathVariable(name="product") MakingRequestDto liquorName) {
        MakingResponseDto responseDto = makingService.getCocktailListByLiquorName(liquorName);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
