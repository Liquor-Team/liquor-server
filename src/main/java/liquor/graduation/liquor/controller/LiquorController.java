package liquor.graduation.liquor.controller;

import liquor.graduation.liquor.dto.response.LiquorDetailsResponse;
import liquor.graduation.liquor.service.LiquorInformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LiquorController {

    private final LiquorInformationService liquorService;

    @GetMapping("/{liquor-name}")
    public ResponseEntity<LiquorDetailsResponse> getLiquorDetails(@PathVariable String liquorName) {
        LiquorDetailsResponse response = liquorService.getLiquorInformation(liquorName);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
