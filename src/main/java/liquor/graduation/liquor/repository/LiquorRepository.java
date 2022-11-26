package liquor.graduation.liquor.repository;

import liquor.graduation.liquor.entity.Liquor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LiquorRepository extends JpaRepository<Liquor, Long> {
    List<Liquor> findByIdentifier(String liquorName);
}
