package liquor.graduation.liquor.service;

import liquor.graduation.liquor.dto.response.LiquorDetailsResponse;
import liquor.graduation.liquor.entity.Liquor;
import liquor.graduation.liquor.repository.LiquorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LiquorInformationService {

    private final LiquorRepository liquorRepository;

    public LiquorDetailsResponse getLiquorInformation(String liquorName) {
        List<Liquor> liquorList = liquorRepository.findByName(liquorName);
        Liquor liquor = liquorList.size() > 1 ? liquorList.get(0): getOnlyOneLiquor(liquorList);       /** 해놓은 이유 향 후 변경 ***/
        return LiquorDetailsResponse.of(liquor);
    }

    /** 향후 변경 필요 **/
    private Liquor getOnlyOneLiquor(List<Liquor> liquorList) {
        return liquorList.get(0);
    }

}
