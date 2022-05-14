package liquor.graduation.DB;

import liquor.graduation.liquor.entity.Liquor;
import liquor.graduation.liquor.repository.LiquorRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DBTest {

    @Autowired
    LiquorRepository liquorRepository;

    // DB 연결 성공적
    @DisplayName("술 레코드를 가져옵니다.")
    @Test
    void getLiquors() {
        List<Liquor> liquorList = liquorRepository.findAll();
        Assertions.assertThat(liquorList.size()).isEqualTo(0);
    }
}
